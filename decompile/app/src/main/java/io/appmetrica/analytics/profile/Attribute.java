package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C8790B4;
import io.appmetrica.analytics.impl.C8797Bb;
import io.appmetrica.analytics.impl.C9413am;
import io.appmetrica.analytics.impl.C9677lb;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes5.dex */
public final class Attribute {
    @NonNull
    public static BirthDateAttribute birthDate() {
        return new BirthDateAttribute();
    }

    @NonNull
    public static BooleanAttribute customBoolean(@NonNull String str) {
        return new BooleanAttribute(str, new C9677lb(), new C8797Bb(new C8790B4(100)));
    }

    @NonNull
    public static CounterAttribute customCounter(@NonNull String str) {
        return new CounterAttribute(str, new C9677lb(), new C8797Bb(new C8790B4(100)));
    }

    @NonNull
    public static NumberAttribute customNumber(@NonNull String str) {
        return new NumberAttribute(str, new C9677lb(), new C8797Bb(new C8790B4(100)));
    }

    @NonNull
    public static StringAttribute customString(@NonNull String str) {
        return new StringAttribute(str, new C9413am(200, "String attribute \"" + str + "\"", PublicLogger.getAnonymousInstance()), new C9677lb(), new C8797Bb(new C8790B4(100)));
    }

    @NonNull
    public static GenderAttribute gender() {
        return new GenderAttribute();
    }

    @NonNull
    public static NameAttribute name() {
        return new NameAttribute();
    }

    @NonNull
    public static NotificationsEnabledAttribute notificationsEnabled() {
        return new NotificationsEnabledAttribute();
    }
}
