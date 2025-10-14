package org.apache.ivy.core.pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.DefaultArtifact;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.plugins.IvySettingsAware;
import org.apache.ivy.plugins.parser.p064m2.PomReader;

/* loaded from: classes7.dex */
public class PackagingManager implements IvySettingsAware {
    public IvySettings settings;

    @Override // org.apache.ivy.plugins.IvySettingsAware
    public void setSettings(IvySettings ivySettings) {
        this.settings = ivySettings;
    }

    public Artifact getUnpackedArtifact(Artifact artifact) {
        String extraAttribute = artifact.getExtraAttribute(PomReader.PACKAGING);
        if (extraAttribute == null) {
            return null;
        }
        String ext = artifact.getExt();
        String[] strArrSplit = extraAttribute.split(",");
        for (int length = strArrSplit.length - 1; length >= 1; length--) {
            ArchivePacking archivePacking = this.settings.getPackingRegistry().get(strArrSplit[length]);
            if (archivePacking == null) {
                throw new IllegalStateException("Unknown packing type '" + strArrSplit[length] + "' in the packing chain: " + extraAttribute);
            }
            if (!(archivePacking instanceof StreamPacking)) {
                throw new IllegalStateException("Unsupported archive only packing type '" + strArrSplit[length] + "' in the streamed chain: " + extraAttribute);
            }
            ext = archivePacking.getUnpackedExtension(ext);
        }
        ArchivePacking archivePacking2 = this.settings.getPackingRegistry().get(strArrSplit[0]);
        if (archivePacking2 == null) {
            throw new IllegalStateException("Unknown packing type '" + strArrSplit[0] + "' in the packing chain: " + extraAttribute);
        }
        String unpackedExtension = archivePacking2.getUnpackedExtension(ext);
        return new DefaultArtifact(artifact.getModuleRevisionId(), artifact.getPublicationDate(), artifact.getName(), artifact.getType() + "_unpacked", unpackedExtension);
    }

    public Artifact unpackArtifact(Artifact artifact, File file, File file2) throws Throwable {
        InputStream fileInputStream;
        String extraAttribute = artifact.getExtraAttribute(PomReader.PACKAGING);
        InputStream inputStream = null;
        if (extraAttribute == null) {
            return null;
        }
        String ext = artifact.getExt();
        String[] strArrSplit = extraAttribute.split(",");
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            for (int length = strArrSplit.length - 1; length >= 1; length--) {
                ArchivePacking archivePacking = this.settings.getPackingRegistry().get(strArrSplit[length]);
                if (archivePacking == null) {
                    throw new IllegalStateException("Unknown packing type '" + strArrSplit[length] + "' in the packing chain: " + extraAttribute);
                }
                if (!(archivePacking instanceof StreamPacking)) {
                    throw new IllegalStateException("Unsupported archive only packing type '" + strArrSplit[length] + "' in the streamed chain: " + extraAttribute);
                }
                fileInputStream = ((StreamPacking) archivePacking).unpack(fileInputStream);
                ext = archivePacking.getUnpackedExtension(ext);
            }
            ArchivePacking archivePacking2 = this.settings.getPackingRegistry().get(strArrSplit[0]);
            if (archivePacking2 == null) {
                throw new IllegalStateException("Unknown packing type '" + strArrSplit[0] + "' in the packing chain: " + extraAttribute);
            }
            archivePacking2.unpack(fileInputStream, file2);
            String unpackedExtension = archivePacking2.getUnpackedExtension(ext);
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException unused) {
                }
            }
            return new DefaultArtifact(artifact.getModuleRevisionId(), artifact.getPublicationDate(), artifact.getName(), artifact.getType() + "_unpacked", unpackedExtension);
        } catch (Throwable th2) {
            th = th2;
            inputStream = fileInputStream;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
