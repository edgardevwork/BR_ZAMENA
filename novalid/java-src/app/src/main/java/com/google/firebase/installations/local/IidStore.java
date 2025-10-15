package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.stats.CodePackage;
import com.google.common.base.Ascii;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.jfrog.build.api.util.FileChecksumCalculator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class IidStore {
    private static final String[] ALLOWABLE_SCOPES = {"*", FirebaseMessaging.INSTANCE_ID_SCOPE, CodePackage.GCM, ""};
    private static final String IID_SHARED_PREFS_NAME = "com.google.android.gms.appid";
    private static final String JSON_ENCODED_PREFIX = "{";
    private static final String JSON_TOKEN_KEY = "token";
    private static final String STORE_KEY_ID = "|S|id";
    private static final String STORE_KEY_PUB = "|S||P|";
    private static final String STORE_KEY_SEPARATOR = "|";
    private static final String STORE_KEY_TOKEN = "|T|";
    private final String defaultSenderId;

    @GuardedBy("iidPrefs")
    private final SharedPreferences iidPrefs;

    public IidStore(@NonNull FirebaseApp firebaseApp) {
        this.iidPrefs = firebaseApp.getApplicationContext().getSharedPreferences(IID_SHARED_PREFS_NAME, 0);
        this.defaultSenderId = getDefaultSenderId(firebaseApp);
    }

    @VisibleForTesting
    public IidStore(@NonNull SharedPreferences sharedPreferences, @Nullable String str) {
        this.iidPrefs = sharedPreferences;
        this.defaultSenderId = str;
    }

    private static String getDefaultSenderId(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:") && !applicationId.startsWith("2:")) {
            return applicationId;
        }
        String[] strArrSplit = applicationId.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private String createTokenKey(@NonNull String str, @NonNull String str2) {
        return STORE_KEY_TOKEN + str + STORE_KEY_SEPARATOR + str2;
    }

    @Nullable
    public String readToken() {
        synchronized (this.iidPrefs) {
            try {
                for (String str : ALLOWABLE_SCOPES) {
                    String string = this.iidPrefs.getString(createTokenKey(this.defaultSenderId, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = parseIidTokenFromJson(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private String parseIidTokenFromJson(String str) {
        try {
            return new JSONObject(str).getString(JSON_TOKEN_KEY);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    public String readIid() {
        synchronized (this.iidPrefs) {
            try {
                String instanceIdFromLocalStorage = readInstanceIdFromLocalStorage();
                if (instanceIdFromLocalStorage != null) {
                    return instanceIdFromLocalStorage;
                }
                return readPublicKeyFromLocalStorageAndCalculateInstanceId();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    private String readInstanceIdFromLocalStorage() {
        String string;
        synchronized (this.iidPrefs) {
            string = this.iidPrefs.getString(STORE_KEY_ID, null);
        }
        return string;
    }

    @Nullable
    private String readPublicKeyFromLocalStorageAndCalculateInstanceId() {
        synchronized (this.iidPrefs) {
            try {
                String string = this.iidPrefs.getString(STORE_KEY_PUB, null);
                if (string == null) {
                    return null;
                }
                PublicKey key = parseKey(string);
                if (key == null) {
                    return null;
                }
                return getIdFromPublicKey(key);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    private static String getIdFromPublicKey(@NonNull PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance(FileChecksumCalculator.SHA1_ALGORITHM).digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & Ascii.f786SI) + 112) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    @Nullable
    private PublicKey parseKey(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored " + e);
            return null;
        }
    }
}
