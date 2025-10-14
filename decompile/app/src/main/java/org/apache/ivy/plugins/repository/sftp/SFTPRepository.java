package org.apache.ivy.plugins.repository.sftp;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpATTRS;
import com.jcraft.jsch.SftpException;
import com.jcraft.jsch.SftpProgressMonitor;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import org.apache.ivy.core.settings.TimeoutConstraint;
import org.apache.ivy.plugins.repository.BasicResource;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.plugins.repository.ssh.AbstractSshBasedRepository;
import org.apache.ivy.plugins.repository.ssh.SshCache;
import org.apache.ivy.util.Message;

/* loaded from: classes7.dex */
public class SFTPRepository extends AbstractSshBasedRepository {
    public static final long MILLIS_PER_SECOND = 1000;

    /* loaded from: classes6.dex */
    public final class MyProgressMonitor implements SftpProgressMonitor {
        public long totalLength;

        public MyProgressMonitor() {
        }

        public void init(int i, String str, String str2, long j) {
            this.totalLength = j;
            SFTPRepository.this.fireTransferStarted(j);
        }

        public void end() {
            SFTPRepository.this.fireTransferCompleted(this.totalLength);
        }

        public boolean count(long j) {
            SFTPRepository.this.fireTransferProgress(j);
            return true;
        }
    }

    public SFTPRepository() {
    }

    public SFTPRepository(TimeoutConstraint timeoutConstraint) {
        super(timeoutConstraint);
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public Resource getResource(String str) {
        return new SFTPResource(this, str);
    }

    public Resource resolveResource(String str) {
        try {
            Vector vectorLs = getSftpChannel(str).ls(getPath(str));
            if (vectorLs != null) {
                return new BasicResource(str, true, ((ChannelSftp.LsEntry) vectorLs.get(0)).getAttrs().getSize(), r0.getMTime() * 1000, false);
            }
        } catch (Exception e) {
            Message.debug("Error while resolving resource " + str, e);
        }
        return new BasicResource(str, false, 0L, 0L, false);
    }

    public InputStream openStream(SFTPResource sFTPResource) throws URISyntaxException, IOException {
        String str;
        try {
            return getSftpChannel(sFTPResource.getName()).get(getPath(sFTPResource.getName()));
        } catch (SftpException | URISyntaxException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("impossible to open stream for ");
            sb.append(sFTPResource);
            sb.append(" on ");
            sb.append(getHost());
            if (e.getMessage() != null) {
                str = ": " + e.getMessage();
            } else {
                str = "";
            }
            sb.append(str);
            throw new IOException(sb.toString(), e);
        }
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public void get(String str, File file) throws URISyntaxException, IOException {
        String str2;
        fireTransferInitiated(getResource(str), 5);
        try {
            getSftpChannel(str).get(getPath(str), file.getAbsolutePath(), new MyProgressMonitor());
        } catch (URISyntaxException | SftpException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("impossible to get ");
            sb.append(str);
            sb.append(" on ");
            sb.append(getHost());
            if (e.getMessage() != null) {
                str2 = ": " + e.getMessage();
            } else {
                str2 = "";
            }
            sb.append(str2);
            throw new IOException(sb.toString(), e);
        }
    }

    @Override // org.apache.ivy.plugins.repository.AbstractRepository
    public void put(File file, String str, boolean z) throws URISyntaxException, IOException {
        fireTransferInitiated(getResource(str), 6);
        ChannelSftp sftpChannel = getSftpChannel(str);
        try {
            String path = getPath(str);
            if (!z && checkExistence(path, sftpChannel)) {
                throw new IOException("destination file exists and overwrite == false");
            }
            if (path.indexOf(47) != -1) {
                mkdirs(path.substring(0, path.lastIndexOf(47)), sftpChannel);
            }
            sftpChannel.put(file.getAbsolutePath(), path, new MyProgressMonitor());
        } catch (URISyntaxException e) {
            e = e;
            throw new IOException(e.getMessage(), e);
        } catch (SftpException e2) {
            e = e2;
            throw new IOException(e.getMessage(), e);
        }
    }

    public final void mkdirs(String str, ChannelSftp channelSftp) throws SftpException {
        try {
            SftpATTRS sftpATTRSStat = channelSftp.stat(str);
            if (sftpATTRSStat != null) {
                sftpATTRSStat.isDir();
            }
        } catch (SftpException unused) {
            if (str.indexOf(47) != -1) {
                mkdirs(str.substring(0, str.lastIndexOf(47)), channelSftp);
            }
            channelSftp.mkdir(str);
        }
    }

    public final String getPath(String str) throws URISyntaxException {
        String path = new URI(str).getPath();
        if (path != null) {
            return path;
        }
        throw new URISyntaxException(str, "Missing path in URI.");
    }

    @Override // org.apache.ivy.plugins.repository.Repository
    public List<String> list(String str) throws IOException {
        try {
            ChannelSftp sftpChannel = getSftpChannel(str);
            String path = getPath(str);
            Vector<ChannelSftp.LsEntry> vectorLs = sftpChannel.ls(path);
            if (vectorLs == null) {
                return null;
            }
            if (!path.endsWith("/")) {
                path = str + "/";
            }
            ArrayList arrayList = new ArrayList();
            for (ChannelSftp.LsEntry lsEntry : vectorLs) {
                if (!".".equals(lsEntry.getFilename()) && !"..".equals(lsEntry.getFilename())) {
                    arrayList.add(path + lsEntry.getFilename());
                }
            }
            return arrayList;
        } catch (SftpException e) {
            e = e;
            throw new IOException("Failed to return a listing for '" + str + "'", e);
        } catch (URISyntaxException e2) {
            e = e2;
            throw new IOException("Failed to return a listing for '" + str + "'", e);
        }
    }

    public final boolean checkExistence(String str, ChannelSftp channelSftp) {
        try {
            return channelSftp.stat(str) != null;
        } catch (SftpException unused) {
            return false;
        }
    }

    public final ChannelSftp getSftpChannel(String str) throws URISyntaxException, IOException {
        Session session = getSession(str);
        String host = session.getHost();
        ChannelSftp channelSftp = SshCache.getInstance().getChannelSftp(session);
        if (channelSftp != null) {
            return channelSftp;
        }
        try {
            ChannelSftp channelSftpOpenChannel = session.openChannel("sftp");
            channelSftpOpenChannel.connect();
            Message.verbose(":: SFTP :: connected to " + host + "!");
            SshCache.getInstance().attachChannelSftp(session, channelSftpOpenChannel);
            return channelSftpOpenChannel;
        } catch (JSchException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // org.apache.ivy.plugins.repository.ssh.AbstractSshBasedRepository
    public String getRepositoryScheme() {
        return "sftp";
    }
}
