package org.apache.http.impl.auth;

import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import io.ktor.util.NonceKt;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.http.Consts;

/* loaded from: classes5.dex */
public final class NTLMEngineImpl implements NTLMEngine {
    public static final int FLAG_DOMAIN_PRESENT = 4096;
    public static final int FLAG_REQUEST_128BIT_KEY_EXCH = 536870912;
    public static final int FLAG_REQUEST_56BIT_ENCRYPTION = Integer.MIN_VALUE;
    public static final int FLAG_REQUEST_ALWAYS_SIGN = 32768;
    public static final int FLAG_REQUEST_EXPLICIT_KEY_EXCH = 1073741824;
    public static final int FLAG_REQUEST_LAN_MANAGER_KEY = 128;
    public static final int FLAG_REQUEST_NTLM2_SESSION = 524288;
    public static final int FLAG_REQUEST_NTLMv1 = 512;
    public static final int FLAG_REQUEST_OEM_ENCODING = 2;
    public static final int FLAG_REQUEST_SEAL = 32;
    public static final int FLAG_REQUEST_SIGN = 16;
    public static final int FLAG_REQUEST_TARGET = 4;
    public static final int FLAG_REQUEST_UNICODE_ENCODING = 1;
    public static final int FLAG_REQUEST_VERSION = 33554432;
    public static final int FLAG_TARGETINFO_PRESENT = 8388608;
    public static final int FLAG_WORKSTATION_PRESENT = 8192;
    public static final byte[] MAGIC_TLS_SERVER_ENDPOINT;
    public static final int MSV_AV_CHANNEL_BINDINGS = 10;
    public static final int MSV_AV_DNS_COMPUTER_NAME = 3;
    public static final int MSV_AV_DNS_DOMAIN_NAME = 4;
    public static final int MSV_AV_DNS_TREE_NAME = 5;
    public static final int MSV_AV_EOL = 0;
    public static final int MSV_AV_FLAGS = 6;
    public static final int MSV_AV_FLAGS_ACCOUNT_AUTH_CONSTAINED = 1;
    public static final int MSV_AV_FLAGS_MIC = 2;
    public static final int MSV_AV_FLAGS_UNTRUSTED_TARGET_SPN = 4;
    public static final int MSV_AV_NB_COMPUTER_NAME = 1;
    public static final int MSV_AV_NB_DOMAIN_NAME = 2;
    public static final int MSV_AV_SINGLE_HOST = 8;
    public static final int MSV_AV_TARGET_NAME = 9;
    public static final int MSV_AV_TIMESTAMP = 7;
    public static final SecureRandom RND_GEN;
    public static final byte[] SEAL_MAGIC_CLIENT;
    public static final byte[] SEAL_MAGIC_SERVER;
    public static final byte[] SIGNATURE;
    public static final byte[] SIGN_MAGIC_CLIENT;
    public static final byte[] SIGN_MAGIC_SERVER;
    public static final String TYPE_1_MESSAGE;
    public static final Charset UNICODE_LITTLE_UNMARKED = Charset.forName("UnicodeLittleUnmarked");
    public static final Charset DEFAULT_CHARSET = Consts.ASCII;

    /* loaded from: classes6.dex */
    public enum Mode {
        CLIENT,
        SERVER
    }

