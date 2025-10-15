package org.apache.ivy.plugins.trigger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.event.IvyEvent;
import org.apache.ivy.core.resolve.ResolveProcessException;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.StringUtils;

/* loaded from: classes7.dex */
public class LogTrigger extends AbstractTrigger {
    public static final String LINE_SEPARATOR = System.lineSeparator();
    public String encoding;
    public String message = "";
    public File file = null;
    public boolean append = true;

    @Override // org.apache.ivy.core.event.IvyListener
    public void progress(IvyEvent ivyEvent) throws IOException {
        log(IvyPatternHelper.substituteVariables(this.message, ivyEvent.getAttributes()));
    }

    public void log(String str) throws IOException {
        Writer bufferedWriter;
        if (this.file == null) {
            Message.info(str);
            return;
        }
        Writer writer = null;
        try {
            try {
                String str2 = str + LINE_SEPARATOR;
                String absolutePath = this.file.getAbsolutePath();
                if (StringUtils.isNullOrEmpty(this.encoding)) {
                    bufferedWriter = new FileWriter(absolutePath, this.append);
                } else {
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(absolutePath, this.append), this.encoding));
                }
                writer = bufferedWriter;
                writer.write(str2, 0, str2.length());
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new ResolveProcessException(e);
                }
            } catch (IOException e2) {
                throw new ResolveProcessException(e2);
            }
        } catch (Throwable th) {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e3) {
                    throw new ResolveProcessException(e3);
                }
            }
            throw th;
        }
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setAppend(boolean z) {
        this.append = z;
    }

    public void setEncoding(String str) {
        this.encoding = str;
    }
}
