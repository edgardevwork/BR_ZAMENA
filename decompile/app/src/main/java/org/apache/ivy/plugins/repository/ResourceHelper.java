package org.apache.ivy.plugins.repository;

import java.io.File;
import java.net.MalformedURLException;
import org.apache.ivy.plugins.repository.file.FileResource;
import org.apache.ivy.plugins.repository.url.URLResource;
import org.apache.ivy.util.Message;

/* loaded from: classes6.dex */
public final class ResourceHelper {
    public static boolean equals(Resource resource, File file) {
        if (resource == null && file == null) {
            return true;
        }
        if (resource != null && file != null) {
            if (resource instanceof FileResource) {
                return new File(resource.getName()).equals(file);
            }
            if (resource instanceof URLResource) {
                try {
                    return file.toURI().toURL().toExternalForm().equals(resource.getName());
                } catch (MalformedURLException unused) {
                }
            }
        }
        return false;
    }

    public static long getLastModifiedOrDefault(Resource resource) {
        long lastModified = resource.getLastModified();
        if (lastModified > 0) {
            return lastModified;
        }
        Message.debug("impossible to get date for " + resource + ": using 'now'");
        return System.currentTimeMillis();
    }
}
