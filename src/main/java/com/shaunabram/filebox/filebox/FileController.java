package com.shaunabram.filebox.filebox;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;
import software.amazon.awssdk.core.sync.RequestBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class FileController {

    private Logger logger = LoggerFactory.getLogger(FileboxApplication.class);

    public FileController() {
        logger.info("In FileController()");
    }

    @PostMapping("/file")
    void newFile() {
        logger.info("Creating new file...");

        ProfileCredentialsProvider creds = ProfileCredentialsProvider.create("filebox");
        Region region = Region.US_WEST_2;
        S3Client s3 = S3Client.builder()
                .credentialsProvider(creds)
                .region(region)
                .build();

        String contents = "contents";
        String bucket = "filebox-shaunabram";
        String key = "testfile.txt";

        logger.info("Uploading new file to S3");
        s3.putObject(PutObjectRequest.builder().bucket(bucket).key(key)
                        .build(),
                RequestBody.fromString(contents));
        logger.info("Uploaded new file to S3 OK");
    }
}
