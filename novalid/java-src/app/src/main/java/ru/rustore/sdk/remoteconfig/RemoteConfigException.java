package ru.rustore.sdk.remoteconfig;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\u001b\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m7105d2 = {"Lru/rustore/sdk/remoteconfig/RemoteConfigException;", "", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "cause", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getMessage", "()Ljava/lang/String;", "BackgroundConfigUpdateError", "FailedToReceiveRemoteConfig", "RemoteConfigCastException", "RemoteConfigClientAlreadyExist", "RemoteConfigClientNotCreated", "RemoteConfigCommonException", "RemoteConfigNetworkException", "Lru/rustore/sdk/remoteconfig/RemoteConfigException$BackgroundConfigUpdateError;", "Lru/rustore/sdk/remoteconfig/RemoteConfigException$FailedToReceiveRemoteConfig;", "Lru/rustore/sdk/remoteconfig/RemoteConfigException$RemoteConfigCastException;", "Lru/rustore/sdk/remoteconfig/RemoteConfigException$RemoteConfigClientAlreadyExist;", "Lru/rustore/sdk/remoteconfig/RemoteConfigException$RemoteConfigClientNotCreated;", "Lru/rustore/sdk/remoteconfig/RemoteConfigException$RemoteConfigCommonException;", "Lru/rustore/sdk/remoteconfig/RemoteConfigException$RemoteConfigNetworkException;", "sdk-public-remoteconfig_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public abstract class RemoteConfigException extends Throwable {
    public final Throwable cause;
    public final String message;

    @Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m7105d2 = {"Lru/rustore/sdk/remoteconfig/RemoteConfigException$BackgroundConfigUpdateError;", "Lru/rustore/sdk/remoteconfig/RemoteConfigException;", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk-public-remoteconfig_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final /* data */ class BackgroundConfigUpdateError extends RemoteConfigException {
        public final Throwable cause;
        public final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BackgroundConfigUpdateError(String message, Throwable th) {
            super(message, th, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.cause = th;
        }

        public static /* synthetic */ BackgroundConfigUpdateError copy$default(BackgroundConfigUpdateError backgroundConfigUpdateError, String str, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                str = backgroundConfigUpdateError.message;
            }
            if ((i & 2) != 0) {
                th = backgroundConfigUpdateError.cause;
            }
            return backgroundConfigUpdateError.copy(str, th);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        public final BackgroundConfigUpdateError copy(String str, Throwable cause) {
            Intrinsics.checkNotNullParameter(str, "message");
            return new BackgroundConfigUpdateError(str, cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BackgroundConfigUpdateError)) {
                return false;
            }
            BackgroundConfigUpdateError backgroundConfigUpdateError = (BackgroundConfigUpdateError) other;
            return Intrinsics.areEqual(this.message, backgroundConfigUpdateError.message) && Intrinsics.areEqual(this.cause, backgroundConfigUpdateError.cause);
        }

        @Override // ru.rustore.sdk.remoteconfig.RemoteConfigException, java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // ru.rustore.sdk.remoteconfig.RemoteConfigException, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            Throwable th = this.cause;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "BackgroundConfigUpdateError(message=" + this.message + ", cause=" + this.cause + ')';
        }

        public /* synthetic */ BackgroundConfigUpdateError(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }
    }

    @Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m7105d2 = {"Lru/rustore/sdk/remoteconfig/RemoteConfigException$FailedToReceiveRemoteConfig;", "Lru/rustore/sdk/remoteconfig/RemoteConfigException;", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk-public-remoteconfig_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final /* data */ class FailedToReceiveRemoteConfig extends RemoteConfigException {
        public final Throwable cause;
        public final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedToReceiveRemoteConfig(String message, Throwable th) {
            super(message, th, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.cause = th;
        }

        public static /* synthetic */ FailedToReceiveRemoteConfig copy$default(FailedToReceiveRemoteConfig failedToReceiveRemoteConfig, String str, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failedToReceiveRemoteConfig.message;
            }
            if ((i & 2) != 0) {
                th = failedToReceiveRemoteConfig.cause;
            }
            return failedToReceiveRemoteConfig.copy(str, th);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        public final FailedToReceiveRemoteConfig copy(String str, Throwable cause) {
            Intrinsics.checkNotNullParameter(str, "message");
            return new FailedToReceiveRemoteConfig(str, cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FailedToReceiveRemoteConfig)) {
                return false;
            }
            FailedToReceiveRemoteConfig failedToReceiveRemoteConfig = (FailedToReceiveRemoteConfig) other;
            return Intrinsics.areEqual(this.message, failedToReceiveRemoteConfig.message) && Intrinsics.areEqual(this.cause, failedToReceiveRemoteConfig.cause);
        }

        @Override // ru.rustore.sdk.remoteconfig.RemoteConfigException, java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // ru.rustore.sdk.remoteconfig.RemoteConfigException, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            Throwable th = this.cause;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "FailedToReceiveRemoteConfig(message=" + this.message + ", cause=" + this.cause + ')';
        }

        public /* synthetic */ FailedToReceiveRemoteConfig(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }
    }

    @Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m7105d2 = {"Lru/rustore/sdk/remoteconfig/RemoteConfigException$RemoteConfigCastException;", "Lru/rustore/sdk/remoteconfig/RemoteConfigException;", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk-public-remoteconfig_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final /* data */ class RemoteConfigCastException extends RemoteConfigException {
        public final Throwable cause;
        public final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteConfigCastException(String message, Throwable th) {
            super(message, th, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.cause = th;
        }

        public static /* synthetic */ RemoteConfigCastException copy$default(RemoteConfigCastException remoteConfigCastException, String str, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                str = remoteConfigCastException.message;
            }
            if ((i & 2) != 0) {
                th = remoteConfigCastException.cause;
            }
            return remoteConfigCastException.copy(str, th);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        public final RemoteConfigCastException copy(String str, Throwable cause) {
            Intrinsics.checkNotNullParameter(str, "message");
            return new RemoteConfigCastException(str, cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RemoteConfigCastException)) {
                return false;
            }
            RemoteConfigCastException remoteConfigCastException = (RemoteConfigCastException) other;
            return Intrinsics.areEqual(this.message, remoteConfigCastException.message) && Intrinsics.areEqual(this.cause, remoteConfigCastException.cause);
        }

        @Override // ru.rustore.sdk.remoteconfig.RemoteConfigException, java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // ru.rustore.sdk.remoteconfig.RemoteConfigException, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            Throwable th = this.cause;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "RemoteConfigCastException(message=" + this.message + ", cause=" + this.cause + ')';
        }

        public /* synthetic */ RemoteConfigCastException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }
    }

    @Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m7105d2 = {"Lru/rustore/sdk/remoteconfig/RemoteConfigException$RemoteConfigClientAlreadyExist;", "Lru/rustore/sdk/remoteconfig/RemoteConfigException;", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk-public-remoteconfig_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final /* data */ class RemoteConfigClientAlreadyExist extends RemoteConfigException {
        public final Throwable cause;
        public final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteConfigClientAlreadyExist(String message, Throwable th) {
            super(message, th, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.cause = th;
        }

        public static /* synthetic */ RemoteConfigClientAlreadyExist copy$default(RemoteConfigClientAlreadyExist remoteConfigClientAlreadyExist, String str, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                str = remoteConfigClientAlreadyExist.message;
            }
            if ((i & 2) != 0) {
                th = remoteConfigClientAlreadyExist.cause;
            }
            return remoteConfigClientAlreadyExist.copy(str, th);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        public final RemoteConfigClientAlreadyExist copy(String str, Throwable cause) {
            Intrinsics.checkNotNullParameter(str, "message");
            return new RemoteConfigClientAlreadyExist(str, cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RemoteConfigClientAlreadyExist)) {
                return false;
            }
            RemoteConfigClientAlreadyExist remoteConfigClientAlreadyExist = (RemoteConfigClientAlreadyExist) other;
            return Intrinsics.areEqual(this.message, remoteConfigClientAlreadyExist.message) && Intrinsics.areEqual(this.cause, remoteConfigClientAlreadyExist.cause);
        }

        @Override // ru.rustore.sdk.remoteconfig.RemoteConfigException, java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // ru.rustore.sdk.remoteconfig.RemoteConfigException, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            Throwable th = this.cause;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "RemoteConfigClientAlreadyExist(message=" + this.message + ", cause=" + this.cause + ')';
        }

        public /* synthetic */ RemoteConfigClientAlreadyExist(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }
    }

    @Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m7105d2 = {"Lru/rustore/sdk/remoteconfig/RemoteConfigException$RemoteConfigClientNotCreated;", "Lru/rustore/sdk/remoteconfig/RemoteConfigException;", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk-public-remoteconfig_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final /* data */ class RemoteConfigClientNotCreated extends RemoteConfigException {
        public final Throwable cause;
        public final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteConfigClientNotCreated(String message, Throwable th) {
            super(message, th, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.cause = th;
        }

        public static /* synthetic */ RemoteConfigClientNotCreated copy$default(RemoteConfigClientNotCreated remoteConfigClientNotCreated, String str, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                str = remoteConfigClientNotCreated.message;
            }
            if ((i & 2) != 0) {
                th = remoteConfigClientNotCreated.cause;
            }
            return remoteConfigClientNotCreated.copy(str, th);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        public final RemoteConfigClientNotCreated copy(String str, Throwable cause) {
            Intrinsics.checkNotNullParameter(str, "message");
            return new RemoteConfigClientNotCreated(str, cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RemoteConfigClientNotCreated)) {
                return false;
            }
            RemoteConfigClientNotCreated remoteConfigClientNotCreated = (RemoteConfigClientNotCreated) other;
            return Intrinsics.areEqual(this.message, remoteConfigClientNotCreated.message) && Intrinsics.areEqual(this.cause, remoteConfigClientNotCreated.cause);
        }

        @Override // ru.rustore.sdk.remoteconfig.RemoteConfigException, java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // ru.rustore.sdk.remoteconfig.RemoteConfigException, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            Throwable th = this.cause;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "RemoteConfigClientNotCreated(message=" + this.message + ", cause=" + this.cause + ')';
        }

        public /* synthetic */ RemoteConfigClientNotCreated(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }
    }

    @Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m7105d2 = {"Lru/rustore/sdk/remoteconfig/RemoteConfigException$RemoteConfigCommonException;", "Lru/rustore/sdk/remoteconfig/RemoteConfigException;", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk-public-remoteconfig_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final /* data */ class RemoteConfigCommonException extends RemoteConfigException {
        public final Throwable cause;
        public final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteConfigCommonException(String message, Throwable th) {
            super(message, th, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.cause = th;
        }

        public static /* synthetic */ RemoteConfigCommonException copy$default(RemoteConfigCommonException remoteConfigCommonException, String str, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                str = remoteConfigCommonException.message;
            }
            if ((i & 2) != 0) {
                th = remoteConfigCommonException.cause;
            }
            return remoteConfigCommonException.copy(str, th);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        public final RemoteConfigCommonException copy(String str, Throwable cause) {
            Intrinsics.checkNotNullParameter(str, "message");
            return new RemoteConfigCommonException(str, cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RemoteConfigCommonException)) {
                return false;
            }
            RemoteConfigCommonException remoteConfigCommonException = (RemoteConfigCommonException) other;
            return Intrinsics.areEqual(this.message, remoteConfigCommonException.message) && Intrinsics.areEqual(this.cause, remoteConfigCommonException.cause);
        }

        @Override // ru.rustore.sdk.remoteconfig.RemoteConfigException, java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // ru.rustore.sdk.remoteconfig.RemoteConfigException, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            Throwable th = this.cause;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "RemoteConfigCommonException(message=" + this.message + ", cause=" + this.cause + ')';
        }

        public /* synthetic */ RemoteConfigCommonException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }
    }

    @Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m7105d2 = {"Lru/rustore/sdk/remoteconfig/RemoteConfigException$RemoteConfigNetworkException;", "Lru/rustore/sdk/remoteconfig/RemoteConfigException;", "code", "", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "cause", "", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "sdk-public-remoteconfig_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final /* data */ class RemoteConfigNetworkException extends RemoteConfigException {
        public final Throwable cause;
        public final int code;
        public final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteConfigNetworkException(int i, String message, Throwable th) {
            super(message, th, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.code = i;
            this.message = message;
            this.cause = th;
        }

        public static /* synthetic */ RemoteConfigNetworkException copy$default(RemoteConfigNetworkException remoteConfigNetworkException, int i, String str, Throwable th, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = remoteConfigNetworkException.code;
            }
            if ((i2 & 2) != 0) {
                str = remoteConfigNetworkException.message;
            }
            if ((i2 & 4) != 0) {
                th = remoteConfigNetworkException.cause;
            }
            return remoteConfigNetworkException.copy(i, str, th);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component3, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        public final RemoteConfigNetworkException copy(int code, String str, Throwable cause) {
            Intrinsics.checkNotNullParameter(str, "message");
            return new RemoteConfigNetworkException(code, str, cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RemoteConfigNetworkException)) {
                return false;
            }
            RemoteConfigNetworkException remoteConfigNetworkException = (RemoteConfigNetworkException) other;
            return this.code == remoteConfigNetworkException.code && Intrinsics.areEqual(this.message, remoteConfigNetworkException.message) && Intrinsics.areEqual(this.cause, remoteConfigNetworkException.cause);
        }

        @Override // ru.rustore.sdk.remoteconfig.RemoteConfigException, java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        public final int getCode() {
            return this.code;
        }

        @Override // ru.rustore.sdk.remoteconfig.RemoteConfigException, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iHashCode = (this.message.hashCode() + (Integer.hashCode(this.code) * 31)) * 31;
            Throwable th = this.cause;
            return iHashCode + (th == null ? 0 : th.hashCode());
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "RemoteConfigNetworkException(code=" + this.code + ", message=" + this.message + ", cause=" + this.cause + ')';
        }

        public /* synthetic */ RemoteConfigNetworkException(int i, String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, (i2 & 4) != 0 ? null : th);
        }
    }

    public RemoteConfigException(String str, Throwable th) {
        super(str, th);
        this.message = str;
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public /* synthetic */ RemoteConfigException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th, null);
    }

    public /* synthetic */ RemoteConfigException(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th);
    }
}
