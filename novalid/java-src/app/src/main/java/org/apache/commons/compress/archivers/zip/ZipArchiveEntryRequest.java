package org.apache.commons.compress.archivers.zip;

import java.io.InputStream;
import org.apache.commons.compress.parallel.InputStreamSupplier;

/* loaded from: classes5.dex */
public class ZipArchiveEntryRequest {
    public final int method;
    public final InputStreamSupplier payloadSupplier;
    public final ZipArchiveEntry zipArchiveEntry;

    public ZipArchiveEntryRequest(ZipArchiveEntry zipArchiveEntry, InputStreamSupplier inputStreamSupplier) {
        this.zipArchiveEntry = zipArchiveEntry;
        this.payloadSupplier = inputStreamSupplier;
        this.method = zipArchiveEntry.getMethod();
    }

    public static ZipArchiveEntryRequest createZipArchiveEntryRequest(ZipArchiveEntry zipArchiveEntry, InputStreamSupplier inputStreamSupplier) {
        return new ZipArchiveEntryRequest(zipArchiveEntry, inputStreamSupplier);
    }

    public InputStream getPayloadStream() {
        return this.payloadSupplier.get();
    }

    public int getMethod() {
        return this.method;
    }

    public ZipArchiveEntry getZipArchiveEntry() {
        return this.zipArchiveEntry;
    }
}
