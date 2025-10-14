package org.apache.ivy.core.pack;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.apache.ivy.osgi.core.BundleInfo;
import org.apache.ivy.util.FileUtil;

/* loaded from: classes8.dex */
public class OsgiBundlePacking extends ZipPacking {
    public static final String[] NAMES = {BundleInfo.BUNDLE_TYPE};

    @Override // org.apache.ivy.core.pack.ZipPacking, org.apache.ivy.core.pack.ArchivePacking
    public String[] getNames() {
        return NAMES;
    }

    @Override // org.apache.ivy.core.pack.ZipPacking
    public void writeFile(InputStream inputStream, File file) throws IOException {
        if (file.getName().endsWith(".jar.pack.gz")) {
            inputStream = FileUtil.unwrapPack200(inputStream);
            file = new File(file.getParentFile(), file.getName().substring(0, file.getName().length() - 8));
        }
        super.writeFile(inputStream, file);
    }
}
