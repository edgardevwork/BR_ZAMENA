package org.apache.ivy.plugins.repository.ssh;

import com.jcraft.jsch.ConfigRepository;
import com.jcraft.jsch.OpenSSHConfig;
import com.jcraft.jsch.Session;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.ivy.core.settings.TimeoutConstraint;
import org.apache.ivy.plugins.repository.AbstractRepository;
import org.apache.ivy.util.Credentials;
import org.apache.ivy.util.CredentialsUtil;
import org.apache.ivy.util.Message;

/* loaded from: classes5.dex */
public abstract class AbstractSshBasedRepository extends AbstractRepository {
    public static final int MAX_CREDENTIALS_CACHE_SIZE = 100;
    public static final Map<String, Credentials> credentialsCache = new HashMap();
    public boolean allowedAgentUse;
    public String host;
    public File keyFile;
    public String keyFilePassword;
    public File passFile;
    public int port;
    public String sshConfig;
    public String user;
    public String userPassword;

    public abstract String getRepositoryScheme();

    public AbstractSshBasedRepository() {
        this.keyFile = null;
        this.passFile = null;
        this.userPassword = null;
        this.keyFilePassword = null;
        this.user = null;
        this.host = null;
        this.port = -1;
        this.allowedAgentUse = false;
        this.sshConfig = null;
    }

    public AbstractSshBasedRepository(TimeoutConstraint timeoutConstraint) {
        super(timeoutConstraint);
        this.keyFile = null;
        this.passFile = null;
        this.userPassword = null;
        this.keyFilePassword = null;
        this.user = null;
        this.host = null;
        this.port = -1;
        this.allowedAgentUse = false;
        this.sshConfig = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x004b A[PHI: r1 r2 r3
  0x004b: PHI (r1v1 java.lang.String) = (r1v0 java.lang.String), (r1v0 java.lang.String), (r1v10 java.lang.String), (r1v10 java.lang.String) binds: [B:42:0x001c, B:44:0x0022, B:52:0x003d, B:54:0x0049] A[DONT_GENERATE, DONT_INLINE]
  0x004b: PHI (r2v1 int) = (r2v0 int), (r2v0 int), (r2v5 int), (r2v5 int) binds: [B:42:0x001c, B:44:0x0022, B:52:0x003d, B:54:0x0049] A[DONT_GENERATE, DONT_INLINE]
  0x004b: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v0 java.lang.String), (r3v6 java.lang.String) binds: [B:42:0x001c, B:44:0x0022, B:52:0x003d, B:54:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Session getSession(String str) throws URISyntaxException, IOException {
        int i;
        String str2;
        String passwd;
        URI uri = parseURI(str);
        String host = getHost();
        int port = getPort();
        String user = getUser();
        String userPassword = getUserPassword();
        String sshConfig = getSshConfig();
        File keyFile = getKeyFile();
        if (uri == null || uri.getScheme() == null) {
            i = port;
        } else {
            if (uri.getHost() != null) {
                host = uri.getHost();
            }
            if (uri.getPort() != -1) {
                port = uri.getPort();
            }
            if (uri.getUserInfo() != null) {
                user = uri.getUserInfo();
                if (user.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
                    String strSubstring = user.substring(0, user.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER));
                    String strSubstring2 = user.substring(user.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER) + 1);
                    i = port;
                    user = strSubstring;
                    userPassword = strSubstring2;
                }
            }
        }
        if (sshConfig != null) {
            ConfigRepository.Config config = OpenSSHConfig.parseFile(sshConfig).getConfig(host);
            host = config.getHostname();
            if (user == null) {
                user = config.getUser();
            }
            String value = config.getValue("IdentityFile");
            if (value != null && keyFile == null) {
                keyFile = new File(value);
            }
        }
        String str3 = host;
        File file = keyFile;
        if (str3 == null) {
            throw new IllegalArgumentException("missing host information. host should be provided either directly on the repository or in the connection URI , or in the openssh config file specified by sshConfig");
        }
        if (user != null) {
            str2 = user;
            passwd = userPassword;
        } else {
            Credentials credentialsRequestCredentials = requestCredentials(str3);
            if (credentialsRequestCredentials != null) {
                String userName = credentialsRequestCredentials.getUserName();
                passwd = credentialsRequestCredentials.getPasswd();
                str2 = userName;
            } else {
                Message.error("username is not set");
                str2 = user;
                passwd = userPassword;
            }
        }
        return SshCache.getInstance().getSession(str3, i, str2, passwd, file, getKeyFilePassword(), getPassFile(), isAllowedAgentUse());
    }

