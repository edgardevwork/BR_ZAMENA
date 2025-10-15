package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import org.apache.commons.p059io.IOUtils;
import org.jfrog.build.api.util.Log;

/* loaded from: classes7.dex */
public class DownloadToFile extends DownloadBase<File> {
    public final String downloadTo;

    public DownloadToFile(String str, String str2, Map<String, String> map, Log log) {
        super(str, false, map, log);
        this.downloadTo = str2;
    }

    public static File saveInputStreamToFile(InputStream inputStream, String str) throws IOException {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        } else {
            file.getParentFile().mkdirs();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                IOUtils.copyLarge(inputStream, fileOutputStream);
                fileOutputStream.close();
                return file;
            } finally {
            }
        } catch (IOException e) {
            throw new IOException(String.format("Could not create nor write to file: %s", file.getCanonicalPath()), e);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [TResult, java.io.File] */
    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void setResponse(InputStream inputStream) throws IOException {
        this.result = saveInputStreamToFile(inputStream, this.downloadTo);
    }
}
