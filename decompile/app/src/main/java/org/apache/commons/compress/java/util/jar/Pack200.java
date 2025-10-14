package org.apache.commons.compress.java.util.jar;

import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.SortedMap;
import java.util.jar.JarFile;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;
import org.apache.commons.compress.harmony.archive.internal.nls.Messages;

/* loaded from: classes7.dex */
public abstract class Pack200 {
    public static final String SYSTEM_PROPERTY_PACKER = "java.util.jar.Pack200.Packer";
    public static final String SYSTEM_PROPERTY_UNPACKER = "java.util.jar.Pack200.Unpacker";

    public interface Packer {
        public static final String CLASS_ATTRIBUTE_PFX = "pack.class.attribute.";
        public static final String CODE_ATTRIBUTE_PFX = "pack.code.attribute.";
        public static final String DEFLATE_HINT = "pack.deflate.hint";
        public static final String EFFORT = "pack.effort";
        public static final String ERROR = "error";
        public static final String FALSE = "false";
        public static final String FIELD_ATTRIBUTE_PFX = "pack.field.attribute.";
        public static final String KEEP = "keep";
        public static final String KEEP_FILE_ORDER = "pack.keep.file.order";
        public static final String LATEST = "latest";
        public static final String METHOD_ATTRIBUTE_PFX = "pack.method.attribute.";
        public static final String MODIFICATION_TIME = "pack.modification.time";
        public static final String PASS = "pass";
        public static final String PASS_FILE_PFX = "pack.pass.file.";
        public static final String PROGRESS = "pack.progress";
        public static final String SEGMENT_LIMIT = "pack.segment.limit";
        public static final String STRIP = "strip";
        public static final String TRUE = "true";
        public static final String UNKNOWN_ATTRIBUTE = "pack.unknown.attribute";

        void addPropertyChangeListener(PropertyChangeListener propertyChangeListener);

        void pack(JarFile jarFile, OutputStream outputStream) throws IOException;

        void pack(JarInputStream jarInputStream, OutputStream outputStream) throws IOException;

        SortedMap<String, String> properties();

        void removePropertyChangeListener(PropertyChangeListener propertyChangeListener);
    }

    public interface Unpacker {
        public static final String DEFLATE_HINT = "unpack.deflate.hint";
        public static final String FALSE = "false";
        public static final String KEEP = "keep";
        public static final String PROGRESS = "unpack.progress";
        public static final String TRUE = "true";

        void addPropertyChangeListener(PropertyChangeListener propertyChangeListener);

        SortedMap<String, String> properties();

        void removePropertyChangeListener(PropertyChangeListener propertyChangeListener);

        void unpack(File file, JarOutputStream jarOutputStream) throws IOException;

        void unpack(InputStream inputStream, JarOutputStream jarOutputStream) throws IOException;
    }

    public static Object newInstance(final String str, final String str2) {
        return AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.compress.java.util.jar.Pack200$$ExternalSyntheticLambda0
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return Pack200.lambda$newInstance$0(str, str2);
            }
        });
    }

    public static /* synthetic */ Object lambda$newInstance$0(String str, String str2) {
        String property = System.getProperty(str, str2);
        try {
            return Pack200.class.getClassLoader().loadClass(property).newInstance();
        } catch (Exception e) {
            throw new Error(Messages.getString("archive.3E", property), e);
        }
    }

    public static Packer newPacker() {
        return (Packer) newInstance(SYSTEM_PROPERTY_PACKER, "org.apache.commons.compress.harmony.pack200.Pack200PackerAdapter");
    }

    public static Unpacker newUnpacker() {
        return (Unpacker) newInstance(SYSTEM_PROPERTY_UNPACKER, "org.apache.commons.compress.harmony.unpack200.Pack200UnpackerAdapter");
    }
}
