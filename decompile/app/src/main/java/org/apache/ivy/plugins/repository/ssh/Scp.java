package org.apache.ivy.plugins.repository.ssh;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.lang3.StringUtils;

/* loaded from: classes6.dex */
public class Scp {
    public static final int BUFFER_SIZE = 65536;
    public static final int CLINE_SPACE_INDEX1 = 4;
    public static final int CLINE_SPACE_INDEX2 = 5;
    public static final int DEFAULT_LINE_BUFFER_LENGTH = 30;
    public static final int MAX_SCP_LINE_LENGTH = 8192;
    public static final int MIN_C_LINE_LENGTH = 8;
    public static final int MIN_TLINE_LENGTH = 8;
    public static final int MODE_LENGTH = 4;
    public static final int SEND_BYTES_BUFFER_LENGTH = 512;
    public static final int SEND_FILE_BUFFER_LENGTH = 40000;
    public Session session;

    public class FileInfo {
        public String filename;
        public long lastModified;
        public long length;

        public FileInfo() {
        }

        public void setFilename(String str) {
            this.filename = str;
        }

        public String getFilename() {
            return this.filename;
        }

        public void setLength(long j) {
            this.length = j;
        }

        public long getLength() {
            return this.length;
        }

        public void setLastModified(long j) {
            this.lastModified = j;
        }

        public long getLastModified() {
            return this.lastModified;
        }
    }

    public Scp(Session session) {
        if (session == null) {
            throw new IllegalArgumentException("Cannot accept null argument!");
        }
        this.session = session;
    }

    public final void readResponse(InputStream inputStream) throws RemoteScpException, IOException {
        int i = inputStream.read();
        if (i == 0) {
            return;
        }
        if (i == -1) {
            throw new RemoteScpException("Remote scp terminated unexpectedly.");
        }
        if (i != 1 && i != 2) {
            throw new RemoteScpException("Remote scp sent illegal error code.");
        }
        if (i == 2) {
            throw new RemoteScpException("Remote scp terminated with error.");
        }
        throw new RemoteScpException("Remote scp terminated with error (" + receiveLine(inputStream) + ").");
    }

    public final String receiveLine(InputStream inputStream) throws RemoteScpException, IOException {
        StringBuilder sb = new StringBuilder(30);
        while (sb.length() <= 8192) {
            int i = inputStream.read();
            if (i < 0) {
                throw new RemoteScpException("Remote scp terminated unexpectedly.");
            }
            if (i != 10) {
                sb.append((char) i);
            } else {
                return sb.toString();
            }
        }
        throw new RemoteScpException("Remote scp sent a too long line");
    }

    public final void parseCLine(String str, FileInfo fileInfo) throws RemoteScpException, NumberFormatException {
        if (str.length() < 8) {
            throw new RemoteScpException("Malformed C line sent by remote SCP binary, line too short.");
        }
        if (str.charAt(4) != ' ' || str.charAt(5) == ' ') {
            throw new RemoteScpException("Malformed C line sent by remote SCP binary.");
        }
        int iIndexOf = str.indexOf(32, 5);
        if (iIndexOf == -1) {
            throw new RemoteScpException("Malformed C line sent by remote SCP binary.");
        }
        String strSubstring = str.substring(5, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring.length() <= 0 || strSubstring2.length() <= 0) {
            throw new RemoteScpException("Malformed C line sent by remote SCP binary.");
        }
        if (strSubstring.length() + 6 + strSubstring2.length() != str.length()) {
            throw new RemoteScpException("Malformed C line sent by remote SCP binary.");
        }
        try {
            long j = Long.parseLong(strSubstring);
            if (j < 0) {
                throw new RemoteScpException("Malformed C line sent by remote SCP binary, illegal file length.");
            }
            fileInfo.setLength(j);
            fileInfo.setFilename(strSubstring2);
        } catch (NumberFormatException unused) {
            throw new RemoteScpException("Malformed C line sent by remote SCP binary, cannot parse file length.");
        }
    }

