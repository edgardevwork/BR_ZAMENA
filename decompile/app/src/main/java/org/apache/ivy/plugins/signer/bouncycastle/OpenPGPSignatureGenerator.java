package org.apache.ivy.plugins.signer.bouncycastle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Security;
import java.util.Iterator;
import org.apache.commons.lang3.SystemUtils;
import org.apache.ivy.plugins.signer.SignatureGenerator;
import org.bouncycastle.bcpg.ArmoredOutputStream;
import org.bouncycastle.bcpg.BCPGOutputStream;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openpgp.PGPException;
import org.bouncycastle.openpgp.PGPPrivateKey;
import org.bouncycastle.openpgp.PGPSecretKey;
import org.bouncycastle.openpgp.PGPSecretKeyRing;
import org.bouncycastle.openpgp.PGPSecretKeyRingCollection;
import org.bouncycastle.openpgp.PGPSignatureGenerator;
import org.bouncycastle.openpgp.PGPUtil;
import org.bouncycastle.openpgp.operator.bc.BcKeyFingerprintCalculator;
import org.bouncycastle.openpgp.operator.bc.BcPBESecretKeyDecryptorBuilder;
import org.bouncycastle.openpgp.operator.bc.BcPGPContentSignerBuilder;
import org.bouncycastle.openpgp.operator.bc.BcPGPDigestCalculatorProvider;

/* loaded from: classes5.dex */
public class OpenPGPSignatureGenerator implements SignatureGenerator {
    public static final long MASK = 4294967295L;
    public String keyId;
    public String name;
    public String password;
    public PGPSecretKey pgpSec;
    public String secring;

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    @Override // org.apache.ivy.plugins.signer.SignatureGenerator
    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // org.apache.ivy.plugins.signer.SignatureGenerator
    public String getExtension() {
        return "asc";
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setSecring(String str) {
        this.secring = str;
    }

    public void setKeyId(String str) {
        if ("auto".equals(str)) {
            return;
        }
        this.keyId = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[SYNTHETIC] */
    @Override // org.apache.ivy.plugins.signer.SignatureGenerator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void sign(File file, File file2) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        OutputStream outputStream = null;
        try {
            if (this.secring == null) {
                this.secring = System.getProperty(SystemUtils.USER_HOME_KEY) + "/.gnupg/secring.gpg";
            }
            if (this.pgpSec == null) {
                fileInputStream = new FileInputStream(this.secring);
                try {
                    this.pgpSec = readSecretKey(fileInputStream);
                } catch (PGPException e) {
                    e = e;
                    fileInputStream2 = null;
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = null;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (fileInputStream == null) {
                        try {
                            fileInputStream.close();
                            throw th;
                        } catch (IOException unused3) {
                            throw th;
                        }
                    }
                    throw th;
                }
            } else {
                fileInputStream = null;
            }
            PGPPrivateKey pGPPrivateKeyExtractPrivateKey = this.pgpSec.extractPrivateKey(new BcPBESecretKeyDecryptorBuilder(new BcPGPDigestCalculatorProvider()).build(this.password.toCharArray()));
            PGPSignatureGenerator pGPSignatureGenerator = new PGPSignatureGenerator(new BcPGPContentSignerBuilder(this.pgpSec.getPublicKey().getAlgorithm(), 2));
            pGPSignatureGenerator.init(0, pGPPrivateKeyExtractPrivateKey);
            fileInputStream2 = new FileInputStream(file);
            try {
                try {
                    OutputStream bCPGOutputStream = new BCPGOutputStream(new ArmoredOutputStream(new FileOutputStream(file2)));
                    while (true) {
                        try {
                            int i = fileInputStream2.read();
                            if (i < 0) {
                                break;
                            } else {
                                pGPSignatureGenerator.update((byte) i);
                            }
                        } catch (PGPException e2) {
                            outputStream = bCPGOutputStream;
                            e = e2;
                            throw new IOException(e);
                        } catch (Throwable th2) {
                            outputStream = bCPGOutputStream;
                            th = th2;
                            if (outputStream != null) {
                            }
                            if (fileInputStream2 != null) {
                            }
                            if (fileInputStream == null) {
                            }
                        }
                    }
                    pGPSignatureGenerator.generate().encode(bCPGOutputStream);
                    try {
                        bCPGOutputStream.close();
                    } catch (IOException unused4) {
                    }
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused5) {
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (PGPException e3) {
                e = e3;
            }
        } catch (PGPException e4) {
            e = e4;
            fileInputStream = null;
            fileInputStream2 = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            fileInputStream2 = null;
        }
    }

    public final PGPSecretKey readSecretKey(InputStream inputStream) throws IOException, PGPException {
        String str;
        Iterator keyRings = new PGPSecretKeyRingCollection(PGPUtil.getDecoderStream(inputStream), new BcKeyFingerprintCalculator()).getKeyRings();
        PGPSecretKey pGPSecretKey = null;
        while (pGPSecretKey == null && keyRings.hasNext()) {
            Iterator secretKeys = ((PGPSecretKeyRing) keyRings.next()).getSecretKeys();
            while (pGPSecretKey == null && secretKeys.hasNext()) {
                PGPSecretKey pGPSecretKey2 = (PGPSecretKey) secretKeys.next();
                if (this.keyId == null && pGPSecretKey2.isSigningKey()) {
                    pGPSecretKey = pGPSecretKey2;
                }
                String str2 = this.keyId;
                if (str2 != null && Long.valueOf(str2, 16).longValue() == (pGPSecretKey2.getKeyID() & 4294967295L)) {
                    pGPSecretKey = pGPSecretKey2;
                }
            }
        }
        if (pGPSecretKey != null) {
            return pGPSecretKey;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't find encryption key");
        if (this.keyId != null) {
            str = " '" + this.keyId + "' ";
        } else {
            str = " ";
        }
        sb.append(str);
        sb.append("in key ring.");
        throw new IllegalArgumentException(sb.toString());
    }
}
