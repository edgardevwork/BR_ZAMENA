package org.apache.ivy.plugins.repository.vsftp;

import com.blackhub.bronline.game.gui.marketplace.MarketplaceKeys;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;
import org.apache.ivy.Ivy;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.core.IvyThread;
import org.apache.ivy.core.event.IvyEvent;
import org.apache.ivy.core.event.IvyListener;
import org.apache.ivy.core.event.resolve.EndResolveEvent;
import org.apache.ivy.core.settings.TimeoutConstraint;
import org.apache.ivy.plugins.repository.AbstractRepository;
import org.apache.ivy.plugins.repository.BasicResource;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.util.Checks;
import org.apache.ivy.util.Message;

/* loaded from: classes5.dex */
public class VsftpRepository extends AbstractRepository {
    public static final int DEFAULT_READ_TIMEOUT = 30000;
    public static final int DEFAULT_REUSE_CONNECTION_TIME = 300000;
    public static final int DISCONNECT_COMMAND_TIMEOUT = 300;
    public static final int ERROR_SLEEP_TIME = 30;
    public static final SimpleDateFormat FORMAT = new SimpleDateFormat("MMM dd, yyyy HH:mm", Locale.US);
    public static final int GET_JOIN_MAX_TIME = 100;
    public static final int LS_DATE_INDEX1 = 4;
    public static final int LS_DATE_INDEX2 = 5;
    public static final int LS_DATE_INDEX3 = 6;
    public static final int LS_DATE_INDEX4 = 7;
    public static final int LS_PARTS_NUMBER = 9;
    public static final int LS_SIZE_INDEX = 3;
    public static final int MAX_READER_ALIVE_ATTEMPT = 5;
    public static final int MAX_READ_PROMPT_ATTEMPT = 5;
    public static final String PROMPT = "vsftp> ";
    public static final int PROMPT_SLEEP_TIME = 50;
    public static final int READER_ALIVE_SLEEP_TIME = 100;
    public static final int REUSE_CONNECTION_SLEEP_TIME = 10;
    public String authentication;
    public Thread connectionCleaner;
    public Reader err;
    public volatile StringBuilder errors;
    public volatile long errorsLastUpdateTime;
    public Thread errorsReader;
    public String host;

    /* renamed from: in */
    public Reader f10000in;
    public volatile boolean inCommand;
    public Ivy ivy;
    public volatile long lastCommand;
    public PrintWriter out;
    public Process process;
    public long readTimeout;
    public long reuseConnection;
    public String username;

    public VsftpRepository() {
        this.authentication = "gssapi";
        this.errors = new StringBuilder();
        this.readTimeout = 30000L;
        this.reuseConnection = 300000L;
        this.ivy = null;
    }