    public final void parseTLine(String str, FileInfo fileInfo) throws RemoteScpException, NumberFormatException {
        if (str.length() < 8) {
            throw new RemoteScpException("Malformed T line sent by remote SCP binary, line too short.");
        }
        int iIndexOf = str.indexOf(" ");
        int i = iIndexOf + 1;
        if (i == 0 || i >= str.length()) {
            throw new RemoteScpException("Malformed T line sent by remote SCP binary, line not enough data.");
        }
        int iIndexOf2 = str.indexOf(" ", iIndexOf + 2);
        int i2 = iIndexOf2 + 1;
        if (i2 == 0 || i2 >= str.length()) {
            throw new RemoteScpException("Malformed T line sent by remote SCP binary, line not enough data.");
        }
        int iIndexOf3 = str.indexOf(" ", iIndexOf2 + 2);
        int i3 = iIndexOf3 + 1;
        if (i3 == 0 || i3 >= str.length()) {
            throw new RemoteScpException("Malformed T line sent by remote SCP binary, line not enough data.");
        }
        try {
            long j = Long.parseLong(str.substring(0, iIndexOf));
            long j2 = Long.parseLong(str.substring(i, iIndexOf2));
            long j3 = Long.parseLong(str.substring(i2, iIndexOf3));
            long j4 = Long.parseLong(str.substring(i3));
            if (j < 0 || j2 < 0 || j3 < 0 || j4 < 0) {
                throw new RemoteScpException("Malformed C line sent by remote SCP binary, illegal file length.");
            }
            fileInfo.setLastModified(j);
        } catch (NumberFormatException unused) {
            throw new RemoteScpException("Malformed C line sent by remote SCP binary, cannot parse file length.");
        }
    }

