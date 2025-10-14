package androidx.media3.exoplayer.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C2732C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DefaultDrmSession;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@RequiresApi(18)
@UnstableApi
/* loaded from: classes.dex */
public class DefaultDrmSessionManager implements DrmSessionManager {
    public static final long DEFAULT_SESSION_KEEPALIVE_MS = 300000;
    public static final int INITIAL_DRM_REQUEST_RETRY_COUNT = 3;
    public static final int MODE_DOWNLOAD = 2;
    public static final int MODE_PLAYBACK = 0;
    public static final int MODE_QUERY = 1;
    public static final int MODE_RELEASE = 3;
    public static final String PLAYREADY_CUSTOM_DATA_KEY = "PRCustomData";
    public static final String TAG = "DefaultDrmSessionMgr";
    public final MediaDrmCallback callback;

    @Nullable
    public ExoMediaDrm exoMediaDrm;
    public final ExoMediaDrm.Provider exoMediaDrmProvider;
    public final Set<DefaultDrmSession> keepaliveSessions;
    public final HashMap<String, String> keyRequestParameters;
    public final LoadErrorHandlingPolicy loadErrorHandlingPolicy;

    @Nullable
    public volatile MediaDrmHandler mediaDrmHandler;
    public int mode;
    public final boolean multiSession;

    @Nullable
    public DefaultDrmSession noMultiSessionDrmSession;

    @Nullable
    public byte[] offlineLicenseKeySetId;

