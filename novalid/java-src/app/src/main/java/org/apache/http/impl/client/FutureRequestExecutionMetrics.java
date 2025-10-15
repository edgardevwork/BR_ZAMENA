package org.apache.http.impl.client;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public final class FutureRequestExecutionMetrics {
    public final AtomicLong activeConnections = new AtomicLong();
    public final AtomicLong scheduledConnections = new AtomicLong();
    public final DurationCounter successfulConnections = new DurationCounter();
    public final DurationCounter failedConnections = new DurationCounter();
    public final DurationCounter requests = new DurationCounter();
    public final DurationCounter tasks = new DurationCounter();

    public AtomicLong getActiveConnections() {
        return this.activeConnections;
    }

    public AtomicLong getScheduledConnections() {
        return this.scheduledConnections;
    }

    public DurationCounter getSuccessfulConnections() {
        return this.successfulConnections;
    }

    public DurationCounter getFailedConnections() {
        return this.failedConnections;
    }

    public DurationCounter getRequests() {
        return this.requests;
    }

    public DurationCounter getTasks() {
        return this.tasks;
    }

    public long getActiveConnectionCount() {
        return this.activeConnections.get();
    }

    public long getScheduledConnectionCount() {
        return this.scheduledConnections.get();
    }

    public long getSuccessfulConnectionCount() {
        return this.successfulConnections.count();
    }

    public long getSuccessfulConnectionAverageDuration() {
        return this.successfulConnections.averageDuration();
    }

    public long getFailedConnectionCount() {
        return this.failedConnections.count();
    }

    public long getFailedConnectionAverageDuration() {
        return this.failedConnections.averageDuration();
    }

    public long getRequestCount() {
        return this.requests.count();
    }

    public long getRequestAverageDuration() {
        return this.requests.averageDuration();
    }

    public long getTaskCount() {
        return this.tasks.count();
    }

    public long getTaskAverageDuration() {
        return this.tasks.averageDuration();
    }

    public String toString() {
        return "[activeConnections=" + this.activeConnections + ", scheduledConnections=" + this.scheduledConnections + ", successfulConnections=" + this.successfulConnections + ", failedConnections=" + this.failedConnections + ", requests=" + this.requests + ", tasks=" + this.tasks + "]";
    }

    public static class DurationCounter {
        public final AtomicLong count = new AtomicLong(0);
        public final AtomicLong cumulativeDuration = new AtomicLong(0);

        public void increment(long j) {
            this.count.incrementAndGet();
            this.cumulativeDuration.addAndGet(System.currentTimeMillis() - j);
        }

        public long count() {
            return this.count.get();
        }

        public long averageDuration() {
            long j = this.count.get();
            if (j > 0) {
                return this.cumulativeDuration.get() / j;
            }
            return 0L;
        }

        public String toString() {
            return "[count=" + count() + ", averageDuration=" + averageDuration() + "]";
        }
    }
}