    public final void sendFile(Channel channel, String str, String str2, String str3) throws RemoteScpException, IOException {
        byte[] bArr = new byte[65536];
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(channel.getOutputStream(), 40000);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(channel.getInputStream(), 512);
        try {
            if (channel.isConnected()) {
                channel.start();
            } else {
                channel.connect();
            }
            readResponse(bufferedInputStream);
            File file = new File(str);
            long length = file.length();
            if (str3 == null) {
                str3 = "0600";
            }
            bufferedOutputStream.write(("C" + str3 + " " + length + " " + str2 + StringUtils.f9903LF).getBytes());
            bufferedOutputStream.flush();
            readResponse(bufferedInputStream);
            FileInputStream fileInputStream = new FileInputStream(file);
            while (length > 0) {
                int i = length > ((long) 65536) ? 65536 : (int) length;
                try {
                    if (fileInputStream.read(bArr, 0, i) != i) {
                        throw new IOException("Cannot read enough from local file " + str);
                    }
                    bufferedOutputStream.write(bArr, 0, i);
                    length -= i;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            fileInputStream.close();
            bufferedOutputStream.write(0);
            bufferedOutputStream.flush();
            readResponse(bufferedInputStream);
            bufferedOutputStream.write("E\n".getBytes());
            bufferedOutputStream.flush();
        } catch (JSchException e) {
            throw new IOException("Channel connection problems", e);
        }
    }

    public final FileInfo receiveStream(Channel channel, String str, OutputStream outputStream) throws RemoteScpException, IOException, NumberFormatException {
        byte[] bArr = new byte[65536];
        OutputStream outputStream2 = channel.getOutputStream();
        InputStream inputStream = channel.getInputStream();
        try {
            if (channel.isConnected()) {
                channel.start();
            } else {
                channel.connect();
            }
            outputStream2.write(0);
            outputStream2.flush();
            FileInfo fileInfo = new FileInfo();
            while (true) {
                int i = inputStream.read();
                if (i < 0) {
                    throw new RemoteScpException("Remote scp terminated unexpectedly.");
                }
                String strReceiveLine = receiveLine(inputStream);
                if (i != 84) {
                    if (i == 1 || i == 2) {
                        throw new RemoteScpException("Remote SCP error: " + strReceiveLine);
                    }
                    if (i != 67) {
                        throw new RemoteScpException("Remote SCP error: " + ((char) i) + strReceiveLine);
                    }
                    parseCLine(strReceiveLine, fileInfo);
                    if (outputStream != null) {
                        outputStream2.write(0);
                        outputStream2.flush();
                        try {
                            long length = fileInfo.getLength();
                            while (length > 0) {
                                int i2 = inputStream.read(bArr, 0, length > ((long) 65536) ? 65536 : (int) length);
                                if (i2 < 0) {
                                    throw new IOException("Remote scp terminated connection unexpectedly");
                                }
                                outputStream.write(bArr, 0, i2);
                                length -= i2;
                            }
                            outputStream.close();
                            readResponse(inputStream);
                            outputStream2.write(0);
                            outputStream2.flush();
                        } catch (IOException e) {
                            outputStream.close();
                            throw e;
                        }
                    }
                    return fileInfo;
                }
                parseTLine(strReceiveLine, fileInfo);
                outputStream2.write(0);
                outputStream2.flush();
            }
        } catch (JSchException e2) {
            throw new IOException("Channel connection problems", e2);
        }
    }

    public final ChannelExec getExecChannel() throws JSchException {
        return this.session.openChannel("exec");
    }

    public void put(String str, String str2, String str3, String str4) throws RemoteScpException, IOException {
        ChannelExec execChannel;
        if (str == null || str3 == null) {
            throw new IllegalArgumentException("Null argument.");
        }
        if (str4 != null) {
            if (str4.length() != 4) {
                throw new IllegalArgumentException("Invalid mode.");
            }
            for (char c : str4.toCharArray()) {
                if (!Character.isDigit(c)) {
                    throw new IllegalArgumentException("Invalid mode.");
                }
            }
        }
        String str5 = str4 != null ? "scp -t -p " : "scp -t ";
        if (str2 != null && str2.length() > 0) {
            str5 = str5 + "-d " + str2;
        }
        try {
            execChannel = getExecChannel();
        } catch (JSchException e) {
            e = e;
            execChannel = null;
        }
        try {
            execChannel.setCommand(str5);
            sendFile(execChannel, str, str3, str4);
            execChannel.disconnect();
        } catch (JSchException e2) {
            e = e2;
            if (execChannel != null) {
                execChannel.disconnect();
            }
            throw new IOException("Error during SCP transfer." + e.getMessage(), e);
        }
    }

    public void get(String str, String str2) throws RemoteScpException, IOException, NumberFormatException {
        get(str, new FileOutputStream(new File(str2)));
    }

    public void get(String str, OutputStream outputStream) throws RemoteScpException, IOException, NumberFormatException {
        ChannelExec execChannel;
        if (str == null || outputStream == null) {
            throw new IllegalArgumentException("Null argument.");
        }
        String str2 = "scp -p -f " + str;
        try {
            execChannel = getExecChannel();
            try {
                execChannel.setCommand(str2);
                receiveStream(execChannel, str, outputStream);
                execChannel.disconnect();
            } catch (JSchException e) {
                e = e;
                if (execChannel != null) {
                    execChannel.disconnect();
                }
                throw new IOException("Error during SCP transfer. " + e.getMessage(), e);
            }
        } catch (JSchException e2) {
            e = e2;
            execChannel = null;
        }
    }

    public FileInfo getFileinfo(String str) throws Throwable {
        if (str == null) {
            throw new IllegalArgumentException("Null argument.");
        }
        String str2 = "scp -p -f \"" + str + "\"";
        ChannelExec channelExec = null;
        try {
            try {
                ChannelExec execChannel = getExecChannel();
                try {
                    execChannel.setCommand(str2);
                    FileInfo fileInfoReceiveStream = receiveStream(execChannel, str, null);
                    execChannel.disconnect();
                    execChannel.disconnect();
                    return fileInfoReceiveStream;
                } catch (JSchException e) {
                    e = e;
                    throw new IOException("Error during SCP transfer. " + e.getMessage(), e);
                } catch (Throwable th) {
                    th = th;
                    channelExec = execChannel;
                    if (channelExec != null) {
                        channelExec.disconnect();
                    }
                    throw th;
                }
            } catch (JSchException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