    public VsftpRepository(TimeoutConstraint timeoutConstraint) {
        super(timeoutConstraint);
        this.authentication = "gssapi";
        this.errors = new StringBuilder();
        this.readTimeout = 30000L;
        this.reuseConnection = 300000L;
        this.ivy = null;
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public Resource getResource(String str) throws IOException {
        initIvy();
        return new VsftpResource(this, str);
    }

    public final void initIvy() {
        this.ivy = IvyContext.getContext().getIvy();
    }

    public Resource getInitResource(String str) throws IOException {
        try {
            try {
                return lslToResource(str, sendCommand("ls -l " + str, true, true));
            } catch (IOException e) {
                cleanup(e);
                throw e;
            }
        } finally {
            cleanup();
        }
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public void get(final String str, File file) throws IOException {
        final File file2;
        initIvy();
        try {
            try {
                fireTransferInitiated(getResource(str), 5);
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    sendCommand("lcd " + parentFile.getAbsolutePath());
                }
                if (file.exists()) {
                    file.delete();
                }
                int iLastIndexOf = str.lastIndexOf(47);
                String strSubstring = iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
                if (parentFile == null) {
                    file2 = Checks.checkAbsolute(strSubstring, "source");
                } else {
                    file2 = new File(parentFile, strSubstring);
                }
                final IOException[] iOExceptionArr = new IOException[1];
                IvyThread ivyThread = new IvyThread() { // from class: org.apache.ivy.plugins.repository.vsftp.VsftpRepository.1
                    @Override // org.apache.ivy.core.IvyThread, java.lang.Thread, java.lang.Runnable
                    public void run() {
                        initContext();
                        try {
                            VsftpRepository.this.sendCommand("get " + str, VsftpRepository.this.getExpectedDownloadMessage(str, file2), 0L);
                        } catch (IOException e) {
                            iOExceptionArr[0] = e;
                        }
                    }
                };
                ivyThread.start();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = this.readTimeout;
                long j2 = 0;
                while (ivyThread.isAlive()) {
                    checkInterrupted();
                    long length = file2.exists() ? file2.length() : 0L;
                    if (length > j2) {
                        fireTransferProgress(length - j2);
                        jCurrentTimeMillis = System.currentTimeMillis();
                        j2 = length;
                    } else if (System.currentTimeMillis() - jCurrentTimeMillis > j) {
                        Message.verbose("download hang for more than " + j + "ms. Interrupting.");
                        ivyThread.interrupt();
                        if (file2.exists()) {
                            file2.delete();
                        }
                        throw new IOException(str + " download timeout from " + getHost());
                    }
                    try {
                        ivyThread.join(100L);
                    } catch (InterruptedException unused) {
                        if (file2.exists()) {
                            file2.delete();
                        }
                        cleanup();
                        return;
                    }
                }
                if (iOExceptionArr[0] != null) {
                    if (file2.exists()) {
                        file2.delete();
                    }
                    throw iOExceptionArr[0];
                }
                file2.renameTo(file);
                fireTransferCompleted(file.length());
                cleanup();
            } catch (IOException e) {
                fireTransferError(e);
                cleanup(e);
                throw e;
            }
        } catch (Throwable th) {
            cleanup();
            throw th;
        }
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public List<String> list(String str) throws IOException {
        initIvy();
        try {
            try {
                if (!str.endsWith("/")) {
                    str = str + "/";
                }
                String strSendCommand = sendCommand("ls -l " + str, true, true);
                if (!strSendCommand.startsWith(MarketplaceKeys.MARKETPLACE_PAGES_KEY)) {
                    String[] strArrSplit = strSendCommand.split(StringUtils.f9903LF);
                    ArrayList arrayList = new ArrayList(strArrSplit.length);
                    int length = strArrSplit.length;
                    for (int i = 0; i < length; i++) {
                        String strSubstring = strArrSplit[i];
                        while (true) {
                            if (!strSubstring.endsWith("\r") && !strSubstring.endsWith(StringUtils.f9903LF)) {
                                break;
                            }
                            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                        }
                        if (!strSubstring.trim().isEmpty()) {
                            arrayList.add(str + strSubstring.substring(strSubstring.lastIndexOf(32) + 1));
                        }
                    }
                    cleanup();
                    return arrayList;
                }
                cleanup();
                return null;
            } catch (IOException e) {
                cleanup(e);
                throw e;
            }
        } catch (Throwable th) {
            cleanup();
            throw th;
        }
    }

    @Override // org.apache.ivy.plugins.repository.AbstractRepository
    public void put(File file, String str, boolean z) throws IOException {
        String strSubstring;
        String name;
        initIvy();
        try {
            try {
                if (getResource(str).exists()) {
                    if (!z) {
                        return;
                    }
                    sendCommand("rm " + str, getExpectedRemoveMessage(str));
                }
                int iLastIndexOf = str.lastIndexOf(47);
                if (iLastIndexOf != -1) {
                    strSubstring = str.substring(0, iLastIndexOf);
                    mkdirs(strSubstring);
                    sendCommand("cd " + strSubstring);
                } else {
                    strSubstring = null;
                }
                if (strSubstring != null) {
                    name = strSubstring + "/" + file.getName();
                } else {
                    name = file.getName();
                }
                sendCommand("put " + file.getAbsolutePath(), getExpectedUploadMessage(file, name), 0L);
                sendCommand("mv " + name + " " + str);
            } catch (IOException e) {
                cleanup(e);
                throw e;
            }
        } finally {
            cleanup();
        }
    }

    public final void mkdirs(String str) throws IOException {
        if (dirExists(str)) {
            return;
        }
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf != -1) {
            mkdirs(str.substring(0, iLastIndexOf));
        }
        sendCommand("mkdir " + str);
    }

    public final boolean dirExists(String str) throws IOException {
        return !sendCommand("ls " + str, true).startsWith("ls: ");
    }

    public String sendCommand(String str) throws IOException {
        return sendCommand(str, false, this.readTimeout);
    }

    public void sendCommand(String str, Pattern pattern) throws IOException {
        sendCommand(str, pattern, this.readTimeout);
    }

    public void sendCommand(String str, Pattern pattern, long j) throws IOException {
        String strSendCommand = sendCommand(str, true, j);
        if (pattern.matcher(strSendCommand).matches()) {
            return;
        }
        Message.debug("invalid response from server:");
        Message.debug("expected: '" + pattern + "'");
        Message.debug("was:      '" + strSendCommand + "'");
        throw new IOException(strSendCommand);
    }

    public String sendCommand(String str, boolean z) throws IOException {
        return sendCommand(str, z, this.readTimeout);
    }

    public String sendCommand(String str, boolean z, boolean z2) throws IOException {
        return sendCommand(str, z, z2, this.readTimeout);
    }

    public String sendCommand(String str, boolean z, long j) throws IOException {
        return sendCommand(str, z, false, j);
    }

    public String sendCommand(String str, boolean z, boolean z2, long j) throws IOException {
        checkInterrupted();
        this.inCommand = true;
        this.errorsLastUpdateTime = 0L;
        synchronized (this) {
            ensureConnectionOpened();
            Message.debug("sending command '" + str + "' to " + getHost());
            updateLastCommandTime();
            this.out.println(str);
            this.out.flush();
        }
        try {
            return readResponse(z, j);
        } finally {
            this.inCommand = false;
        }
    }

    public String readResponse(boolean z) throws IOException {
        return readResponse(z, this.readTimeout);
    }

    public synchronized String readResponse(final boolean z, long j) throws IOException {
        final StringBuilder sb;
        IvyThread ivyThread;
        try {
            sb = new StringBuilder();
            final IOException[] iOExceptionArr = new IOException[1];
            final boolean[] zArr = new boolean[1];
            Runnable runnable = new Runnable() { // from class: org.apache.ivy.plugins.repository.vsftp.VsftpRepository.2
                @Override // java.lang.Runnable
                public void run() {
                    VsftpRepository vsftpRepository;
                    synchronized (VsftpRepository.this) {
                        boolean z2 = false;
                        int i = 0;
                        while (!z2 && i < 5) {
                            while (true) {
                                try {
                                    try {
                                        int i2 = VsftpRepository.this.f10000in.read();
                                        if (i2 == -1) {
                                            break;
                                        }
                                        sb.append((char) i2);
                                        if (sb.length() >= 7) {
                                            StringBuilder sb2 = sb;
                                            if (sb2.substring(sb2.length() - 7, sb.length()).equals(VsftpRepository.PROMPT)) {
                                                StringBuilder sb3 = sb;
                                                sb3.setLength(sb3.length() - 7);
                                                i = 0;
                                                z2 = true;
                                                break;
                                            }
                                        }
                                        i = 0;
                                    } catch (IOException e) {
                                        iOExceptionArr[0] = e;
                                        vsftpRepository = VsftpRepository.this;
                                    }
                                } catch (Throwable th) {
                                    VsftpRepository.this.notify();
                                    throw th;
                                }
                            }
                            if (!z2) {
                                try {
                                    Thread.sleep(50L);
                                } catch (InterruptedException unused) {
                                }
                            }
                            i++;
                        }
                        if (z2) {
                            if (VsftpRepository.this.errorsLastUpdateTime == 0) {
                                VsftpRepository vsftpRepository2 = VsftpRepository.this;
                                vsftpRepository2.errorsLastUpdateTime = vsftpRepository2.lastCommand;
                            }
                            while (System.currentTimeMillis() - VsftpRepository.this.errorsLastUpdateTime < 50) {
                                try {
                                    Thread.sleep(30L);
                                } catch (InterruptedException unused2) {
                                }
                            }
                        }
                        if (VsftpRepository.this.errors.length() > 0) {
                            if (z) {
                                sb.append((CharSequence) VsftpRepository.this.errors);
                                VsftpRepository.this.errors.setLength(0);
                            } else {
                                throw new IOException(VsftpRepository.chomp(VsftpRepository.this.errors).toString());
                            }
                        }
                        VsftpRepository.chomp(sb);
                        zArr[0] = true;
                        vsftpRepository = VsftpRepository.this;
                        vsftpRepository.notify();
                    }
                }
            };
            if (j == 0) {
                runnable.run();
                ivyThread = null;
            } else {
                ivyThread = new IvyThread(runnable);
                ivyThread.start();
                try {
                    wait(j);
                } catch (InterruptedException unused) {
                }
            }
            updateLastCommandTime();
            IOException iOException = iOExceptionArr[0];
            if (iOException != null) {
                throw iOException;
            }
            if (!zArr[0]) {
                if (ivyThread != null && ivyThread.isAlive()) {
                    ivyThread.interrupt();
                    for (int i = 0; i < 5 && ivyThread.isAlive(); i++) {
                        try {
                            Thread.sleep(100L);
                        } catch (InterruptedException unused2) {
                        }
                    }
                    if (ivyThread.isAlive()) {
                        ivyThread.stop();
                    }
                }
                throw new IOException("connection timeout to " + getHost());
            }
            if ("Not connected.".equals(sb.toString())) {
                Message.info("vsftp connection to " + getHost() + " reset");
                closeConnection();
                throw new IOException("not connected to " + getHost());
            }
            Message.debug("received response '" + ((Object) sb) + "' from " + getHost());
        } catch (Throwable th) {
            throw th;
        }
        return sb.toString();
    }

    public final synchronized void sendSingleCommand(String str) throws IOException {
        exec(getSingleCommand(str));
    }

    public synchronized void ensureConnectionOpened() throws IOException {
        try {
            if (this.f10000in == null) {
                Message.verbose("connecting to " + getUsername() + "@" + getHost() + "... ");
                exec(getConnectionCommand());
                try {
                    readResponse(false);
                    if (this.reuseConnection > 0) {
                        IvyThread ivyThread = new IvyThread() { // from class: org.apache.ivy.plugins.repository.vsftp.VsftpRepository.3
                            @Override // org.apache.ivy.core.IvyThread, java.lang.Thread, java.lang.Runnable
                            public void run() throws InterruptedException {
                                initContext();
                                long jCurrentTimeMillis = 10;
                                while (VsftpRepository.this.f10000in != null && jCurrentTimeMillis > 0) {
                                    try {
                                        Thread.sleep(jCurrentTimeMillis);
                                        jCurrentTimeMillis = VsftpRepository.this.reuseConnection - (System.currentTimeMillis() - VsftpRepository.this.lastCommand);
                                        if (VsftpRepository.this.inCommand && jCurrentTimeMillis <= 0) {
                                            jCurrentTimeMillis = VsftpRepository.this.reuseConnection;
                                        }
                                    } catch (InterruptedException unused) {
                                    }
                                }
                                VsftpRepository.this.disconnect();
                            }
                        };
                        this.connectionCleaner = ivyThread;
                        ivyThread.start();
                    }
                    Ivy ivy = this.ivy;
                    if (ivy != null) {
                        ivy.getEventManager().addIvyListener(new IvyListener() { // from class: org.apache.ivy.plugins.repository.vsftp.VsftpRepository.4
                            @Override // org.apache.ivy.core.event.IvyListener
                            public void progress(IvyEvent ivyEvent) {
                                VsftpRepository.this.disconnect();
                                ivyEvent.getSource().removeIvyListener(this);
                            }
                        }, EndResolveEvent.NAME);
                    }
                    Message.verbose("connected to " + getHost());
                } catch (IOException e) {
                    closeConnection();
                    throw new IOException("impossible to connect to " + getUsername() + "@" + getHost() + " using " + getAuthentication() + ": " + e.getMessage());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void updateLastCommandTime() {
        this.lastCommand = System.currentTimeMillis();
    }

    public final void exec(String str) throws IOException {
        Message.debug("launching '" + str + "'");
        this.process = Runtime.getRuntime().exec(str);
        this.f10000in = new InputStreamReader(this.process.getInputStream());
        this.err = new InputStreamReader(this.process.getErrorStream());
        this.out = new PrintWriter(this.process.getOutputStream());
        IvyThread ivyThread = new IvyThread() { // from class: org.apache.ivy.plugins.repository.vsftp.VsftpRepository.5
            @Override // org.apache.ivy.core.IvyThread, java.lang.Thread, java.lang.Runnable
            public void run() {
                int i;
                initContext();
                while (VsftpRepository.this.err != null && (i = VsftpRepository.this.err.read()) != -1) {
                    try {
                        VsftpRepository.this.errors.append((char) i);
                        VsftpRepository.this.errorsLastUpdateTime = System.currentTimeMillis();
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
        };
        this.errorsReader = ivyThread;
        ivyThread.start();
    }

    public final void checkInterrupted() {
        Ivy ivy = this.ivy;
        if (ivy != null) {
            ivy.checkInterrupted();
        }
    }

    public final void cleanup(Exception exc) {
        if (exc.getMessage().equals("connection timeout to " + getHost())) {
            closeConnection();
        } else {
            disconnect();
        }
    }

    public final void cleanup() {
        if (this.reuseConnection == 0) {
            disconnect();
        }
    }

    public synchronized void disconnect() {
        String str;
        try {
            if (this.f10000in != null) {
                Message.verbose("disconnecting from " + getHost() + "... ");
                try {
                    sendCommand("exit", false, 300L);
                    closeConnection();
                    str = "disconnected of " + getHost();
                } catch (IOException unused) {
                    closeConnection();
                    str = "disconnected of " + getHost();
                } catch (Throwable th) {
                    closeConnection();
                    Message.verbose("disconnected of " + getHost());
                    throw th;
                }
                Message.verbose(str);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void closeConnection() {
        try {
            Thread thread = this.connectionCleaner;
            if (thread != null) {
                thread.interrupt();
            }
            Thread thread2 = this.errorsReader;
            if (thread2 != null) {
                thread2.interrupt();
            }
            try {
                this.process.destroy();
            } catch (Exception unused) {
            }
            try {
                this.f10000in.close();
            } catch (Exception unused2) {
            }
            try {
                this.err.close();
            } catch (Exception unused3) {
            }
            try {
                this.out.close();
            } catch (Exception unused4) {
            }
            this.connectionCleaner = null;
            this.errorsReader = null;
            this.process = null;
            this.f10000in = null;
            this.out = null;
            this.err = null;
            Message.debug("connection to " + getHost() + " closed");
        } catch (Throwable th) {
            throw th;
        }
    }

    public Resource lslToResource(String str, String str2) throws NumberFormatException {
        if (str2 == null || str2.startsWith(MarketplaceKeys.MARKETPLACE_PAGES_KEY)) {
            return new BasicResource(str, false, 0L, 0L, false);
        }
        String[] strArrSplit = str2.split("\\s+");
        if (strArrSplit.length != 9) {
            Message.debug("unrecognized ls format: " + str2);
            return new BasicResource(str, false, 0L, 0L, false);
        }
        try {
            return new BasicResource(str, true, Long.parseLong(strArrSplit[3]), FORMAT.parse(strArrSplit[4] + " " + strArrSplit[5] + " " + strArrSplit[6] + " " + strArrSplit[7]).getTime(), false);
        } catch (Exception e) {
            Message.warn("impossible to parse server response: " + str2, e);
            return new BasicResource(str, false, 0L, 0L, false);
        }
    }

    public String getSingleCommand(String str) {
        return "vsh -noprompt -auth " + this.authentication + " " + this.username + "@" + this.host + " " + str;
    }

    public String getConnectionCommand() {
        return "vsftp -noprompt -auth " + this.authentication + " " + this.username + "@" + this.host;
    }

    public Pattern getExpectedDownloadMessage(String str, File file) {
        return Pattern.compile("Downloading " + file.getName() + " from [^\\s]+");
    }

    public Pattern getExpectedRemoveMessage(String str) {
        return Pattern.compile("Removing [^\\s]+");
    }

    public Pattern getExpectedUploadMessage(File file, String str) {
        return Pattern.compile("Uploading " + file.getName() + " to [^\\s]+");
    }

    public String getAuthentication() {
        return this.authentication;
    }

    public void setAuthentication(String str) {
        this.authentication = str;
    }

    public String getHost() {
        return this.host;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    public static StringBuilder chomp(StringBuilder sb) {
        if (sb == null || sb.length() == 0) {
            return sb;
        }
        while (true) {
            if (!StringUtils.f9903LF.equals(sb.substring(sb.length() - 1)) && !"\r".equals(sb.substring(sb.length() - 1))) {
                return sb;
            }
            sb.setLength(sb.length() - 1);
        }
    }

    @Override // org.apache.ivy.plugins.repository.AbstractRepository
    public String toString() {
        return getName() + " " + getUsername() + "@" + getHost() + " (" + getAuthentication() + ")";
    }

    public void setReuseConnection(long j) {
        this.reuseConnection = j;
    }

    public long getReadTimeout() {
        return this.readTimeout;
    }

    public void setReadTimeout(long j) {
        this.readTimeout = j;
    }
}
