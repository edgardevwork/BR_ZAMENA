package org.apache.ivy.plugins.repository;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.ivy.core.module.descriptor.Artifact;

/* loaded from: classes6.dex */
public interface Repository {
    void addTransferListener(TransferListener transferListener);

    void get(String str, File file) throws IOException;

    String getFileSeparator();

    String getName();

    Resource getResource(String str) throws IOException;

    boolean hasTransferListener(TransferListener transferListener);

    List<String> list(String str) throws IOException;

    void put(Artifact artifact, File file, String str, boolean z) throws IOException;

    void removeTransferListener(TransferListener transferListener);

    String standardize(String str);
}
