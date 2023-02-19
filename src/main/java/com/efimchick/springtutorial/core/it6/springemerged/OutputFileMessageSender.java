package com.efimchick.springtutorial.core.it6.springemerged;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

public class OutputFileMessageSender implements MessageSender {
    private String filename;

    public OutputFileMessageSender(final String filename, int i, double d) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    @Override
    public void send(String message) {
        Objects.requireNonNull(message);
        try {
            FileUtils.writeStringToFile(
                    new File(filename),
                    message,
                    Charset.defaultCharset(),
                    true
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