    @Nullable
    public DefaultDrmSession placeholderDrmSession;
    public final boolean playClearSamplesWithoutKeys;
    public Handler playbackHandler;
    public Looper playbackLooper;
    public PlayerId playerId;
    public final Set<PreacquiredSessionReference> preacquiredSessionReferences;
    public int prepareCallsCount;
    public final ProvisioningManagerImpl provisioningManagerImpl;
    public final ReferenceCountListenerImpl referenceCountListener;
    public final long sessionKeepaliveMs;
    public final List<DefaultDrmSession> sessions;
    public final int[] useDrmSessionsForClearContentTrackTypes;
    public final UUID uuid;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface Mode {
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        public boolean multiSession;
        public final HashMap<String, String> keyRequestParameters = new HashMap<>();
        public UUID uuid = C2732C.WIDEVINE_UUID;
        public ExoMediaDrm.Provider exoMediaDrmProvider = FrameworkMediaDrm.DEFAULT_PROVIDER;
        public int[] useDrmSessionsForClearContentTrackTypes = new int[0];
        public boolean playClearSamplesWithoutKeys = true;
        public LoadErrorHandlingPolicy loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
        public long sessionKeepaliveMs = 300000;

        @CanIgnoreReturnValue
        public Builder setKeyRequestParameters(@Nullable Map<String, String> map) {
            this.keyRequestParameters.clear();
            if (map != null) {
                this.keyRequestParameters.putAll(map);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUuidAndExoMediaDrmProvider(UUID uuid, ExoMediaDrm.Provider provider) {
            this.uuid = (UUID) Assertions.checkNotNull(uuid);
            this.exoMediaDrmProvider = (ExoMediaDrm.Provider) Assertions.checkNotNull(provider);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMultiSession(boolean z) {
            this.multiSession = z;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUseDrmSessionsForClearContent(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (i != 2 && i != 1) {
                    z = false;
                }
                Assertions.checkArgument(z);
            }
            this.useDrmSessionsForClearContentTrackTypes = (int[]) iArr.clone();
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPlayClearSamplesWithoutKeys(boolean z) {
            this.playClearSamplesWithoutKeys = z;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.loadErrorHandlingPolicy = (LoadErrorHandlingPolicy) Assertions.checkNotNull(loadErrorHandlingPolicy);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSessionKeepaliveMs(long j) {
            Assertions.checkArgument(j > 0 || j == C2732C.TIME_UNSET);
            this.sessionKeepaliveMs = j;
            return this;
        }

        public DefaultDrmSessionManager build(MediaDrmCallback mediaDrmCallback) {
            return new DefaultDrmSessionManager(this.uuid, this.exoMediaDrmProvider, mediaDrmCallback, this.keyRequestParameters, this.multiSession, this.useDrmSessionsForClearContentTrackTypes, this.playClearSamplesWithoutKeys, this.loadErrorHandlingPolicy, this.sessionKeepaliveMs);
        }
    }

    /* loaded from: classes4.dex */
    public static final class MissingSchemeDataException extends Exception {
        public MissingSchemeDataException(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm.Provider provider, MediaDrmCallback mediaDrmCallback, HashMap<String, String> map, boolean z, int[] iArr, boolean z2, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j) {
        Assertions.checkNotNull(uuid);
        Assertions.checkArgument(!C2732C.COMMON_PSSH_UUID.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.uuid = uuid;
        this.exoMediaDrmProvider = provider;
        this.callback = mediaDrmCallback;
        this.keyRequestParameters = map;
        this.multiSession = z;
        this.useDrmSessionsForClearContentTrackTypes = iArr;
        this.playClearSamplesWithoutKeys = z2;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.provisioningManagerImpl = new ProvisioningManagerImpl();
        this.referenceCountListener = new ReferenceCountListenerImpl();
        this.mode = 0;
        this.sessions = new ArrayList();
        this.preacquiredSessionReferences = Sets.newIdentityHashSet();
        this.keepaliveSessions = Sets.newIdentityHashSet();
        this.sessionKeepaliveMs = j;
    }

    public void setMode(int i, @Nullable byte[] bArr) {
        Assertions.checkState(this.sessions.isEmpty());
        if (i == 1 || i == 3) {
            Assertions.checkNotNull(bArr);
        }
        this.mode = i;
        this.offlineLicenseKeySetId = bArr;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public final void prepare() {
        verifyPlaybackThread(true);
        int i = this.prepareCallsCount;
        this.prepareCallsCount = i + 1;
        if (i != 0) {
            return;
        }
        if (this.exoMediaDrm == null) {
            ExoMediaDrm exoMediaDrmAcquireExoMediaDrm = this.exoMediaDrmProvider.acquireExoMediaDrm(this.uuid);
            this.exoMediaDrm = exoMediaDrmAcquireExoMediaDrm;
            exoMediaDrmAcquireExoMediaDrm.setOnEventListener(new MediaDrmEventListener());
        } else if (this.sessionKeepaliveMs != C2732C.TIME_UNSET) {
            for (int i2 = 0; i2 < this.sessions.size(); i2++) {
                this.sessions.get(i2).acquire(null);
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public final void release() {
        verifyPlaybackThread(true);
        int i = this.prepareCallsCount - 1;
        this.prepareCallsCount = i;
        if (i != 0) {
            return;
        }
        if (this.sessionKeepaliveMs != C2732C.TIME_UNSET) {
            ArrayList arrayList = new ArrayList(this.sessions);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((DefaultDrmSession) arrayList.get(i2)).release(null);
            }
        }
        releaseAllPreacquiredSessions();
        maybeReleaseMediaDrm();
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public void setPlayer(Looper looper, PlayerId playerId) {
        initPlaybackLooper(looper);
        this.playerId = playerId;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public DrmSessionManager.DrmSessionReference preacquireSession(@Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        Assertions.checkState(this.prepareCallsCount > 0);
        Assertions.checkStateNotNull(this.playbackLooper);
        PreacquiredSessionReference preacquiredSessionReference = new PreacquiredSessionReference(eventDispatcher);
        preacquiredSessionReference.acquire(format);
        return preacquiredSessionReference;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    @Nullable
    public DrmSession acquireSession(@Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        verifyPlaybackThread(false);
        Assertions.checkState(this.prepareCallsCount > 0);
        Assertions.checkStateNotNull(this.playbackLooper);
        return acquireSession(this.playbackLooper, eventDispatcher, format, true);
    }

    @Nullable
    public final DrmSession acquireSession(Looper looper, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format, boolean z) {
        List<DrmInitData.SchemeData> schemeDatas;
        maybeCreateMediaDrmHandler(looper);
        DrmInitData drmInitData = format.drmInitData;
        if (drmInitData == null) {
            return maybeAcquirePlaceholderSession(MimeTypes.getTrackType(format.sampleMimeType), z);
        }
        DefaultDrmSession defaultDrmSessionCreateAndAcquireSessionWithRetry = null;
        byte b = 0;
        if (this.offlineLicenseKeySetId == null) {
            schemeDatas = getSchemeDatas((DrmInitData) Assertions.checkNotNull(drmInitData), this.uuid, false);
            if (schemeDatas.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.uuid);
                Log.m632e(TAG, "DRM error", missingSchemeDataException);
                if (eventDispatcher != null) {
                    eventDispatcher.drmSessionManagerError(missingSchemeDataException);
                }
                return new ErrorStateDrmSession(new DrmSession.DrmSessionException(missingSchemeDataException, PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR));
            }
        } else {
            schemeDatas = null;
        }
        if (!this.multiSession) {
            defaultDrmSessionCreateAndAcquireSessionWithRetry = this.noMultiSessionDrmSession;
        } else {
            Iterator<DefaultDrmSession> it = this.sessions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DefaultDrmSession next = it.next();
                if (Util.areEqual(next.schemeDatas, schemeDatas)) {
                    defaultDrmSessionCreateAndAcquireSessionWithRetry = next;
                    break;
                }
            }
        }
        if (defaultDrmSessionCreateAndAcquireSessionWithRetry == null) {
            defaultDrmSessionCreateAndAcquireSessionWithRetry = createAndAcquireSessionWithRetry(schemeDatas, false, eventDispatcher, z);
            if (!this.multiSession) {
                this.noMultiSessionDrmSession = defaultDrmSessionCreateAndAcquireSessionWithRetry;
            }
            this.sessions.add(defaultDrmSessionCreateAndAcquireSessionWithRetry);
        } else {
            defaultDrmSessionCreateAndAcquireSessionWithRetry.acquire(eventDispatcher);
        }
        return defaultDrmSessionCreateAndAcquireSessionWithRetry;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public int getCryptoType(Format format) {
        verifyPlaybackThread(false);
        int cryptoType = ((ExoMediaDrm) Assertions.checkNotNull(this.exoMediaDrm)).getCryptoType();
        DrmInitData drmInitData = format.drmInitData;
        if (drmInitData == null) {
            if (Util.linearSearch(this.useDrmSessionsForClearContentTrackTypes, MimeTypes.getTrackType(format.sampleMimeType)) != -1) {
                return cryptoType;
            }
            return 0;
        }
        if (canAcquireSession(drmInitData)) {
            return cryptoType;
        }
        return 1;
    }

    @Nullable
    public final DrmSession maybeAcquirePlaceholderSession(int i, boolean z) {
        ExoMediaDrm exoMediaDrm = (ExoMediaDrm) Assertions.checkNotNull(this.exoMediaDrm);
        if ((exoMediaDrm.getCryptoType() == 2 && FrameworkCryptoConfig.WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC) || Util.linearSearch(this.useDrmSessionsForClearContentTrackTypes, i) == -1 || exoMediaDrm.getCryptoType() == 1) {
            return null;
        }
        DefaultDrmSession defaultDrmSession = this.placeholderDrmSession;
        if (defaultDrmSession == null) {
            DefaultDrmSession defaultDrmSessionCreateAndAcquireSessionWithRetry = createAndAcquireSessionWithRetry(ImmutableList.m1171of(), true, null, z);
            this.sessions.add(defaultDrmSessionCreateAndAcquireSessionWithRetry);
            this.placeholderDrmSession = defaultDrmSessionCreateAndAcquireSessionWithRetry;
        } else {
            defaultDrmSession.acquire(null);
        }
        return this.placeholderDrmSession;
    }

    public final boolean canAcquireSession(DrmInitData drmInitData) {
        if (this.offlineLicenseKeySetId != null) {
            return true;
        }
        if (getSchemeDatas(drmInitData, this.uuid, true).isEmpty()) {
            if (drmInitData.schemeDataCount != 1 || !drmInitData.get(0).matches(C2732C.COMMON_PSSH_UUID)) {
                return false;
            }
            Log.m635w(TAG, "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.uuid);
        }
        String str = drmInitData.schemeType;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return C2732C.CENC_TYPE_cbcs.equals(str) ? Util.SDK_INT >= 25 : (C2732C.CENC_TYPE_cbc1.equals(str) || C2732C.CENC_TYPE_cens.equals(str)) ? false : true;
    }

    @EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    public final synchronized void initPlaybackLooper(Looper looper) {
        try {
            Looper looper2 = this.playbackLooper;
            if (looper2 == null) {
                this.playbackLooper = looper;
                this.playbackHandler = new Handler(looper);
            } else {
                Assertions.checkState(looper2 == looper);
                Assertions.checkNotNull(this.playbackHandler);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void maybeCreateMediaDrmHandler(Looper looper) {
        if (this.mediaDrmHandler == null) {
            this.mediaDrmHandler = new MediaDrmHandler(looper);
        }
    }

    public final DefaultDrmSession createAndAcquireSessionWithRetry(@Nullable List<DrmInitData.SchemeData> list, boolean z, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, boolean z2) {
        DefaultDrmSession defaultDrmSessionCreateAndAcquireSession = createAndAcquireSession(list, z, eventDispatcher);
        if (acquisitionFailedIndicatingResourceShortage(defaultDrmSessionCreateAndAcquireSession) && !this.keepaliveSessions.isEmpty()) {
            releaseAllKeepaliveSessions();
            undoAcquisition(defaultDrmSessionCreateAndAcquireSession, eventDispatcher);
            defaultDrmSessionCreateAndAcquireSession = createAndAcquireSession(list, z, eventDispatcher);
        }
        if (!acquisitionFailedIndicatingResourceShortage(defaultDrmSessionCreateAndAcquireSession) || !z2 || this.preacquiredSessionReferences.isEmpty()) {
            return defaultDrmSessionCreateAndAcquireSession;
        }
        releaseAllPreacquiredSessions();
        if (!this.keepaliveSessions.isEmpty()) {
            releaseAllKeepaliveSessions();
        }
        undoAcquisition(defaultDrmSessionCreateAndAcquireSession, eventDispatcher);
        return createAndAcquireSession(list, z, eventDispatcher);
    }

    public static boolean acquisitionFailedIndicatingResourceShortage(DrmSession drmSession) {
        if (drmSession.getState() != 1) {
            return false;
        }
        Throwable cause = ((DrmSession.DrmSessionException) Assertions.checkNotNull(drmSession.getError())).getCause();
        return Util.SDK_INT < 19 || (cause instanceof ResourceBusyException) || DrmUtil.isFailureToConstructResourceBusyException(cause);
    }

    public final void undoAcquisition(DrmSession drmSession, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher) {
        drmSession.release(eventDispatcher);
        if (this.sessionKeepaliveMs != C2732C.TIME_UNSET) {
            drmSession.release(null);
        }
    }

    public final void releaseAllKeepaliveSessions() {
        UnmodifiableIterator it = ImmutableSet.copyOf((Collection) this.keepaliveSessions).iterator();
        while (it.hasNext()) {
            ((DrmSession) it.next()).release(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void releaseAllPreacquiredSessions() {
        UnmodifiableIterator it = ImmutableSet.copyOf((Collection) this.preacquiredSessionReferences).iterator();
        while (it.hasNext()) {
            ((PreacquiredSessionReference) it.next()).release();
        }
    }

    public final DefaultDrmSession createAndAcquireSession(@Nullable List<DrmInitData.SchemeData> list, boolean z, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher) {
        Assertions.checkNotNull(this.exoMediaDrm);
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.uuid, this.exoMediaDrm, this.provisioningManagerImpl, this.referenceCountListener, list, this.mode, this.playClearSamplesWithoutKeys | z, z, this.offlineLicenseKeySetId, this.keyRequestParameters, this.callback, (Looper) Assertions.checkNotNull(this.playbackLooper), this.loadErrorHandlingPolicy, (PlayerId) Assertions.checkNotNull(this.playerId));
        defaultDrmSession.acquire(eventDispatcher);
        if (this.sessionKeepaliveMs != C2732C.TIME_UNSET) {
            defaultDrmSession.acquire(null);
        }
        return defaultDrmSession;
    }

    public final void maybeReleaseMediaDrm() {
        if (this.exoMediaDrm != null && this.prepareCallsCount == 0 && this.sessions.isEmpty() && this.preacquiredSessionReferences.isEmpty()) {
            ((ExoMediaDrm) Assertions.checkNotNull(this.exoMediaDrm)).release();
            this.exoMediaDrm = null;
        }
    }

    public final void verifyPlaybackThread(boolean z) {
        if (z && this.playbackLooper == null) {
            Log.m636w(TAG, "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) Assertions.checkNotNull(this.playbackLooper)).getThread()) {
            Log.m636w(TAG, "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.playbackLooper.getThread().getName(), new IllegalStateException());
        }
    }

    public static List<DrmInitData.SchemeData> getSchemeDatas(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.schemeDataCount);
        for (int i = 0; i < drmInitData.schemeDataCount; i++) {
            DrmInitData.SchemeData schemeData = drmInitData.get(i);
            if ((schemeData.matches(uuid) || (C2732C.CLEARKEY_UUID.equals(uuid) && schemeData.matches(C2732C.COMMON_PSSH_UUID))) && (schemeData.data != null || z)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes4.dex */
    public class MediaDrmHandler extends Handler {
        public MediaDrmHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.sessions) {
                if (defaultDrmSession.hasSessionId(bArr)) {
                    defaultDrmSession.onMediaDrmEvent(message.what);
                    return;
                }
            }
        }
    }

    public class ProvisioningManagerImpl implements DefaultDrmSession.ProvisioningManager {

        @Nullable
        public DefaultDrmSession provisioningSession;
        public final Set<DefaultDrmSession> sessionsAwaitingProvisioning = new HashSet();

        public ProvisioningManagerImpl() {
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager
        public void provisionRequired(DefaultDrmSession defaultDrmSession) {
            this.sessionsAwaitingProvisioning.add(defaultDrmSession);
            if (this.provisioningSession != null) {
                return;
            }
            this.provisioningSession = defaultDrmSession;
            defaultDrmSession.provision();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager
        public void onProvisionCompleted() {
            this.provisioningSession = null;
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) this.sessionsAwaitingProvisioning);
            this.sessionsAwaitingProvisioning.clear();
            UnmodifiableIterator it = immutableListCopyOf.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).onProvisionCompleted();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager
        public void onProvisionError(Exception exc, boolean z) {
            this.provisioningSession = null;
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) this.sessionsAwaitingProvisioning);
            this.sessionsAwaitingProvisioning.clear();
            UnmodifiableIterator it = immutableListCopyOf.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).onProvisionError(exc, z);
            }
        }

        public void onSessionFullyReleased(DefaultDrmSession defaultDrmSession) {
            this.sessionsAwaitingProvisioning.remove(defaultDrmSession);
            if (this.provisioningSession == defaultDrmSession) {
                this.provisioningSession = null;
                if (this.sessionsAwaitingProvisioning.isEmpty()) {
                    return;
                }
                DefaultDrmSession next = this.sessionsAwaitingProvisioning.iterator().next();
                this.provisioningSession = next;
                next.provision();
            }
        }
    }

    public class ReferenceCountListenerImpl implements DefaultDrmSession.ReferenceCountListener {
        public ReferenceCountListenerImpl() {
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ReferenceCountListener
        public void onReferenceCountIncremented(DefaultDrmSession defaultDrmSession, int i) {
            if (DefaultDrmSessionManager.this.sessionKeepaliveMs != C2732C.TIME_UNSET) {
                DefaultDrmSessionManager.this.keepaliveSessions.remove(defaultDrmSession);
                ((Handler) Assertions.checkNotNull(DefaultDrmSessionManager.this.playbackHandler)).removeCallbacksAndMessages(defaultDrmSession);
            }
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ReferenceCountListener
        public void onReferenceCountDecremented(final DefaultDrmSession defaultDrmSession, int i) {
            if (i == 1 && DefaultDrmSessionManager.this.prepareCallsCount > 0 && DefaultDrmSessionManager.this.sessionKeepaliveMs != C2732C.TIME_UNSET) {
                DefaultDrmSessionManager.this.keepaliveSessions.add(defaultDrmSession);
                ((Handler) Assertions.checkNotNull(DefaultDrmSessionManager.this.playbackHandler)).postAtTime(new Runnable() { // from class: androidx.media3.exoplayer.drm.DefaultDrmSessionManager$ReferenceCountListenerImpl$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        defaultDrmSession.release(null);
                    }
                }, defaultDrmSession, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.sessionKeepaliveMs);
            } else if (i == 0) {
                DefaultDrmSessionManager.this.sessions.remove(defaultDrmSession);
                if (DefaultDrmSessionManager.this.placeholderDrmSession == defaultDrmSession) {
                    DefaultDrmSessionManager.this.placeholderDrmSession = null;
                }
                if (DefaultDrmSessionManager.this.noMultiSessionDrmSession == defaultDrmSession) {
                    DefaultDrmSessionManager.this.noMultiSessionDrmSession = null;
                }
                DefaultDrmSessionManager.this.provisioningManagerImpl.onSessionFullyReleased(defaultDrmSession);
                if (DefaultDrmSessionManager.this.sessionKeepaliveMs != C2732C.TIME_UNSET) {
                    ((Handler) Assertions.checkNotNull(DefaultDrmSessionManager.this.playbackHandler)).removeCallbacksAndMessages(defaultDrmSession);
                    DefaultDrmSessionManager.this.keepaliveSessions.remove(defaultDrmSession);
                }
            }
            DefaultDrmSessionManager.this.maybeReleaseMediaDrm();
        }
    }

    public class MediaDrmEventListener implements ExoMediaDrm.OnEventListener {
        public MediaDrmEventListener() {
        }

        @Override // androidx.media3.exoplayer.drm.ExoMediaDrm.OnEventListener
        public void onEvent(ExoMediaDrm exoMediaDrm, @Nullable byte[] bArr, int i, int i2, @Nullable byte[] bArr2) {
            ((MediaDrmHandler) Assertions.checkNotNull(DefaultDrmSessionManager.this.mediaDrmHandler)).obtainMessage(i, bArr).sendToTarget();
        }
    }

    public class PreacquiredSessionReference implements DrmSessionManager.DrmSessionReference {

        @Nullable
        public final DrmSessionEventListener.EventDispatcher eventDispatcher;
        public boolean isReleased;

        @Nullable
        public DrmSession session;

        public PreacquiredSessionReference(@Nullable DrmSessionEventListener.EventDispatcher eventDispatcher) {
            this.eventDispatcher = eventDispatcher;
        }

        public void acquire(final Format format) {
            ((Handler) Assertions.checkNotNull(DefaultDrmSessionManager.this.playbackHandler)).post(new Runnable() { // from class: androidx.media3.exoplayer.drm.DefaultDrmSessionManager$PreacquiredSessionReference$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$acquire$0(format);
                }
            });
        }

        public final /* synthetic */ void lambda$acquire$0(Format format) {
            if (DefaultDrmSessionManager.this.prepareCallsCount == 0 || this.isReleased) {
                return;
            }
            DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
            this.session = defaultDrmSessionManager.acquireSession((Looper) Assertions.checkNotNull(defaultDrmSessionManager.playbackLooper), this.eventDispatcher, format, false);
            DefaultDrmSessionManager.this.preacquiredSessionReferences.add(this);
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference
        public void release() {
            Util.postOrRun((Handler) Assertions.checkNotNull(DefaultDrmSessionManager.this.playbackHandler), new Runnable() { // from class: androidx.media3.exoplayer.drm.DefaultDrmSessionManager$PreacquiredSessionReference$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$release$1();
                }
            });
        }

        public final /* synthetic */ void lambda$release$1() {
            if (this.isReleased) {
                return;
            }
            DrmSession drmSession = this.session;
            if (drmSession != null) {
                drmSession.release(this.eventDispatcher);
            }
            DefaultDrmSessionManager.this.preacquiredSessionReferences.remove(this);
            this.isReleased = true;
        }
    }
}
