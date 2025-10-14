package org.apache.ivy.util.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.ivy.util.FileUtil;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.url.URLHandler;

/* loaded from: classes8.dex */
public class ApacheURLLister {
    public static final Pattern PATTERN = Pattern.compile("<a[^>]*href=\"([^\"]*)\"[^>]*>(?:<[^>]+>)*?([^<>]+?)(?:<[^>]+>)*?</a>", 2);

    public List<URL> listAll(URL url) throws IOException {
        return retrieveListing(url, true, true);
    }

    public List<URL> listDirectories(URL url) throws IOException {
        return retrieveListing(url, false, true);
    }

    public List<URL> listFiles(URL url) throws IOException {
        return retrieveListing(url, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x014a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014c A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<URL> retrieveListing(URL url, boolean z, boolean z2) throws IOException {
        BufferedReader bufferedReader;
        boolean zEndsWith;
        ArrayList arrayList = new ArrayList();
        if (!url.getPath().endsWith("/") && !url.getPath().endsWith(".html")) {
            url = new URL(url.getProtocol(), url.getHost(), url.getPort(), url.getPath() + "/");
        }
        URLHandler uRLHandler = URLHandlerRegistry.getDefault();
        URLHandler.URLInfo uRLInfo = uRLHandler.getURLInfo(url);
        if (uRLInfo == URLHandler.UNAVAILABLE) {
            return arrayList;
        }
        String bodyCharset = uRLInfo.getBodyCharset();
        InputStream inputStreamOpenStream = uRLHandler.openStream(url);
        if (bodyCharset == null) {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenStream));
        } else {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenStream, bodyCharset));
        }
        Matcher matcher = PATTERN.matcher(FileUtil.readEntirely(bufferedReader));
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null && strGroup2 != null) {
                String strTrim = strGroup2.trim();
                try {
                    URI uri = new URI(strGroup);
                    String path = uri.getPath();
                    if (uri.getScheme() != null) {
                        if (path.startsWith(url.getPath())) {
                            path = path.substring(url.getPath().length());
                        }
                    }
                    if (!path.startsWith("../")) {
                        if (path.startsWith("/")) {
                            path = path.substring(path.substring(0, path.length() - 1).lastIndexOf(47) + 1);
                        }
                        if (path.startsWith("./")) {
                            path = path.substring(2);
                        }
                        if (strTrim.endsWith("..>")) {
                            if (path.startsWith(strTrim.substring(0, strTrim.length() - 3))) {
                                zEndsWith = path.endsWith("/");
                                if ((zEndsWith && z2) || (!zEndsWith && z)) {
                                    URL url2 = new URL(url, path);
                                    arrayList.add(url2);
                                    Message.debug("ApacheURLLister found URL=[" + url2 + "].");
                                }
                            }
                        } else if (strTrim.endsWith("..&gt;")) {
                            if (path.startsWith(strTrim.substring(0, strTrim.length() - 6))) {
                                zEndsWith = path.endsWith("/");
                                if (zEndsWith) {
                                }
                            }
                        } else {
                            String strSubstring = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
                            if (strTrim.endsWith("/")) {
                                strTrim = strTrim.substring(0, strTrim.length() - 1);
                            }
                            if (strSubstring.equalsIgnoreCase(strTrim)) {
                                zEndsWith = path.endsWith("/");
                                if (zEndsWith) {
                                }
                            }
                        }
                    }
                } catch (URISyntaxException unused) {
                }
            }
        }
        return arrayList;
    }
}
