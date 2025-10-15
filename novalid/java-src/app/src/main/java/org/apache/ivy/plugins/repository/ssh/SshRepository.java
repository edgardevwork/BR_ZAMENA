package org.apache.ivy.plugins.repository.ssh;

import com.blackhub.bronline.game.gui.marketplace.MarketplaceKeys;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import org.apache.ivy.core.settings.TimeoutConstraint;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.plugins.repository.ssh.Scp;
import org.apache.ivy.util.Message;

/* loaded from: classes7.dex */
public class SshRepository extends AbstractSshBasedRepository {
    public static final String ARGUMENT_PLACEHOLDER = "%arg";
    public static final int BUFFER_SIZE = 65536;
    public static final int POLL_SLEEP_TIME = 500;
    public String createDirCommand;
    public String existCommand;
    public char fileSeparator;
    public String listCommand;
    public String publishPermissions;

    public SshRepository() {
        this.fileSeparator = '/';
        this.listCommand = "ls -1";
        this.existCommand = MarketplaceKeys.MARKETPLACE_PAGES_KEY;
        this.createDirCommand = "mkdir";
        this.publishPermissions = null;
    }

    public SshRepository(TimeoutConstraint timeoutConstraint) {
        super(timeoutConstraint);
        this.fileSeparator = '/';
        this.listCommand = "ls -1";
        this.existCommand = MarketplaceKeys.MARKETPLACE_PAGES_KEY;
        this.createDirCommand = "mkdir";
        this.publishPermissions = null;
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public Resource getResource(String str) {
        Message.debug("SShRepository:getResource called: " + str);
        return new SshResource(this, str);
    }

    public SshResource resolveResource(String str) {
        SshResource sshResource;
        Message.debug("SShRepository:resolveResource called: " + str);
        Session session = null;
        try {
            session = getSession(str);
            Scp.FileInfo fileinfo = new Scp(session).getFileinfo(new URI(str).getPath());
            sshResource = new SshResource(this, str, true, fileinfo.getLength(), fileinfo.getLastModified());
        } catch (IOException | URISyntaxException unused) {
            if (session != null) {
                releaseSession(session, str);
            }
            sshResource = new SshResource();
        } catch (RemoteScpException unused2) {
            sshResource = new SshResource();
        }
        Message.debug("SShRepository:resolveResource end.");
        return sshResource;
    }

    public final void readSessionOutput(ChannelExec channelExec, StringBuilder sb, StringBuilder sb2) throws InterruptedException, IOException {
        InputStream inputStream = channelExec.getInputStream();
        InputStream errStream = channelExec.getErrStream();
        try {
            channelExec.connect();
            byte[] bArr = new byte[65536];
            while (true) {
                int iAvailable = inputStream.available();
                if (iAvailable > 0) {
                    if (iAvailable > 65535) {
                        iAvailable = 65536;
                    }
                    sb.append(new String(bArr, 0, inputStream.read(bArr, 0, iAvailable)));
                } else {
                    while (true) {
                        int iAvailable2 = errStream.available();
                        if (iAvailable2 <= 0) {
                            break;
                        }
                        if (iAvailable2 > 65535) {
                            iAvailable2 = 65536;
                        }
                        sb2.append(new String(bArr, 0, errStream.read(bArr, 0, iAvailable2)));
                    }
                    if (channelExec.isClosed()) {
                        break;
                    } else {
                        try {
                            Thread.sleep(500L);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            while (true) {
                int iAvailable3 = inputStream.available();
                if (iAvailable3 <= 0) {
                    break;
                }
                if (iAvailable3 > 65535) {
                    iAvailable3 = 65536;
                }
                sb.append(new String(bArr, 0, inputStream.read(bArr, 0, iAvailable3)));
            }
            while (true) {
                int iAvailable4 = errStream.available();
                if (iAvailable4 <= 0) {
                    return;
                }
                if (iAvailable4 > 65535) {
                    iAvailable4 = 65536;
                }
                sb2.append(new String(bArr, 0, errStream.read(bArr, 0, iAvailable4)));
            }
        } catch (JSchException e) {
            throw new IOException("Channel connection problems", e);
        }
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public List<String> list(String str) throws InterruptedException, IOException {
        Message.debug("SShRepository:list called: " + str);
        ArrayList arrayList = new ArrayList();
        ChannelExec execChannel = getExecChannel(getSession(str));
        try {
            execChannel.setCommand(replaceArgument(this.listCommand, new URI(str).getPath()));
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            readSessionOutput(execChannel, sb, sb2);
            if (execChannel.getExitStatus() != 0) {
                Message.error("Ssh ListCommand exited with status != 0");
                Message.error(sb2.toString());
                return null;
            }
            BufferedReader bufferedReader = new BufferedReader(new StringReader(sb.toString()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return arrayList;
                }
                arrayList.add(line);
            }
        } catch (URISyntaxException e) {
            throw new IOException("The uri '" + str + "' is not valid!", e);
        }
    }

    public final ChannelExec getExecChannel(Session session) throws IOException {
        try {
            return session.openChannel("exec");
        } catch (JSchException unused) {
            throw new IOException();
        }
    }

    public final String replaceArgument(String str, String str2) {
        if (!str.contains(ARGUMENT_PLACEHOLDER)) {
            return str + " " + str2;
        }
        return str.replaceAll(ARGUMENT_PLACEHOLDER, str2);
    }

    @Override // org.apache.ivy.plugins.repository.AbstractRepository
    public void put(File file, String str, boolean z) throws URISyntaxException, IOException {
        String strSubstring;
        String strSubstring2;
        Message.debug("SShRepository:put called: " + str);
        Session session = getSession(str);
        try {
            try {
                String path = new URI(str).getPath();
                int iLastIndexOf = path.lastIndexOf(this.fileSeparator);
                if (iLastIndexOf == -1) {
                    strSubstring2 = null;
                    strSubstring = path;
                } else {
                    strSubstring = path.substring(iLastIndexOf + 1);
                    strSubstring2 = path.substring(0, iLastIndexOf);
                }
                if (!z && checkExistence(path, session)) {
                    throw new IOException("destination file exists and overwrite == false");
                }
                if (strSubstring2 != null) {
                    makePath(strSubstring2, session);
                }
                new Scp(session).put(file.getCanonicalPath(), strSubstring2, strSubstring, this.publishPermissions);
            } catch (IOException e) {
                if (session != null) {
                    releaseSession(session, str);
                }
                throw e;
            } catch (RemoteScpException e2) {
                throw new IOException(e2.getMessage());
            }
        } catch (URISyntaxException e3) {
            throw new IOException("The uri '" + str + "' is not valid!", e3);
        }
    }

    public final void makePath(String str, Session session) throws IOException {
        ChannelExec execChannel;
        while (true) {
            execChannel = null;
            try {
                if (str.length() <= 0 || str.charAt(str.length() - 1) != this.fileSeparator) {
                    break;
                } else {
                    str = str.substring(0, str.length() - 1);
                }
            } catch (Throwable th) {
                if (execChannel != null) {
                    execChannel.disconnect();
                }
                throw th;
            }
        }
        if (str.length() != 0 && !checkExistence(str, session)) {
            int iLastIndexOf = str.lastIndexOf(this.fileSeparator);
            if (iLastIndexOf > 0) {
                makePath(str.substring(0, iLastIndexOf), session);
            }
            execChannel = getExecChannel(session);
            String strReplaceArgument = replaceArgument(this.createDirCommand, str);
            Message.debug("SShRepository: trying to create path: " + strReplaceArgument);
            execChannel.setCommand(strReplaceArgument);
            readSessionOutput(execChannel, new StringBuilder(), new StringBuilder());
            execChannel.disconnect();
        }
    }

    public final boolean checkExistence(String str, Session session) throws InterruptedException, IOException {
        Message.debug("SShRepository: checkExistence called: " + str);
        ChannelExec execChannel = getExecChannel(session);
        execChannel.setCommand(replaceArgument(this.existCommand, str));
        readSessionOutput(execChannel, new StringBuilder(), new StringBuilder());
        return execChannel.getExitStatus() == 0;
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public void get(String str, File file) throws URISyntaxException, IOException, NumberFormatException {
        Message.debug("SShRepository:get called: " + str + " to " + file.getCanonicalPath());
        if (file.getParentFile() != null) {
            file.getParentFile().mkdirs();
        }
        Session session = getSession(str);
        try {
            try {
                new Scp(session).get(new URI(str).getPath(), file.getCanonicalPath());
            } catch (IOException e) {
                if (session != null) {
                    releaseSession(session, str);
                }
                throw e;
            } catch (RemoteScpException e2) {
                throw new IOException(e2.getMessage());
            }
        } catch (URISyntaxException e3) {
            throw new IOException("The uri '" + str + "' is not valid!", e3);
        }
    }

    public void setListCommand(String str) {
        this.listCommand = str.trim();
    }

    public String getListCommand() {
        return this.listCommand;
    }

    public String getCreateDirCommand() {
        return this.createDirCommand;
    }

    public void setCreateDirCommand(String str) {
        this.createDirCommand = str;
    }

    public String getExistCommand() {
        return this.existCommand;
    }

    public void setExistCommand(String str) {
        this.existCommand = str;
    }

    public void setFileSeparator(char c) {
        this.fileSeparator = c;
    }

    public void setPublishPermissions(String str) {
        this.publishPermissions = str;
    }

    @Override // org.apache.ivy.plugins.repository.ssh.AbstractSshBasedRepository
    public String getRepositoryScheme() {
        return "ssh";
    }

    public InputStream openStream(SshResource sshResource) throws URISyntaxException, IOException, NumberFormatException {
        Session session = getSession(sshResource.getName());
        Scp scp = new Scp(session);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            scp.get(sshResource.getName(), byteArrayOutputStream);
            return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            if (session != null) {
                releaseSession(session, sshResource.getName());
            }
            throw e;
        } catch (RemoteScpException e2) {
            throw new IOException(e2.getMessage());
        }
    }
}
