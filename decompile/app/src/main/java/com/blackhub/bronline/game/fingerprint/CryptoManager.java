package com.blackhub.bronline.game.fingerprint;

import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.util.Base64;
import androidx.biometric.CryptoObjectUtils;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* loaded from: classes3.dex */
public class CryptoManager {
    public static final String KEY_ALIAS = "codebeavers_fingerprint";
    public static CryptoManager instance;
    public Cipher cipher;
    public boolean isKeyValid;
    public KeyStore keyStore;

    public static synchronized CryptoManager getInstance() {
        try {
            if (instance == null) {
                instance = new CryptoManager();
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    public Cipher getCipher() {
        if (isKeyValid()) {
            return this.cipher;
        }
        return null;
    }

    public String getPublicKey() throws NoSuchAlgorithmException, IOException, CertificateException {
        if (isKeyValid()) {
            try {
                this.keyStore.load(null);
                return new String(Base64.encode(this.keyStore.getCertificate(KEY_ALIAS).getPublicKey().getEncoded(), 0));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public final boolean isKeyValid() throws NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException, InvalidAlgorithmParameterException {
        if (!this.isKeyValid && isKeyReady()) {
            try {
                this.keyStore.load(null);
                this.cipher = Cipher.getInstance("RSA/ECB/OAEPPadding");
                OAEPParameterSpec oAEPParameterSpec = new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT);
                this.cipher.init(2, (PrivateKey) this.keyStore.getKey(KEY_ALIAS, null), oAEPParameterSpec);
                this.isKeyValid = true;
            } catch (Exception e) {
                if ((e instanceof KeyPermanentlyInvalidatedException) && generateKey()) {
                    return isKeyValid();
                }
                e.printStackTrace();
            }
        }
        return this.isKeyValid;
    }

    public final boolean isKeyReady() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        try {
            KeyStore keyStore = KeyStore.getInstance(CryptoObjectUtils.KEYSTORE_INSTANCE);
            this.keyStore = keyStore;
            keyStore.load(null);
            if (!this.keyStore.containsAlias(KEY_ALIAS)) {
                if (!generateKey()) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final boolean generateKey() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", CryptoObjectUtils.KEYSTORE_INSTANCE);
            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(KEY_ALIAS, 2).setDigests("SHA-256", MessageDigestAlgorithms.SHA_512).setEncryptionPaddings("OAEPPadding").setUserAuthenticationRequired(true).build());
            keyPairGenerator.generateKeyPair();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
