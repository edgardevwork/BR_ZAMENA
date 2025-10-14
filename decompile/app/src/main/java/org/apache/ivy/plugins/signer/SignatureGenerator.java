package org.apache.ivy.plugins.signer;

import java.io.File;
import java.io.IOException;

/* loaded from: classes6.dex */
public interface SignatureGenerator {
    String getExtension();

    String getName();

    void sign(File file, File file2) throws IOException;
}
