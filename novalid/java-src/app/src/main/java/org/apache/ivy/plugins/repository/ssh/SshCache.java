package org.apache.ivy.plugins.repository.ssh;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UIKeyboardInteractive;
import com.jcraft.jsch.UserInfo;
import com.jcraft.jsch.agentproxy.ConnectorFactory;
import com.jcraft.jsch.agentproxy.RemoteIdentityRepository;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.core.event.IvyEvent;
import org.apache.ivy.core.event.IvyListener;
import org.apache.ivy.core.event.resolve.EndResolveEvent;
import org.apache.ivy.util.Checks;
import org.apache.ivy.util.Credentials;
import org.apache.ivy.util.CredentialsUtil;
import org.apache.ivy.util.Message;

/* loaded from: classes6.dex */
public final class SshCache {
    public static final int SSH_DEFAULT_PORT = 22;
    public static SshCache instance = new SshCache();
    public final Map<String, Entry> uriCacheMap = new HashMap();
    public final Map<Session, Entry> sessionCacheMap = new HashMap();

    public static SshCache getInstance() {
        return instance;
    }

    public class Entry {
        public ChannelSftp channelSftp = null;
        public String host;
        public int port;
        public Session session;
        public String user;

        public String getHost() {
            return this.host;
        }

        public int getPort() {
            return this.port;
        }

        public String getUser() {
            return this.user;
        }

        public Entry(Session session, String str, String str2, int i) {
            this.session = session;
            this.host = str2;
            this.user = str;
            this.port = i;
            IvyContext.getContext().getEventManager().addIvyListener(new IvyListener() { // from class: org.apache.ivy.plugins.repository.ssh.SshCache.Entry.1
                public final /* synthetic */ SshCache val$this$0;

                public C112481(SshCache sshCache) {
                    sshCache = sshCache;
                }

                @Override // org.apache.ivy.core.event.IvyListener
                public void progress(IvyEvent ivyEvent) {
                    ivyEvent.getSource().removeIvyListener(this);
                    Entry entry = Entry.this;
                    SshCache.this.clearSession(entry.session);
                }
            }, EndResolveEvent.NAME);
        }

        /* renamed from: org.apache.ivy.plugins.repository.ssh.SshCache$Entry$1 */
        /* loaded from: classes5.dex */
        public class C112481 implements IvyListener {
            public final /* synthetic */ SshCache val$this$0;

            public C112481(SshCache sshCache) {
                sshCache = sshCache;
            }

            @Override // org.apache.ivy.core.event.IvyListener
            public void progress(IvyEvent ivyEvent) {
                ivyEvent.getSource().removeIvyListener(this);
                Entry entry = Entry.this;
                SshCache.this.clearSession(entry.session);
            }
        }

        public void setChannelSftp(ChannelSftp channelSftp) {
            if (this.channelSftp != null && channelSftp != null) {
                throw new IllegalStateException("Only one sftp channelSftp per session allowed");
            }
            this.channelSftp = channelSftp;
        }

        public ChannelSftp getChannelSftp() {
            return this.channelSftp;
        }

        public final Session getSession() {
            return this.session;
        }

        public void releaseChannelSftp() {
            ChannelSftp channelSftp = this.channelSftp;
            if (channelSftp == null || !channelSftp.isConnected()) {
                return;
            }
            Message.verbose(":: SFTP :: closing sftp connection from " + this.host + "...");
            this.channelSftp.disconnect();
            this.channelSftp = null;
            Message.verbose(":: SFTP :: sftp connection closed from " + this.host);
        }
    }

    public final Entry getCacheEntry(String str, String str2, int i) {
        return this.uriCacheMap.get(createCacheKey(str, str2, i));
    }

    public static String createCacheKey(String str, String str2, int i) {
        String string;
        if (i != -1 && i != 22) {
            string = Integer.toString(i);
        } else {
            string = "22";
        }
        StringBuilder sb = new StringBuilder();
        String strTrim = str.trim();
        Locale locale = Locale.US;
        sb.append(strTrim.toLowerCase(locale));
        sb.append("@");
        sb.append(str2.trim().toLowerCase(locale));
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb.append(string);
        return sb.toString();
    }

    public final Entry getCacheEntry(Session session) {
        return this.sessionCacheMap.get(session);
    }

    public final void setSession(String str, String str2, int i, Session session) {
        Entry entry = this.uriCacheMap.get(createCacheKey(str, str2, i));
        Session session2 = entry != null ? entry.getSession() : null;
        if (session2 != null && !session2.equals(session) && session2.isConnected()) {
            entry.releaseChannelSftp();
            String host = session2.getHost();
            Message.verbose(":: SSH :: closing ssh connection from " + host + "...");
            session2.disconnect();
            Message.verbose(":: SSH :: ssh connection closed from " + host);
        }
        if (session == null && entry != null) {
            this.uriCacheMap.remove(createCacheKey(str, str2, i));
            if (entry.getSession() != null) {
                this.sessionCacheMap.remove(entry.getSession());
                return;
            }
            return;
        }
        Entry entry2 = new Entry(session, str, str2, i);
        this.uriCacheMap.put(createCacheKey(str, str2, i), entry2);
        this.sessionCacheMap.put(session, entry2);
    }

