package io.ktor.util;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.slf4j.LoggerFactory;

/* compiled from: Nonce.kt */
@Metadata(m7104d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0012\u001a\u00020\u0013H\u0000\u001a\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0002\u001a\b\u0010\u0017\u001a\u00020\u0015H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\r\"\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, m7105d2 = {"INSECURE_NONCE_COUNT_FACTOR", "", "NonceGeneratorCoroutineName", "Lkotlinx/coroutines/CoroutineName;", "SECURE_NONCE_COUNT", "SECURE_RANDOM_PROVIDERS", "", "", "SECURE_RESEED_PERIOD", NonceKt.SHA1PRNG, "nonceGeneratorJob", "Lkotlinx/coroutines/Job;", "getNonceGeneratorJob$annotations", "()V", "seedChannel", "Lkotlinx/coroutines/channels/Channel;", "getSeedChannel", "()Lkotlinx/coroutines/channels/Channel;", "ensureNonceGeneratorRunning", "", "getInstanceOrNull", "Ljava/security/SecureRandom;", "name", "lookupSecureRandom", "ktor-utils"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nNonce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nonce.kt\nio/ktor/util/NonceKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
/* loaded from: classes7.dex */
public final class NonceKt {
    public static final int INSECURE_NONCE_COUNT_FACTOR = 4;

    @NotNull
    public static final CoroutineName NonceGeneratorCoroutineName;
    public static final int SECURE_NONCE_COUNT = 8;
    public static final int SECURE_RESEED_PERIOD = 30000;

    @NotNull
    public static final String SHA1PRNG = "SHA1PRNG";

    @NotNull
    public static final Job nonceGeneratorJob;

    @NotNull
    public static final List<String> SECURE_RANDOM_PROVIDERS = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"NativePRNGNonBlocking", "WINDOWS-PRNG", "DRBG"});

    @NotNull
    public static final Channel<String> seedChannel = ChannelKt.Channel$default(1024, null, null, 6, null);

    public static /* synthetic */ void getNonceGeneratorJob$annotations() {
    }

    static {
        CoroutineName coroutineName = new CoroutineName("nonce-generator");
        NonceGeneratorCoroutineName = coroutineName;
        nonceGeneratorJob = BuildersKt.launch(GlobalScope.INSTANCE, Dispatchers.getIO().plus(NonCancellable.INSTANCE).plus(coroutineName), CoroutineStart.LAZY, new NonceKt$nonceGeneratorJob$1(null));
    }

    @NotNull
    public static final Channel<String> getSeedChannel() {
        return seedChannel;
    }

    public static final void ensureNonceGeneratorRunning() {
        nonceGeneratorJob.start();
    }

    public static final SecureRandom lookupSecureRandom() throws NoSuchAlgorithmException {
        SecureRandom instanceOrNull;
        String property = System.getProperty("io.ktor.random.secure.random.provider");
        if (property != null && (instanceOrNull = getInstanceOrNull(property)) != null) {
            return instanceOrNull;
        }
        Iterator<String> it = SECURE_RANDOM_PROVIDERS.iterator();
        while (it.hasNext()) {
            SecureRandom instanceOrNull2 = getInstanceOrNull(it.next());
            if (instanceOrNull2 != null) {
                return instanceOrNull2;
            }
        }
        LoggerFactory.getLogger("io.ktor.util.random").warn("None of the " + CollectionsKt___CollectionsKt.joinToString$default(SECURE_RANDOM_PROVIDERS, ", ", null, null, 0, null, null, 62, null) + " found, fallback to default");
        SecureRandom instanceOrNull$default = getInstanceOrNull$default(null, 1, null);
        if (instanceOrNull$default != null) {
            return instanceOrNull$default;
        }
        throw new IllegalStateException("No SecureRandom implementation found".toString());
    }

    public static /* synthetic */ SecureRandom getInstanceOrNull$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return getInstanceOrNull(str);
    }

    public static final SecureRandom getInstanceOrNull(String str) throws NoSuchAlgorithmException {
        SecureRandom secureRandom;
        try {
            if (str != null) {
                secureRandom = SecureRandom.getInstance(str);
            } else {
                secureRandom = new SecureRandom();
            }
            return secureRandom;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
