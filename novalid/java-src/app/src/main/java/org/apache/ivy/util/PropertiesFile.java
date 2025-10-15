package org.apache.ivy.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* loaded from: classes8.dex */
public class PropertiesFile extends Properties {
    public File file;
    public String header;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PropertiesFile(File file, String str) throws IOException {
        FileInputStream fileInputStream;
        Exception e;
        this.file = file;
        this.header = str;
        if (file.exists()) {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    load(fileInputStream);
                } catch (Exception e2) {
                    e = e2;
                    Message.warn("exception occurred while reading properties file " + file, e);
                    if (fileInputStream == null) {
                    }
                }
            } catch (Exception e3) {
                fileInputStream = null;
                e = e3;
            }
            if (fileInputStream == null) {
                try {
                    fileInputStream.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void save() throws IOException {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            if (this.file.getParentFile() != null && !this.file.getParentFile().exists()) {
                this.file.getParentFile().mkdirs();
            }
            fileOutputStream = new FileOutputStream(this.file);
            try {
                store(fileOutputStream, this.header);
            } catch (Exception e) {
                e = e;
                fileOutputStream2 = fileOutputStream;
                Message.warn("exception occurred while writing properties file " + this.file, e);
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream == null) {
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        if (fileOutputStream == null) {
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