    public void clearSession(Session session) {
        Entry entry = this.sessionCacheMap.get(session);
        if (entry != null) {
            setSession(entry.getUser(), entry.getHost(), entry.getPort(), null);
        }
    }

    public ChannelSftp getChannelSftp(Session session) throws IOException {
        Entry cacheEntry = getCacheEntry(session);
        if (cacheEntry == null) {
            return null;
        }
        ChannelSftp channelSftp = cacheEntry.getChannelSftp();
        if (channelSftp == null || channelSftp.isConnected()) {
            return channelSftp;
        }
        cacheEntry.releaseChannelSftp();
        return null;
    }

    public void attachChannelSftp(Session session, ChannelSftp channelSftp) {
        Entry cacheEntry = getCacheEntry(session);
        if (cacheEntry == null) {
            throw new IllegalArgumentException("No entry for " + session + " in the cache");
        }
        cacheEntry.setChannelSftp(channelSftp);
    }

    public final boolean attemptAgentUse(JSch jSch) {
        try {
            jSch.setIdentityRepository(new RemoteIdentityRepository(ConnectorFactory.getDefault().createConnector()));
            return true;
        } catch (Exception e) {
            Message.verbose(":: SSH :: Failure connecting to agent :: " + e.toString());
            return false;
        }
    }

    public Session getSession(String str, int i, String str2, String str3, File file, String str4, File file2, boolean z) throws IOException {
        Session session;
        Checks.checkNotNull(str, "host");
        Checks.checkNotNull(str2, "user");
        Entry cacheEntry = getCacheEntry(str2, str, i);
        Session session2 = cacheEntry != null ? cacheEntry.getSession() : null;
        if (session2 != null && session2.isConnected()) {
            return session2;
        }
        Message.verbose(":: SSH :: connecting to " + str + "...");
        try {
            JSch jSch = new JSch();
            if (i != -1) {
                session = jSch.getSession(str2, str, i);
            } else {
                session = jSch.getSession(str2, str);
            }
            Session session3 = session;
            if (z) {
                attemptAgentUse(jSch);
            }
            if (file != null) {
                jSch.addIdentity(file.getAbsolutePath(), str4);
            }
            session3.setUserInfo(new CfUserInfo(str, str2, str3, file, str4, file2));
            session3.setDaemonThread(true);
            Properties properties = new Properties();
            properties.setProperty("PreferredAuthentications", "publickey,keyboard-interactive,password");
            session3.setConfig(properties);
            session3.connect();
            Message.verbose(":: SSH :: connected to " + str + "!");
            setSession(str2, str, i, session3);
            return session3;
        } catch (JSchException e) {
            if (file2 != null && file2.exists()) {
                file2.delete();
            }
            throw new IOException(e.getMessage(), e);
        }
    }

    public static class CfUserInfo implements UserInfo, UIKeyboardInteractive {
        public final String host;
        public final File passfile;
        public final File pemFile;
        public String pemPassword;
        public String userName;
        public String userPassword;

        public boolean promptPassphrase(String str) {
            return true;
        }

        public boolean promptPassword(String str) {
            return true;
        }

        public boolean promptYesNo(String str) {
            return true;
        }

        public CfUserInfo(String str, String str2, String str3, File file, String str4, File file2) {
            this.userPassword = str3;
            this.pemPassword = str4;
            this.host = str;
            this.passfile = file2;
            this.userName = str2;
            this.pemFile = file;
        }

        public void showMessage(String str) {
            Message.info(str);
        }

        public String getPassword() {
            Credentials credentialsPromptCredentials;
            String str = this.userPassword;
            if (str == null && (credentialsPromptCredentials = CredentialsUtil.promptCredentials(new Credentials(null, this.host, this.userName, str), this.passfile)) != null) {
                this.userName = credentialsPromptCredentials.getUserName();
                this.userPassword = credentialsPromptCredentials.getPasswd();
            }
            return this.userPassword;
        }

        public String getPassphrase() {
            File file;
            Credentials credentialsPromptCredentials;
            if (this.pemPassword == null && (file = this.pemFile) != null && (credentialsPromptCredentials = CredentialsUtil.promptCredentials(new Credentials(null, file.getAbsolutePath(), this.userName, this.pemPassword), this.passfile)) != null) {
                this.userName = credentialsPromptCredentials.getUserName();
                this.pemPassword = credentialsPromptCredentials.getPasswd();
            }
            return this.pemPassword;
        }

        public String[] promptKeyboardInteractive(String str, String str2, String str3, String[] strArr, boolean[] zArr) {
            return new String[]{getPassword()};
        }
    }
}
