package org.apache.commons.p059io.input;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.p059io.input.ObservableInputStream;

/* loaded from: classes5.dex */
public class TimestampedObserver extends ObservableInputStream.Observer {
    public volatile Instant closeInstant;
    public final Instant openInstant = Instant.now();

    @Override // org.apache.commons.io.input.ObservableInputStream.Observer
    public void closed() throws IOException {
        this.closeInstant = Instant.now();
    }

    public Instant getCloseInstant() {
        return this.closeInstant;
    }

    public Duration getOpenToCloseDuration() {
        return Duration.between(this.openInstant, this.closeInstant);
    }

    public Duration getOpenToNowDuration() {
        return Duration.between(this.openInstant, Instant.now());
    }

    public Instant getOpenInstant() {
        return this.openInstant;
    }

    public String toString() {
        return "TimestampedObserver [openInstant=" + this.openInstant + ", closeInstant=" + this.closeInstant + "]";
    }
}