    public final URI parseURI(String str) throws URISyntaxException {
        try {
            URI uri = new URI(str);
            if (uri.getScheme() != null) {
                String scheme = uri.getScheme();
                Locale locale = Locale.US;
                if (!scheme.toLowerCase(locale).equals(getRepositoryScheme().toLowerCase(locale))) {
                    throw new URISyntaxException(str, "Wrong scheme in URI. Expected " + getRepositoryScheme() + " as scheme!");
                }
            }
            if (uri.getHost() == null && getHost() == null) {
                throw new URISyntaxException(str, "Missing host in URI or in resolver");
            }
            if (uri.getPath() != null) {
                return uri;
            }
            throw new URISyntaxException(str, "Missing path in URI");
        } catch (URISyntaxException e) {
            Message.error(e.getMessage());
            Message.error("The uri '" + str + "' is in the wrong format.");
            Message.error("Please use " + getRepositoryScheme() + "://user:pass@hostname/path/to/repository");
            return null;
        }
    }

    public final Credentials requestCredentials(String str) {
        Map<String, Credentials> map = credentialsCache;
        Credentials credentialsPromptCredentials = map.get(str);
        if (credentialsPromptCredentials == null && (credentialsPromptCredentials = CredentialsUtil.promptCredentials(new Credentials(null, str, this.user, this.userPassword), getPassFile())) != null) {
            if (map.size() > 100) {
                map.clear();
            }
            map.put(str, credentialsPromptCredentials);
        }
        return credentialsPromptCredentials;
    }

    public void releaseSession(Session session, String str) {
        session.disconnect();
        SshCache.getInstance().clearSession(session);
    }

    public void setUser(String str) {
        this.user = str;
    }

    public String getUser() {
        return this.user;
    }

    public void setKeyFile(File file) {
        this.keyFile = file;
        if (!file.exists()) {
            Message.warn("Pemfile " + this.keyFile.getAbsolutePath() + " doesn't exist.");
            this.keyFile = null;
            return;
        }
        if (!this.keyFile.canRead()) {
            Message.warn("Pemfile " + this.keyFile.getAbsolutePath() + " not readable.");
            this.keyFile = null;
            return;
        }
        Message.debug("Using " + this.keyFile.getAbsolutePath() + " as keyfile.");
    }

    public File getKeyFile() {
        return this.keyFile;
    }

    public void setUserPassword(String str) {
        this.userPassword = str;
    }

    public String getKeyFilePassword() {
        return this.keyFilePassword;
    }

    public void setKeyFilePassword(String str) {
        this.keyFilePassword = str;
    }

    public String getUserPassword() {
        return this.userPassword;
    }

    public String getHost() {
        return this.host;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public int getPort() {
        return this.port;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public void setPassFile(File file) {
        this.passFile = file;
    }

    public File getPassFile() {
        return this.passFile;
    }

    public boolean isAllowedAgentUse() {
        return this.allowedAgentUse;
    }

    public void setAllowedAgentUse(boolean z) {
        this.allowedAgentUse = z;
    }

    public String getSshConfig() {
        return this.sshConfig;
    }

    public void setSshConfig(String str) {
        this.sshConfig = str;
    }
}
