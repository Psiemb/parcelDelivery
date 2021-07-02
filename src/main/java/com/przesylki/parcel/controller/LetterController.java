package com.przesylki.parcel.controller;

import com.przesylki.parcel.api.letter.addLetter.request.LetterRequest;
import com.przesylki.parcel.api.letter.getAll.response.LetterInfo;
import com.przesylki.parcel.dao.entity.Letter;
import com.przesylki.parcel.manager.LetterManager;
import com.przesylki.parcel.mapper.LetterInfoMapper;
import com.przesylki.parcel.mapper.LetterRequestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Properties;


@RestController
public class LetterController {

    private final LetterManager letterManager;
    private final LetterRequestMapper letterRequestMapper;

    @Autowired
    public LetterController(LetterManager letterManager, LetterRequestMapper letterRequestMapper) {
        this.letterManager = letterManager;
        this.letterRequestMapper = letterRequestMapper;
    }

    @PostMapping("/addLetter")
    public ResponseEntity<Void> addLetter(@RequestBody @Valid LetterRequest letterRequest) {
        if (Objects.isNull(letterRequest)) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

        Letter letter = letterRequestMapper.mapToLetter(letterRequest);
        letterManager.add(letter);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/getAll")
    public ResponseEntity<LetterInfo> getAll() {

        Iterable<Letter> all = letterManager.getAll();

        List<Letter> result = new ArrayList<>();
        all.forEach(result::add);

        LetterInfoMapper letterInfoMapper = new LetterInfoMapper();
        LetterInfo letterInfo = letterInfoMapper.mapToResponse(result);

        return ResponseEntity.status(HttpStatus.OK).body(letterInfo);
    }

    @PostMapping("/email")
    public void emailToBeSend(){
        String to = "psiemb@tlen.pl";
        String from ="psar1987@wp.pl";

        Properties prop = new Properties();
        prop.put("mail.smtp.auth", true);
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", "smtp.wp.pl");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.ssl.trust", "smtp.wp.pl");

        Session session = Session.getDefaultInstance(prop, new Authenticator()
        {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("psar1987@wp.pl", "Psar7891!PS");
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, new InternetAddress[]{new InternetAddress(to)});
            message.setSubject("Mail Subject");
            message.setText("This is test mail");
//            String msg = "This is my first email using JavaMailer";

//            MimeBodyPart mimeBodyPart = new MimeBodyPart();
//            mimeBodyPart.setContent(msg, "text/html");
//
//            Multipart multipart = new MimeMultipart();
//            multipart.addBodyPart(mimeBodyPart);
//
//            message.setContent(multipart);

            Transport.send(message);
            System.out.println("Send messege succesfully.....");
        }
        catch (MessagingException mex){
            mex.printStackTrace();

        }
    }

}

