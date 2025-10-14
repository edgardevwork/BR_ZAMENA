package org.apache.commons.p059io;

import java.io.File;
import java.io.IOException;

/* loaded from: classes8.dex */
public class FileExistsException extends IOException {
    public static final long serialVersionUID = 1;

    public FileExistsException() {
    }

    public FileExistsException(String str) {
        super(str);
    }

    public FileExistsException(File file) {
        super("File " + file + " exists");
    }
}