    /* renamed from: F */
    public static int m7377F(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    /* renamed from: G */
    public static int m7378G(int i, int i2, int i3) {
        return (i & (i2 | i3)) | (i2 & i3);
    }

    /* renamed from: H */
    public static int m7379H(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    public static int rotintlft(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    static {
        SecureRandom secureRandom;
        try {
            secureRandom = SecureRandom.getInstance(NonceKt.SHA1PRNG);
        } catch (Exception unused) {
            secureRandom = null;
        }
        RND_GEN = secureRandom;
        SIGNATURE = getNullTerminatedAsciiString("NTLMSSP");
        SIGN_MAGIC_SERVER = getNullTerminatedAsciiString("session key to server-to-client signing key magic constant");
        SIGN_MAGIC_CLIENT = getNullTerminatedAsciiString("session key to client-to-server signing key magic constant");
        SEAL_MAGIC_SERVER = getNullTerminatedAsciiString("session key to server-to-client sealing key magic constant");
        SEAL_MAGIC_CLIENT = getNullTerminatedAsciiString("session key to client-to-server sealing key magic constant");
        MAGIC_TLS_SERVER_ENDPOINT = "tls-server-end-point:".getBytes(Consts.ASCII);
        TYPE_1_MESSAGE = new Type1Message().getResponse();
    }

    public static byte[] getNullTerminatedAsciiString(String str) {
        byte[] bytes = str.getBytes(Consts.ASCII);
        byte[] bArr = new byte[bytes.length + 1];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        bArr[bytes.length] = 0;
        return bArr;
    }

    public static String getType1Message(String str, String str2) {
        return TYPE_1_MESSAGE;
    }

    public static String getType3Message(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) throws NTLMEngineException {
        return new Type3Message(str4, str3, str, str2, bArr, i, str5, bArr2).getResponse();
    }

    public static String getType3Message(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2, Certificate certificate, byte[] bArr3, byte[] bArr4) throws NTLMEngineException {
        return new Type3Message(str4, str3, str, str2, bArr, i, str5, bArr2, certificate, bArr3, bArr4).getResponse();
    }

    public static int readULong(byte[] bArr, int i) {
        if (bArr.length < i + 4) {
            return 0;
        }
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int readUShort(byte[] bArr, int i) {
        if (bArr.length < i + 2) {
            return 0;
        }
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public static byte[] readSecurityBuffer(byte[] bArr, int i) {
        int uShort = readUShort(bArr, i);
        int uLong = readULong(bArr, i + 4);
        if (bArr.length < uLong + uShort) {
            return new byte[uShort];
        }
        byte[] bArr2 = new byte[uShort];
        System.arraycopy(bArr, uLong, bArr2, 0, uShort);
        return bArr2;
    }

    public static byte[] makeRandomChallenge(Random random) {
        byte[] bArr = new byte[8];
        synchronized (random) {
            random.nextBytes(bArr);
        }
        return bArr;
    }

    public static byte[] makeSecondaryKey(Random random) {
        byte[] bArr = new byte[16];
        synchronized (random) {
            random.nextBytes(bArr);
        }
        return bArr;
    }

    /* loaded from: classes6.dex */
    public static class CipherGen {
        public final byte[] challenge;
        public byte[] clientChallenge;
        public byte[] clientChallenge2;
        public final long currentTime;
        public final String domain;
        public byte[] lanManagerSessionKey;
        public byte[] lm2SessionResponse;
        public byte[] lmHash;
        public byte[] lmResponse;
        public byte[] lmUserSessionKey;
        public byte[] lmv2Hash;
        public byte[] lmv2Response;
        public byte[] ntlm2SessionResponse;
        public byte[] ntlm2SessionResponseUserSessionKey;
        public byte[] ntlmHash;
        public byte[] ntlmResponse;
        public byte[] ntlmUserSessionKey;
        public byte[] ntlmv2Blob;
        public byte[] ntlmv2Hash;
        public byte[] ntlmv2Response;
        public byte[] ntlmv2UserSessionKey;
        public final String password;
        public final Random random;
        public byte[] secondaryKey;
        public final String target;
        public final byte[] targetInformation;
        public byte[] timestamp;
        public final String user;

        @Deprecated
        public CipherGen(String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
            this(NTLMEngineImpl.RND_GEN, System.currentTimeMillis(), str, str2, str3, bArr, str4, bArr2, bArr3, bArr4, bArr5, bArr6);
        }

        public CipherGen(Random random, long j, String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
            this.lmHash = null;
            this.lmResponse = null;
            this.ntlmHash = null;
            this.ntlmResponse = null;
            this.ntlmv2Hash = null;
            this.lmv2Hash = null;
            this.lmv2Response = null;
            this.ntlmv2Blob = null;
            this.ntlmv2Response = null;
            this.ntlm2SessionResponse = null;
            this.lm2SessionResponse = null;
            this.lmUserSessionKey = null;
            this.ntlmUserSessionKey = null;
            this.ntlmv2UserSessionKey = null;
            this.ntlm2SessionResponseUserSessionKey = null;
            this.lanManagerSessionKey = null;
            this.random = random;
            this.currentTime = j;
            this.domain = str;
            this.target = str4;
            this.user = str2;
            this.password = str3;
            this.challenge = bArr;
            this.targetInformation = bArr2;
            this.clientChallenge = bArr3;
            this.clientChallenge2 = bArr4;
            this.secondaryKey = bArr5;
            this.timestamp = bArr6;
        }

        @Deprecated
        public CipherGen(String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2) {
            this(NTLMEngineImpl.RND_GEN, System.currentTimeMillis(), str, str2, str3, bArr, str4, bArr2);
        }

        public CipherGen(Random random, long j, String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2) {
            this(random, j, str, str2, str3, bArr, str4, bArr2, null, null, null, null);
        }

        public byte[] getClientChallenge() throws NTLMEngineException {
            if (this.clientChallenge == null) {
                this.clientChallenge = NTLMEngineImpl.makeRandomChallenge(this.random);
            }
            return this.clientChallenge;
        }

        public byte[] getClientChallenge2() throws NTLMEngineException {
            if (this.clientChallenge2 == null) {
                this.clientChallenge2 = NTLMEngineImpl.makeRandomChallenge(this.random);
            }
            return this.clientChallenge2;
        }

        public byte[] getSecondaryKey() throws NTLMEngineException {
            if (this.secondaryKey == null) {
                this.secondaryKey = NTLMEngineImpl.makeSecondaryKey(this.random);
            }
            return this.secondaryKey;
        }

        public byte[] getLMHash() throws NTLMEngineException {
            if (this.lmHash == null) {
                this.lmHash = NTLMEngineImpl.lmHash(this.password);
            }
            return this.lmHash;
        }

        public byte[] getLMResponse() throws NTLMEngineException {
            if (this.lmResponse == null) {
                this.lmResponse = NTLMEngineImpl.lmResponse(getLMHash(), this.challenge);
            }
            return this.lmResponse;
        }

        public byte[] getNTLMHash() throws NTLMEngineException {
            if (this.ntlmHash == null) {
                this.ntlmHash = NTLMEngineImpl.ntlmHash(this.password);
            }
            return this.ntlmHash;
        }

        public byte[] getNTLMResponse() throws NTLMEngineException {
            if (this.ntlmResponse == null) {
                this.ntlmResponse = NTLMEngineImpl.lmResponse(getNTLMHash(), this.challenge);
            }
            return this.ntlmResponse;
        }

        public byte[] getLMv2Hash() throws NTLMEngineException {
            if (this.lmv2Hash == null) {
                this.lmv2Hash = NTLMEngineImpl.lmv2Hash(this.domain, this.user, getNTLMHash());
            }
            return this.lmv2Hash;
        }

        public byte[] getNTLMv2Hash() throws NTLMEngineException {
            if (this.ntlmv2Hash == null) {
                this.ntlmv2Hash = NTLMEngineImpl.ntlmv2Hash(this.domain, this.user, getNTLMHash());
            }
            return this.ntlmv2Hash;
        }

        public byte[] getTimestamp() {
            if (this.timestamp == null) {
                long j = (this.currentTime + 11644473600000L) * 10000;
                this.timestamp = new byte[8];
                for (int i = 0; i < 8; i++) {
                    this.timestamp[i] = (byte) j;
                    j >>>= 8;
                }
            }
            return this.timestamp;
        }

        public byte[] getNTLMv2Blob() throws NTLMEngineException {
            if (this.ntlmv2Blob == null) {
                this.ntlmv2Blob = NTLMEngineImpl.createBlob(getClientChallenge2(), this.targetInformation, getTimestamp());
            }
            return this.ntlmv2Blob;
        }

        public byte[] getNTLMv2Response() throws NTLMEngineException {
            if (this.ntlmv2Response == null) {
                this.ntlmv2Response = NTLMEngineImpl.lmv2Response(getNTLMv2Hash(), this.challenge, getNTLMv2Blob());
            }
            return this.ntlmv2Response;
        }

        public byte[] getLMv2Response() throws NTLMEngineException {
            if (this.lmv2Response == null) {
                this.lmv2Response = NTLMEngineImpl.lmv2Response(getLMv2Hash(), this.challenge, getClientChallenge());
            }
            return this.lmv2Response;
        }

        public byte[] getNTLM2SessionResponse() throws NTLMEngineException {
            if (this.ntlm2SessionResponse == null) {
                this.ntlm2SessionResponse = NTLMEngineImpl.ntlm2SessionResponse(getNTLMHash(), this.challenge, getClientChallenge());
            }
            return this.ntlm2SessionResponse;
        }

        public byte[] getLM2SessionResponse() throws NTLMEngineException {
            if (this.lm2SessionResponse == null) {
                byte[] clientChallenge = getClientChallenge();
                byte[] bArr = new byte[24];
                this.lm2SessionResponse = bArr;
                System.arraycopy(clientChallenge, 0, bArr, 0, clientChallenge.length);
                byte[] bArr2 = this.lm2SessionResponse;
                Arrays.fill(bArr2, clientChallenge.length, bArr2.length, (byte) 0);
            }
            return this.lm2SessionResponse;
        }

        public byte[] getLMUserSessionKey() throws NTLMEngineException {
            if (this.lmUserSessionKey == null) {
                this.lmUserSessionKey = new byte[16];
                System.arraycopy(getLMHash(), 0, this.lmUserSessionKey, 0, 8);
                Arrays.fill(this.lmUserSessionKey, 8, 16, (byte) 0);
            }
            return this.lmUserSessionKey;
        }

        public byte[] getNTLMUserSessionKey() throws NTLMEngineException {
            if (this.ntlmUserSessionKey == null) {
                MD4 md4 = new MD4();
                md4.update(getNTLMHash());
                this.ntlmUserSessionKey = md4.getOutput();
            }
            return this.ntlmUserSessionKey;
        }

        public byte[] getNTLMv2UserSessionKey() throws NTLMEngineException {
            if (this.ntlmv2UserSessionKey == null) {
                byte[] nTLMv2Hash = getNTLMv2Hash();
                byte[] bArr = new byte[16];
                System.arraycopy(getNTLMv2Response(), 0, bArr, 0, 16);
                this.ntlmv2UserSessionKey = NTLMEngineImpl.hmacMD5(bArr, nTLMv2Hash);
            }
            return this.ntlmv2UserSessionKey;
        }

        public byte[] getNTLM2SessionResponseUserSessionKey() throws NTLMEngineException {
            if (this.ntlm2SessionResponseUserSessionKey == null) {
                byte[] lM2SessionResponse = getLM2SessionResponse();
                byte[] bArr = this.challenge;
                byte[] bArr2 = new byte[bArr.length + lM2SessionResponse.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                System.arraycopy(lM2SessionResponse, 0, bArr2, this.challenge.length, lM2SessionResponse.length);
                this.ntlm2SessionResponseUserSessionKey = NTLMEngineImpl.hmacMD5(bArr2, getNTLMUserSessionKey());
            }
            return this.ntlm2SessionResponseUserSessionKey;
        }

        public byte[] getLanManagerSessionKey() throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, NTLMEngineException {
            if (this.lanManagerSessionKey == null) {
                try {
                    byte[] bArr = new byte[14];
                    System.arraycopy(getLMHash(), 0, bArr, 0, 8);
                    Arrays.fill(bArr, 8, 14, (byte) -67);
                    Key keyCreateDESKey = NTLMEngineImpl.createDESKey(bArr, 0);
                    Key keyCreateDESKey2 = NTLMEngineImpl.createDESKey(bArr, 7);
                    byte[] bArr2 = new byte[8];
                    System.arraycopy(getLMResponse(), 0, bArr2, 0, 8);
                    Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
                    cipher.init(1, keyCreateDESKey);
                    byte[] bArrDoFinal = cipher.doFinal(bArr2);
                    Cipher cipher2 = Cipher.getInstance("DES/ECB/NoPadding");
                    cipher2.init(1, keyCreateDESKey2);
                    byte[] bArrDoFinal2 = cipher2.doFinal(bArr2);
                    byte[] bArr3 = new byte[16];
                    this.lanManagerSessionKey = bArr3;
                    System.arraycopy(bArrDoFinal, 0, bArr3, 0, bArrDoFinal.length);
                    System.arraycopy(bArrDoFinal2, 0, this.lanManagerSessionKey, bArrDoFinal.length, bArrDoFinal2.length);
                } catch (Exception e) {
                    throw new NTLMEngineException(e.getMessage(), e);
                }
            }
            return this.lanManagerSessionKey;
        }
    }

    public static byte[] hmacMD5(byte[] bArr, byte[] bArr2) throws NTLMEngineException {
        HMACMD5 hmacmd5 = new HMACMD5(bArr2);
        hmacmd5.update(bArr);
        return hmacmd5.getOutput();
    }

    public static byte[] RC4(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NTLMEngineException {
        try {
            Cipher cipher = Cipher.getInstance("RC4");
            cipher.init(1, new SecretKeySpec(bArr2, "RC4"));
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    public static byte[] ntlm2SessionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NTLMEngineException {
        try {
            MessageDigest md5 = getMD5();
            md5.update(bArr2);
            md5.update(bArr3);
            byte[] bArrDigest = md5.digest();
            byte[] bArr4 = new byte[8];
            System.arraycopy(bArrDigest, 0, bArr4, 0, 8);
            return lmResponse(bArr, bArr4);
        } catch (Exception e) {
            if (e instanceof NTLMEngineException) {
                throw ((NTLMEngineException) e);
            }
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    public static byte[] lmHash(String str) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, NTLMEngineException {
        try {
            String upperCase = str.toUpperCase(Locale.ROOT);
            Charset charset = Consts.ASCII;
            byte[] bytes = upperCase.getBytes(charset);
            byte[] bArr = new byte[14];
            System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 14));
            Key keyCreateDESKey = createDESKey(bArr, 0);
            Key keyCreateDESKey2 = createDESKey(bArr, 7);
            byte[] bytes2 = "KGS!@#$%".getBytes(charset);
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, keyCreateDESKey);
            byte[] bArrDoFinal = cipher.doFinal(bytes2);
            cipher.init(1, keyCreateDESKey2);
            byte[] bArrDoFinal2 = cipher.doFinal(bytes2);
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArrDoFinal, 0, bArr2, 0, 8);
            System.arraycopy(bArrDoFinal2, 0, bArr2, 8, 8);
            return bArr2;
        } catch (Exception e) {
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    public static byte[] ntlmHash(String str) throws NTLMEngineException {
        Charset charset = UNICODE_LITTLE_UNMARKED;
        if (charset == null) {
            throw new NTLMEngineException("Unicode not supported");
        }
        byte[] bytes = str.getBytes(charset);
        MD4 md4 = new MD4();
        md4.update(bytes);
        return md4.getOutput();
    }

    public static byte[] lmv2Hash(String str, String str2, byte[] bArr) throws NTLMEngineException {
        Charset charset = UNICODE_LITTLE_UNMARKED;
        if (charset == null) {
            throw new NTLMEngineException("Unicode not supported");
        }
        HMACMD5 hmacmd5 = new HMACMD5(bArr);
        Locale locale = Locale.ROOT;
        hmacmd5.update(str2.toUpperCase(locale).getBytes(charset));
        if (str != null) {
            hmacmd5.update(str.toUpperCase(locale).getBytes(charset));
        }
        return hmacmd5.getOutput();
    }

    public static byte[] ntlmv2Hash(String str, String str2, byte[] bArr) throws NTLMEngineException {
        Charset charset = UNICODE_LITTLE_UNMARKED;
        if (charset == null) {
            throw new NTLMEngineException("Unicode not supported");
        }
        HMACMD5 hmacmd5 = new HMACMD5(bArr);
        hmacmd5.update(str2.toUpperCase(Locale.ROOT).getBytes(charset));
        if (str != null) {
            hmacmd5.update(str.getBytes(charset));
        }
        return hmacmd5.getOutput();
    }

    public static byte[] lmResponse(byte[] bArr, byte[] bArr2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, NTLMEngineException {
        try {
            byte[] bArr3 = new byte[21];
            System.arraycopy(bArr, 0, bArr3, 0, 16);
            Key keyCreateDESKey = createDESKey(bArr3, 0);
            Key keyCreateDESKey2 = createDESKey(bArr3, 7);
            Key keyCreateDESKey3 = createDESKey(bArr3, 14);
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, keyCreateDESKey);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            cipher.init(1, keyCreateDESKey2);
            byte[] bArrDoFinal2 = cipher.doFinal(bArr2);
            cipher.init(1, keyCreateDESKey3);
            byte[] bArrDoFinal3 = cipher.doFinal(bArr2);
            byte[] bArr4 = new byte[24];
            System.arraycopy(bArrDoFinal, 0, bArr4, 0, 8);
            System.arraycopy(bArrDoFinal2, 0, bArr4, 8, 8);
            System.arraycopy(bArrDoFinal3, 0, bArr4, 16, 8);
            return bArr4;
        } catch (Exception e) {
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    public static byte[] lmv2Response(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        HMACMD5 hmacmd5 = new HMACMD5(bArr);
        hmacmd5.update(bArr2);
        hmacmd5.update(bArr3);
        byte[] output = hmacmd5.getOutput();
        byte[] bArr4 = new byte[output.length + bArr3.length];
        System.arraycopy(output, 0, bArr4, 0, output.length);
        System.arraycopy(bArr3, 0, bArr4, output.length, bArr3.length);
        return bArr4;
    }

    /* loaded from: classes6.dex */
    public static class Handle {
        public final byte[] exportedSessionKey;
        public final boolean isConnection;
        public final Mode mode;
        public final Cipher rc4;
        public byte[] sealingKey;
        public int sequenceNumber = 0;
        public byte[] signingKey;

        public Handle(byte[] bArr, Mode mode, boolean z) throws NTLMEngineException {
            this.exportedSessionKey = bArr;
            this.isConnection = z;
            this.mode = mode;
            try {
                MessageDigest md5 = NTLMEngineImpl.getMD5();
                MessageDigest md52 = NTLMEngineImpl.getMD5();
                md5.update(bArr);
                md52.update(bArr);
                if (mode == Mode.CLIENT) {
                    md5.update(NTLMEngineImpl.SIGN_MAGIC_CLIENT);
                    md52.update(NTLMEngineImpl.SEAL_MAGIC_CLIENT);
                } else {
                    md5.update(NTLMEngineImpl.SIGN_MAGIC_SERVER);
                    md52.update(NTLMEngineImpl.SEAL_MAGIC_SERVER);
                }
                this.signingKey = md5.digest();
                this.sealingKey = md52.digest();
                this.rc4 = initCipher();
            } catch (Exception e) {
                throw new NTLMEngineException(e.getMessage(), e);
            }
        }

        public byte[] getSigningKey() {
            return this.signingKey;
        }

        public byte[] getSealingKey() {
            return this.sealingKey;
        }

        public final Cipher initCipher() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NTLMEngineException {
            try {
                Cipher cipher = Cipher.getInstance("RC4");
                if (this.mode == Mode.CLIENT) {
                    cipher.init(1, new SecretKeySpec(this.sealingKey, "RC4"));
                } else {
                    cipher.init(2, new SecretKeySpec(this.sealingKey, "RC4"));
                }
                return cipher;
            } catch (Exception e) {
                throw new NTLMEngineException(e.getMessage(), e);
            }
        }

        public final void advanceMessageSequence() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NTLMEngineException {
            if (!this.isConnection) {
                MessageDigest md5 = NTLMEngineImpl.getMD5();
                md5.update(this.sealingKey);
                byte[] bArr = new byte[4];
                NTLMEngineImpl.writeULong(bArr, this.sequenceNumber, 0);
                md5.update(bArr);
                this.sealingKey = md5.digest();
                initCipher();
            }
            this.sequenceNumber++;
        }

        public final byte[] encrypt(byte[] bArr) {
            return this.rc4.update(bArr);
        }

        public final byte[] decrypt(byte[] bArr) {
            return this.rc4.update(bArr);
        }

        public final byte[] computeSignature(byte[] bArr) {
            byte[] bArr2 = new byte[16];
            bArr2[0] = 1;
            bArr2[1] = 0;
            bArr2[2] = 0;
            bArr2[3] = 0;
            HMACMD5 hmacmd5 = new HMACMD5(this.signingKey);
            hmacmd5.update(NTLMEngineImpl.encodeLong(this.sequenceNumber));
            hmacmd5.update(bArr);
            byte[] bArr3 = new byte[8];
            System.arraycopy(hmacmd5.getOutput(), 0, bArr3, 0, 8);
            System.arraycopy(encrypt(bArr3), 0, bArr2, 4, 8);
            NTLMEngineImpl.encodeLong(bArr2, 12, this.sequenceNumber);
            return bArr2;
        }

        public final boolean validateSignature(byte[] bArr, byte[] bArr2) {
            return Arrays.equals(bArr, computeSignature(bArr2));
        }

        public byte[] signAndEncryptMessage(byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NTLMEngineException {
            byte[] bArrEncrypt = encrypt(bArr);
            byte[] bArrComputeSignature = computeSignature(bArr);
            byte[] bArr2 = new byte[bArrComputeSignature.length + bArrEncrypt.length];
            System.arraycopy(bArrComputeSignature, 0, bArr2, 0, bArrComputeSignature.length);
            System.arraycopy(bArrEncrypt, 0, bArr2, bArrComputeSignature.length, bArrEncrypt.length);
            advanceMessageSequence();
            return bArr2;
        }

        public byte[] decryptAndVerifySignedMessage(byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NTLMEngineException {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 0, 16);
            int length = bArr.length - 16;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 16, bArr3, 0, length);
            byte[] bArrDecrypt = decrypt(bArr3);
            if (!validateSignature(bArr2, bArrDecrypt)) {
                throw new NTLMEngineException("Wrong signature");
            }
            advanceMessageSequence();
            return bArrDecrypt;
        }
    }

    public static byte[] encodeLong(int i) {
        byte[] bArr = new byte[4];
        encodeLong(bArr, 0, i);
        return bArr;
    }

    public static void encodeLong(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    public static byte[] createBlob(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[bArr3.length + 20 + bArr2.length + 4];
        System.arraycopy(new byte[]{1, 1, 0, 0}, 0, bArr4, 0, 4);
        System.arraycopy(new byte[]{0, 0, 0, 0}, 0, bArr4, 4, 4);
        System.arraycopy(bArr3, 0, bArr4, 8, bArr3.length);
        int length = bArr3.length;
        System.arraycopy(bArr, 0, bArr4, 8 + length, 8);
        System.arraycopy(new byte[]{0, 0, 0, 0}, 0, bArr4, length + 16, 4);
        int i = length + 20;
        System.arraycopy(bArr2, 0, bArr4, i, bArr2.length);
        System.arraycopy(new byte[]{0, 0, 0, 0}, 0, bArr4, i + bArr2.length, 4);
        return bArr4;
    }

    public static Key createDESKey(byte[] bArr, int i) {
        byte[] bArr2 = new byte[7];
        System.arraycopy(bArr, i, bArr2, 0, 7);
        byte b = bArr2[0];
        byte b2 = bArr2[1];
        byte b3 = bArr2[2];
        byte b4 = bArr2[3];
        byte b5 = bArr2[4];
        byte b6 = bArr2[5];
        byte b7 = bArr2[6];
        byte[] bArr3 = {b, (byte) ((b << 7) | ((b2 & 255) >>> 1)), (byte) ((b2 << 6) | ((b3 & 255) >>> 2)), (byte) ((b3 << 5) | ((b4 & 255) >>> 3)), (byte) ((b4 << 4) | ((b5 & 255) >>> 4)), (byte) (((b6 & 255) >>> 5) | (b5 << 3)), (byte) ((b6 << 2) | ((b7 & 255) >>> 6)), (byte) (b7 << 1)};
        oddParity(bArr3);
        return new SecretKeySpec(bArr3, "DES");
    }

    public static void oddParity(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            if (((((((((b >>> 7) ^ (b >>> 6)) ^ (b >>> 5)) ^ (b >>> 4)) ^ (b >>> 3)) ^ (b >>> 2)) ^ (b >>> 1)) & 1) == 0) {
                bArr[i] = (byte) (b | 1);
            } else {
                bArr[i] = (byte) (b & (-2));
            }
        }
    }

    public static Charset getCharset(int i) throws NTLMEngineException {
        if ((i & 1) == 0) {
            return DEFAULT_CHARSET;
        }
        Charset charset = UNICODE_LITTLE_UNMARKED;
        if (charset != null) {
            return charset;
        }
        throw new NTLMEngineException("Unicode not supported");
    }

    public static String stripDotSuffix(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(46);
        return iIndexOf != -1 ? str.substring(0, iIndexOf) : str;
    }

    public static String convertHost(String str) {
        return stripDotSuffix(str);
    }

    public static String convertDomain(String str) {
        return stripDotSuffix(str);
    }

    /* loaded from: classes6.dex */
    public static class NTLMMessage {
        public int currentOutputPosition;
        public byte[] messageContents;

        public NTLMMessage() {
            this.messageContents = null;
            this.currentOutputPosition = 0;
        }

        public NTLMMessage(String str, int i) throws NTLMEngineException {
            this(Base64.decodeBase64(str.getBytes(NTLMEngineImpl.DEFAULT_CHARSET)), i);
        }

        public NTLMMessage(byte[] bArr, int i) throws NTLMEngineException {
            this.currentOutputPosition = 0;
            this.messageContents = bArr;
            if (bArr.length >= NTLMEngineImpl.SIGNATURE.length) {
                for (int i2 = 0; i2 < NTLMEngineImpl.SIGNATURE.length; i2++) {
                    if (this.messageContents[i2] != NTLMEngineImpl.SIGNATURE[i2]) {
                        throw new NTLMEngineException("NTLM message expected - instead got unrecognized bytes");
                    }
                }
                int uLong = readULong(NTLMEngineImpl.SIGNATURE.length);
                if (uLong != i) {
                    throw new NTLMEngineException("NTLM type " + Integer.toString(i) + " message expected - instead got type " + Integer.toString(uLong));
                }
                this.currentOutputPosition = this.messageContents.length;
                return;
            }
            throw new NTLMEngineException("NTLM message decoding error - packet too short");
        }

        public int getPreambleLength() {
            return NTLMEngineImpl.SIGNATURE.length + 4;
        }

        public int getMessageLength() {
            return this.currentOutputPosition;
        }

        public byte readByte(int i) throws NTLMEngineException {
            byte[] bArr = this.messageContents;
            if (bArr.length < i + 1) {
                throw new NTLMEngineException("NTLM: Message too short");
            }
            return bArr[i];
        }

        public void readBytes(byte[] bArr, int i) throws NTLMEngineException {
            byte[] bArr2 = this.messageContents;
            if (bArr2.length < bArr.length + i) {
                throw new NTLMEngineException("NTLM: Message too short");
            }
            System.arraycopy(bArr2, i, bArr, 0, bArr.length);
        }

        public int readUShort(int i) throws NTLMEngineException {
            return NTLMEngineImpl.readUShort(this.messageContents, i);
        }

        public int readULong(int i) throws NTLMEngineException {
            return NTLMEngineImpl.readULong(this.messageContents, i);
        }

        public byte[] readSecurityBuffer(int i) throws NTLMEngineException {
            return NTLMEngineImpl.readSecurityBuffer(this.messageContents, i);
        }

        public void prepareResponse(int i, int i2) {
            this.messageContents = new byte[i];
            this.currentOutputPosition = 0;
            addBytes(NTLMEngineImpl.SIGNATURE);
            addULong(i2);
        }

        public void addByte(byte b) {
            byte[] bArr = this.messageContents;
            int i = this.currentOutputPosition;
            bArr[i] = b;
            this.currentOutputPosition = i + 1;
        }

        public void addBytes(byte[] bArr) {
            if (bArr == null) {
                return;
            }
            for (byte b : bArr) {
                byte[] bArr2 = this.messageContents;
                int i = this.currentOutputPosition;
                bArr2[i] = b;
                this.currentOutputPosition = i + 1;
            }
        }

        public void addUShort(int i) {
            addByte((byte) (i & 255));
            addByte((byte) ((i >> 8) & 255));
        }

        public void addULong(int i) {
            addByte((byte) (i & 255));
            addByte((byte) ((i >> 8) & 255));
            addByte((byte) ((i >> 16) & 255));
            addByte((byte) ((i >> 24) & 255));
        }

        public String getResponse() {
            return new String(Base64.encodeBase64(getBytes()), Consts.ASCII);
        }

        public byte[] getBytes() {
            if (this.messageContents == null) {
                buildMessage();
            }
            byte[] bArr = this.messageContents;
            int length = bArr.length;
            int i = this.currentOutputPosition;
            if (length > i) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, i);
                this.messageContents = bArr2;
            }
            return this.messageContents;
        }

        public void buildMessage() {
            throw new RuntimeException("Message builder not implemented for " + getClass().getName());
        }
    }

    public static class Type1Message extends NTLMMessage {
        public final byte[] domainBytes;
        public final int flags;
        public final byte[] hostBytes;

        public final int getDefaultFlags() {
            return -1576500735;
        }

        public Type1Message(String str, String str2) throws NTLMEngineException {
            this(str, str2, null);
        }

        public Type1Message(String str, String str2, Integer num) throws NTLMEngineException {
            this.flags = num == null ? getDefaultFlags() : num.intValue();
            String strConvertHost = NTLMEngineImpl.convertHost(str2);
            String strConvertDomain = NTLMEngineImpl.convertDomain(str);
            this.hostBytes = strConvertHost != null ? strConvertHost.getBytes(NTLMEngineImpl.UNICODE_LITTLE_UNMARKED) : null;
            this.domainBytes = strConvertDomain != null ? strConvertDomain.toUpperCase(Locale.ROOT).getBytes(NTLMEngineImpl.UNICODE_LITTLE_UNMARKED) : null;
        }

        public Type1Message() {
            this.hostBytes = null;
            this.domainBytes = null;
            this.flags = getDefaultFlags();
        }

        @Override // org.apache.http.impl.auth.NTLMEngineImpl.NTLMMessage
        public void buildMessage() {
            byte[] bArr = this.domainBytes;
            int length = bArr != null ? bArr.length : 0;
            byte[] bArr2 = this.hostBytes;
            int length2 = bArr2 != null ? bArr2.length : 0;
            prepareResponse(length2 + 40 + length, 1);
            addULong(this.flags);
            addUShort(length);
            addUShort(length);
            addULong(length2 + 40);
            addUShort(length2);
            addUShort(length2);
            addULong(40);
            addUShort(261);
            addULong(2600);
            addUShort(3840);
            byte[] bArr3 = this.hostBytes;
            if (bArr3 != null) {
                addBytes(bArr3);
            }
            byte[] bArr4 = this.domainBytes;
            if (bArr4 != null) {
                addBytes(bArr4);
            }
        }
    }

    public static class Type2Message extends NTLMMessage {
        public final byte[] challenge;
        public final int flags;
        public String target;
        public byte[] targetInfo;

        public Type2Message(String str) throws NTLMEngineException {
            this(Base64.decodeBase64(str.getBytes(NTLMEngineImpl.DEFAULT_CHARSET)));
        }

        public Type2Message(byte[] bArr) throws NTLMEngineException {
            super(bArr, 2);
            byte[] bArr2 = new byte[8];
            this.challenge = bArr2;
            readBytes(bArr2, 24);
            int uLong = readULong(20);
            this.flags = uLong;
            this.target = null;
            if (getMessageLength() >= 20) {
                byte[] securityBuffer = readSecurityBuffer(12);
                if (securityBuffer.length != 0) {
                    this.target = new String(securityBuffer, NTLMEngineImpl.getCharset(uLong));
                }
            }
            this.targetInfo = null;
            if (getMessageLength() >= 48) {
                byte[] securityBuffer2 = readSecurityBuffer(40);
                if (securityBuffer2.length != 0) {
                    this.targetInfo = securityBuffer2;
                }
            }
        }

        public byte[] getChallenge() {
            return this.challenge;
        }

        public String getTarget() {
            return this.target;
        }

        public byte[] getTargetInfo() {
            return this.targetInfo;
        }

        public int getFlags() {
            return this.flags;
        }
    }

    public static class Type3Message extends NTLMMessage {
        public final boolean computeMic;
        public final byte[] domainBytes;
        public final byte[] exportedSessionKey;
        public final byte[] hostBytes;
        public byte[] lmResp;
        public byte[] ntResp;
        public final byte[] sessionKey;
        public final byte[] type1Message;
        public final int type2Flags;
        public final byte[] type2Message;
        public final byte[] userBytes;

        public Type3Message(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) throws NTLMEngineException {
            this(str, str2, str3, str4, bArr, i, str5, bArr2, null, null, null);
        }

        public Type3Message(Random random, long j, String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) throws NTLMEngineException {
            this(random, j, str, str2, str3, str4, bArr, i, str5, bArr2, null, null, null);
        }

        public Type3Message(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2, Certificate certificate, byte[] bArr3, byte[] bArr4) throws NTLMEngineException {
            this(NTLMEngineImpl.RND_GEN, System.currentTimeMillis(), str, str2, str3, str4, bArr, i, str5, bArr2, certificate, bArr3, bArr4);
        }

        public Type3Message(Random random, long j, String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2, Certificate certificate, byte[] bArr3, byte[] bArr4) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, NTLMEngineException, InvalidKeyException, CertificateEncodingException {
            byte[] bArr5;
            byte[] lMUserSessionKey;
            if (random == null) {
                throw new NTLMEngineException("Random generator not available");
            }
            this.type2Flags = i;
            this.type1Message = bArr3;
            this.type2Message = bArr4;
            String strConvertHost = NTLMEngineImpl.convertHost(str2);
            String strConvertDomain = NTLMEngineImpl.convertDomain(str);
            if (certificate != null) {
                byte[] bArrAddGssMicAvsToTargetInfo = addGssMicAvsToTargetInfo(bArr2, certificate);
                this.computeMic = true;
                bArr5 = bArrAddGssMicAvsToTargetInfo;
            } else {
                this.computeMic = false;
                bArr5 = bArr2;
            }
            CipherGen cipherGen = new CipherGen(random, j, strConvertDomain, str3, str4, bArr, str5, bArr5);
            try {
                if ((8388608 & i) != 0 && bArr2 != null && str5 != null) {
                    this.ntResp = cipherGen.getNTLMv2Response();
                    this.lmResp = cipherGen.getLMv2Response();
                    if ((i & 128) != 0) {
                        lMUserSessionKey = cipherGen.getLanManagerSessionKey();
                    } else {
                        lMUserSessionKey = cipherGen.getNTLMv2UserSessionKey();
                    }
                } else if ((524288 & i) != 0) {
                    this.ntResp = cipherGen.getNTLM2SessionResponse();
                    this.lmResp = cipherGen.getLM2SessionResponse();
                    if ((i & 128) != 0) {
                        lMUserSessionKey = cipherGen.getLanManagerSessionKey();
                    } else {
                        lMUserSessionKey = cipherGen.getNTLM2SessionResponseUserSessionKey();
                    }
                } else {
                    this.ntResp = cipherGen.getNTLMResponse();
                    this.lmResp = cipherGen.getLMResponse();
                    if ((i & 128) != 0) {
                        lMUserSessionKey = cipherGen.getLanManagerSessionKey();
                    } else {
                        lMUserSessionKey = cipherGen.getNTLMUserSessionKey();
                    }
                }
            } catch (NTLMEngineException unused) {
                this.ntResp = new byte[0];
                this.lmResp = cipherGen.getLMResponse();
                if ((i & 128) != 0) {
                    lMUserSessionKey = cipherGen.getLanManagerSessionKey();
                } else {
                    lMUserSessionKey = cipherGen.getLMUserSessionKey();
                }
            }
            if ((i & 16) != 0) {
                if ((1073741824 & i) != 0) {
                    byte[] secondaryKey = cipherGen.getSecondaryKey();
                    this.exportedSessionKey = secondaryKey;
                    this.sessionKey = NTLMEngineImpl.RC4(secondaryKey, lMUserSessionKey);
                } else {
                    this.sessionKey = lMUserSessionKey;
                    this.exportedSessionKey = lMUserSessionKey;
                }
            } else {
                if (this.computeMic) {
                    throw new NTLMEngineException("Cannot sign/seal: no exported session key");
                }
                this.sessionKey = null;
                this.exportedSessionKey = null;
            }
            Charset charset = NTLMEngineImpl.getCharset(i);
            this.hostBytes = strConvertHost != null ? strConvertHost.getBytes(charset) : null;
            this.domainBytes = strConvertDomain != null ? strConvertDomain.toUpperCase(Locale.ROOT).getBytes(charset) : null;
            this.userBytes = str3.getBytes(charset);
        }

        public byte[] getEncryptedRandomSessionKey() {
            return this.sessionKey;
        }

        public byte[] getExportedSessionKey() {
            return this.exportedSessionKey;
        }

        @Override // org.apache.http.impl.auth.NTLMEngineImpl.NTLMMessage
        public void buildMessage() {
            int i;
            int length = this.ntResp.length;
            int length2 = this.lmResp.length;
            byte[] bArr = this.domainBytes;
            int length3 = bArr != null ? bArr.length : 0;
            byte[] bArr2 = this.hostBytes;
            int length4 = bArr2 != null ? bArr2.length : 0;
            int length5 = this.userBytes.length;
            byte[] bArr3 = this.sessionKey;
            int length6 = bArr3 != null ? bArr3.length : 0;
            int i2 = (this.computeMic ? 16 : 0) + 72;
            int i3 = i2 + length2;
            int i4 = i3 + length;
            int i5 = i4 + length3;
            int i6 = i5 + length5;
            int i7 = i6 + length4;
            prepareResponse(i7 + length6, 3);
            addUShort(length2);
            addUShort(length2);
            addULong(i2);
            addUShort(length);
            addUShort(length);
            addULong(i3);
            addUShort(length3);
            addUShort(length3);
            addULong(i4);
            addUShort(length5);
            addUShort(length5);
            addULong(i5);
            addUShort(length4);
            addUShort(length4);
            addULong(i6);
            addUShort(length6);
            addUShort(length6);
            addULong(i7);
            addULong(this.type2Flags);
            addUShort(261);
            addULong(2600);
            addUShort(3840);
            if (this.computeMic) {
                i = this.currentOutputPosition;
                this.currentOutputPosition = i + 16;
            } else {
                i = -1;
            }
            addBytes(this.lmResp);
            addBytes(this.ntResp);
            addBytes(this.domainBytes);
            addBytes(this.userBytes);
            addBytes(this.hostBytes);
            byte[] bArr4 = this.sessionKey;
            if (bArr4 != null) {
                addBytes(bArr4);
            }
            if (this.computeMic) {
                HMACMD5 hmacmd5 = new HMACMD5(this.exportedSessionKey);
                hmacmd5.update(this.type1Message);
                hmacmd5.update(this.type2Message);
                hmacmd5.update(this.messageContents);
                byte[] output = hmacmd5.getOutput();
                System.arraycopy(output, 0, this.messageContents, i, output.length);
            }
        }

        public final byte[] addGssMicAvsToTargetInfo(byte[] bArr, Certificate certificate) throws NTLMEngineException, CertificateEncodingException {
            byte[] bArr2 = new byte[bArr.length + 28];
            int length = bArr.length;
            int i = length - 4;
            System.arraycopy(bArr, 0, bArr2, 0, i);
            NTLMEngineImpl.writeUShort(bArr2, 6, i);
            NTLMEngineImpl.writeUShort(bArr2, 4, length - 2);
            NTLMEngineImpl.writeULong(bArr2, 2, length);
            NTLMEngineImpl.writeUShort(bArr2, 10, length + 4);
            NTLMEngineImpl.writeUShort(bArr2, 16, length + 6);
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(certificate.getEncoded());
                byte[] bArr3 = new byte[NTLMEngineImpl.MAGIC_TLS_SERVER_ENDPOINT.length + 20 + bArrDigest.length];
                NTLMEngineImpl.writeULong(bArr3, 53, 16);
                System.arraycopy(NTLMEngineImpl.MAGIC_TLS_SERVER_ENDPOINT, 0, bArr3, 20, NTLMEngineImpl.MAGIC_TLS_SERVER_ENDPOINT.length);
                System.arraycopy(bArrDigest, 0, bArr3, NTLMEngineImpl.MAGIC_TLS_SERVER_ENDPOINT.length + 20, bArrDigest.length);
                System.arraycopy(NTLMEngineImpl.getMD5().digest(bArr3), 0, bArr2, length + 8, 16);
                return bArr2;
            } catch (NoSuchAlgorithmException e) {
                throw new NTLMEngineException(e.getMessage(), e);
            } catch (CertificateEncodingException e2) {
                throw new NTLMEngineException(e2.getMessage(), e2);
            }
        }
    }

    public static void writeUShort(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
    }

    public static void writeULong(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >> 16) & 255);
        bArr[i2 + 3] = (byte) ((i >> 24) & 255);
    }

    public static MessageDigest getMD5() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 message digest doesn't seem to exist - fatal error: " + e.getMessage(), e);
        }
    }

    /* loaded from: classes6.dex */
    public static class MD4 {

        /* renamed from: A */
        public int f9928A = 1732584193;

        /* renamed from: B */
        public int f9929B = -271733879;

        /* renamed from: C */
        public int f9930C = -1732584194;

        /* renamed from: D */
        public int f9931D = 271733878;
        public long count = 0;
        public final byte[] dataBuffer = new byte[64];

        public void update(byte[] bArr) {
            byte[] bArr2;
            int i = (int) (this.count & 63);
            int i2 = 0;
            while (true) {
                int length = (bArr.length - i2) + i;
                bArr2 = this.dataBuffer;
                if (length < bArr2.length) {
                    break;
                }
                int length2 = bArr2.length - i;
                System.arraycopy(bArr, i2, bArr2, i, length2);
                this.count += length2;
                i2 += length2;
                processBuffer();
                i = 0;
            }
            if (i2 < bArr.length) {
                int length3 = bArr.length - i2;
                System.arraycopy(bArr, i2, bArr2, i, length3);
                this.count += length3;
            }
        }

        public byte[] getOutput() {
            int i = (int) (this.count & 63);
            int i2 = i < 56 ? 56 - i : 120 - i;
            byte[] bArr = new byte[i2 + 8];
            bArr[0] = Byte.MIN_VALUE;
            for (int i3 = 0; i3 < 8; i3++) {
                bArr[i2 + i3] = (byte) ((this.count * 8) >>> (i3 * 8));
            }
            update(bArr);
            byte[] bArr2 = new byte[16];
            NTLMEngineImpl.writeULong(bArr2, this.f9928A, 0);
            NTLMEngineImpl.writeULong(bArr2, this.f9929B, 4);
            NTLMEngineImpl.writeULong(bArr2, this.f9930C, 8);
            NTLMEngineImpl.writeULong(bArr2, this.f9931D, 12);
            return bArr2;
        }

        public void processBuffer() {
            int[] iArr = new int[16];
            for (int i = 0; i < 16; i++) {
                byte[] bArr = this.dataBuffer;
                int i2 = i * 4;
                iArr[i] = (bArr[i2] & 255) + ((bArr[i2 + 1] & 255) << 8) + ((bArr[i2 + 2] & 255) << 16) + ((bArr[i2 + 3] & 255) << 24);
            }
            int i3 = this.f9928A;
            int i4 = this.f9929B;
            int i5 = this.f9930C;
            int i6 = this.f9931D;
            round1(iArr);
            round2(iArr);
            round3(iArr);
            this.f9928A += i3;
            this.f9929B += i4;
            this.f9930C += i5;
            this.f9931D += i6;
        }

        public void round1(int[] iArr) {
            int iRotintlft = NTLMEngineImpl.rotintlft(this.f9928A + NTLMEngineImpl.m7377F(this.f9929B, this.f9930C, this.f9931D) + iArr[0], 3);
            this.f9928A = iRotintlft;
            int iRotintlft2 = NTLMEngineImpl.rotintlft(this.f9931D + NTLMEngineImpl.m7377F(iRotintlft, this.f9929B, this.f9930C) + iArr[1], 7);
            this.f9931D = iRotintlft2;
            int iRotintlft3 = NTLMEngineImpl.rotintlft(this.f9930C + NTLMEngineImpl.m7377F(iRotintlft2, this.f9928A, this.f9929B) + iArr[2], 11);
            this.f9930C = iRotintlft3;
            int iRotintlft4 = NTLMEngineImpl.rotintlft(this.f9929B + NTLMEngineImpl.m7377F(iRotintlft3, this.f9931D, this.f9928A) + iArr[3], 19);
            this.f9929B = iRotintlft4;
            int iRotintlft5 = NTLMEngineImpl.rotintlft(this.f9928A + NTLMEngineImpl.m7377F(iRotintlft4, this.f9930C, this.f9931D) + iArr[4], 3);
            this.f9928A = iRotintlft5;
            int iRotintlft6 = NTLMEngineImpl.rotintlft(this.f9931D + NTLMEngineImpl.m7377F(iRotintlft5, this.f9929B, this.f9930C) + iArr[5], 7);
            this.f9931D = iRotintlft6;
            int iRotintlft7 = NTLMEngineImpl.rotintlft(this.f9930C + NTLMEngineImpl.m7377F(iRotintlft6, this.f9928A, this.f9929B) + iArr[6], 11);
            this.f9930C = iRotintlft7;
            int iRotintlft8 = NTLMEngineImpl.rotintlft(this.f9929B + NTLMEngineImpl.m7377F(iRotintlft7, this.f9931D, this.f9928A) + iArr[7], 19);
            this.f9929B = iRotintlft8;
            int iRotintlft9 = NTLMEngineImpl.rotintlft(this.f9928A + NTLMEngineImpl.m7377F(iRotintlft8, this.f9930C, this.f9931D) + iArr[8], 3);
            this.f9928A = iRotintlft9;
            int iRotintlft10 = NTLMEngineImpl.rotintlft(this.f9931D + NTLMEngineImpl.m7377F(iRotintlft9, this.f9929B, this.f9930C) + iArr[9], 7);
            this.f9931D = iRotintlft10;
            int iRotintlft11 = NTLMEngineImpl.rotintlft(this.f9930C + NTLMEngineImpl.m7377F(iRotintlft10, this.f9928A, this.f9929B) + iArr[10], 11);
            this.f9930C = iRotintlft11;
            int iRotintlft12 = NTLMEngineImpl.rotintlft(this.f9929B + NTLMEngineImpl.m7377F(iRotintlft11, this.f9931D, this.f9928A) + iArr[11], 19);
            this.f9929B = iRotintlft12;
            int iRotintlft13 = NTLMEngineImpl.rotintlft(this.f9928A + NTLMEngineImpl.m7377F(iRotintlft12, this.f9930C, this.f9931D) + iArr[12], 3);
            this.f9928A = iRotintlft13;
            int iRotintlft14 = NTLMEngineImpl.rotintlft(this.f9931D + NTLMEngineImpl.m7377F(iRotintlft13, this.f9929B, this.f9930C) + iArr[13], 7);
            this.f9931D = iRotintlft14;
            int iRotintlft15 = NTLMEngineImpl.rotintlft(this.f9930C + NTLMEngineImpl.m7377F(iRotintlft14, this.f9928A, this.f9929B) + iArr[14], 11);
            this.f9930C = iRotintlft15;
            this.f9929B = NTLMEngineImpl.rotintlft(this.f9929B + NTLMEngineImpl.m7377F(iRotintlft15, this.f9931D, this.f9928A) + iArr[15], 19);
        }

        public void round2(int[] iArr) {
            int iRotintlft = NTLMEngineImpl.rotintlft(this.f9928A + NTLMEngineImpl.m7378G(this.f9929B, this.f9930C, this.f9931D) + iArr[0] + 1518500249, 3);
            this.f9928A = iRotintlft;
            int iRotintlft2 = NTLMEngineImpl.rotintlft(this.f9931D + NTLMEngineImpl.m7378G(iRotintlft, this.f9929B, this.f9930C) + iArr[4] + 1518500249, 5);
            this.f9931D = iRotintlft2;
            int iRotintlft3 = NTLMEngineImpl.rotintlft(this.f9930C + NTLMEngineImpl.m7378G(iRotintlft2, this.f9928A, this.f9929B) + iArr[8] + 1518500249, 9);
            this.f9930C = iRotintlft3;
            int iRotintlft4 = NTLMEngineImpl.rotintlft(this.f9929B + NTLMEngineImpl.m7378G(iRotintlft3, this.f9931D, this.f9928A) + iArr[12] + 1518500249, 13);
            this.f9929B = iRotintlft4;
            int iRotintlft5 = NTLMEngineImpl.rotintlft(this.f9928A + NTLMEngineImpl.m7378G(iRotintlft4, this.f9930C, this.f9931D) + iArr[1] + 1518500249, 3);
            this.f9928A = iRotintlft5;
            int iRotintlft6 = NTLMEngineImpl.rotintlft(this.f9931D + NTLMEngineImpl.m7378G(iRotintlft5, this.f9929B, this.f9930C) + iArr[5] + 1518500249, 5);
            this.f9931D = iRotintlft6;
            int iRotintlft7 = NTLMEngineImpl.rotintlft(this.f9930C + NTLMEngineImpl.m7378G(iRotintlft6, this.f9928A, this.f9929B) + iArr[9] + 1518500249, 9);
            this.f9930C = iRotintlft7;
            int iRotintlft8 = NTLMEngineImpl.rotintlft(this.f9929B + NTLMEngineImpl.m7378G(iRotintlft7, this.f9931D, this.f9928A) + iArr[13] + 1518500249, 13);
            this.f9929B = iRotintlft8;
            int iRotintlft9 = NTLMEngineImpl.rotintlft(this.f9928A + NTLMEngineImpl.m7378G(iRotintlft8, this.f9930C, this.f9931D) + iArr[2] + 1518500249, 3);
            this.f9928A = iRotintlft9;
            int iRotintlft10 = NTLMEngineImpl.rotintlft(this.f9931D + NTLMEngineImpl.m7378G(iRotintlft9, this.f9929B, this.f9930C) + iArr[6] + 1518500249, 5);
            this.f9931D = iRotintlft10;
            int iRotintlft11 = NTLMEngineImpl.rotintlft(this.f9930C + NTLMEngineImpl.m7378G(iRotintlft10, this.f9928A, this.f9929B) + iArr[10] + 1518500249, 9);
            this.f9930C = iRotintlft11;
            int iRotintlft12 = NTLMEngineImpl.rotintlft(this.f9929B + NTLMEngineImpl.m7378G(iRotintlft11, this.f9931D, this.f9928A) + iArr[14] + 1518500249, 13);
            this.f9929B = iRotintlft12;
            int iRotintlft13 = NTLMEngineImpl.rotintlft(this.f9928A + NTLMEngineImpl.m7378G(iRotintlft12, this.f9930C, this.f9931D) + iArr[3] + 1518500249, 3);
            this.f9928A = iRotintlft13;
            int iRotintlft14 = NTLMEngineImpl.rotintlft(this.f9931D + NTLMEngineImpl.m7378G(iRotintlft13, this.f9929B, this.f9930C) + iArr[7] + 1518500249, 5);
            this.f9931D = iRotintlft14;
            int iRotintlft15 = NTLMEngineImpl.rotintlft(this.f9930C + NTLMEngineImpl.m7378G(iRotintlft14, this.f9928A, this.f9929B) + iArr[11] + 1518500249, 9);
            this.f9930C = iRotintlft15;
            this.f9929B = NTLMEngineImpl.rotintlft(this.f9929B + NTLMEngineImpl.m7378G(iRotintlft15, this.f9931D, this.f9928A) + iArr[15] + 1518500249, 13);
        }

        public void round3(int[] iArr) {
            int iRotintlft = NTLMEngineImpl.rotintlft(this.f9928A + NTLMEngineImpl.m7379H(this.f9929B, this.f9930C, this.f9931D) + iArr[0] + 1859775393, 3);
            this.f9928A = iRotintlft;
            int iRotintlft2 = NTLMEngineImpl.rotintlft(this.f9931D + NTLMEngineImpl.m7379H(iRotintlft, this.f9929B, this.f9930C) + iArr[8] + 1859775393, 9);
            this.f9931D = iRotintlft2;
            int iRotintlft3 = NTLMEngineImpl.rotintlft(this.f9930C + NTLMEngineImpl.m7379H(iRotintlft2, this.f9928A, this.f9929B) + iArr[4] + 1859775393, 11);
            this.f9930C = iRotintlft3;
            int iRotintlft4 = NTLMEngineImpl.rotintlft(this.f9929B + NTLMEngineImpl.m7379H(iRotintlft3, this.f9931D, this.f9928A) + iArr[12] + 1859775393, 15);
            this.f9929B = iRotintlft4;
            int iRotintlft5 = NTLMEngineImpl.rotintlft(this.f9928A + NTLMEngineImpl.m7379H(iRotintlft4, this.f9930C, this.f9931D) + iArr[2] + 1859775393, 3);
            this.f9928A = iRotintlft5;
            int iRotintlft6 = NTLMEngineImpl.rotintlft(this.f9931D + NTLMEngineImpl.m7379H(iRotintlft5, this.f9929B, this.f9930C) + iArr[10] + 1859775393, 9);
            this.f9931D = iRotintlft6;
            int iRotintlft7 = NTLMEngineImpl.rotintlft(this.f9930C + NTLMEngineImpl.m7379H(iRotintlft6, this.f9928A, this.f9929B) + iArr[6] + 1859775393, 11);
            this.f9930C = iRotintlft7;
            int iRotintlft8 = NTLMEngineImpl.rotintlft(this.f9929B + NTLMEngineImpl.m7379H(iRotintlft7, this.f9931D, this.f9928A) + iArr[14] + 1859775393, 15);
            this.f9929B = iRotintlft8;
            int iRotintlft9 = NTLMEngineImpl.rotintlft(this.f9928A + NTLMEngineImpl.m7379H(iRotintlft8, this.f9930C, this.f9931D) + iArr[1] + 1859775393, 3);
            this.f9928A = iRotintlft9;
            int iRotintlft10 = NTLMEngineImpl.rotintlft(this.f9931D + NTLMEngineImpl.m7379H(iRotintlft9, this.f9929B, this.f9930C) + iArr[9] + 1859775393, 9);
            this.f9931D = iRotintlft10;
            int iRotintlft11 = NTLMEngineImpl.rotintlft(this.f9930C + NTLMEngineImpl.m7379H(iRotintlft10, this.f9928A, this.f9929B) + iArr[5] + 1859775393, 11);
            this.f9930C = iRotintlft11;
            int iRotintlft12 = NTLMEngineImpl.rotintlft(this.f9929B + NTLMEngineImpl.m7379H(iRotintlft11, this.f9931D, this.f9928A) + iArr[13] + 1859775393, 15);
            this.f9929B = iRotintlft12;
            int iRotintlft13 = NTLMEngineImpl.rotintlft(this.f9928A + NTLMEngineImpl.m7379H(iRotintlft12, this.f9930C, this.f9931D) + iArr[3] + 1859775393, 3);
            this.f9928A = iRotintlft13;
            int iRotintlft14 = NTLMEngineImpl.rotintlft(this.f9931D + NTLMEngineImpl.m7379H(iRotintlft13, this.f9929B, this.f9930C) + iArr[11] + 1859775393, 9);
            this.f9931D = iRotintlft14;
            int iRotintlft15 = NTLMEngineImpl.rotintlft(this.f9930C + NTLMEngineImpl.m7379H(iRotintlft14, this.f9928A, this.f9929B) + iArr[7] + 1859775393, 11);
            this.f9930C = iRotintlft15;
            this.f9929B = NTLMEngineImpl.rotintlft(this.f9929B + NTLMEngineImpl.m7379H(iRotintlft15, this.f9931D, this.f9928A) + iArr[15] + 1859775393, 15);
        }
    }

    /* loaded from: classes6.dex */
    public static class HMACMD5 {
        public final byte[] ipad;
        public final MessageDigest md5;
        public final byte[] opad;

        public HMACMD5(byte[] bArr) {
            MessageDigest md5 = NTLMEngineImpl.getMD5();
            this.md5 = md5;
            this.ipad = new byte[64];
            this.opad = new byte[64];
            int length = bArr.length;
            if (length > 64) {
                md5.update(bArr);
                bArr = md5.digest();
                length = bArr.length;
            }
            int i = 0;
            while (i < length) {
                this.ipad[i] = (byte) (54 ^ bArr[i]);
                this.opad[i] = (byte) (92 ^ bArr[i]);
                i++;
            }
            while (i < 64) {
                this.ipad[i] = TarConstants.LF_FIFO;
                this.opad[i] = UTF8JsonGenerator.BYTE_BACKSLASH;
                i++;
            }
            this.md5.reset();
            this.md5.update(this.ipad);
        }

        public byte[] getOutput() {
            byte[] bArrDigest = this.md5.digest();
            this.md5.update(this.opad);
            return this.md5.digest(bArrDigest);
        }

        public void update(byte[] bArr) {
            this.md5.update(bArr);
        }

        public void update(byte[] bArr, int i, int i2) {
            this.md5.update(bArr, i, i2);
        }
    }

    @Override // org.apache.http.impl.auth.NTLMEngine
    public String generateType1Msg(String str, String str2) throws NTLMEngineException {
        return getType1Message(str2, str);
    }

    @Override // org.apache.http.impl.auth.NTLMEngine
    public String generateType3Msg(String str, String str2, String str3, String str4, String str5) throws NTLMEngineException {
        Type2Message type2Message = new Type2Message(str5);
        return getType3Message(str, str2, str4, str3, type2Message.getChallenge(), type2Message.getFlags(), type2Message.getTarget(), type2Message.getTargetInfo());
    }
}
