package org.apache.ivy.plugins.repository;

import java.io.File;
import org.apache.ivy.core.event.IvyEvent;
import org.apache.ivy.osgi.obr.xml.OBRXMLParser;

/* loaded from: classes5.dex */
public class TransferEvent extends IvyEvent {
    public static final int LAST_EVENT_TYPE = 4;
    public static final int REQUEST_GET = 5;
    public static final int REQUEST_PUT = 6;
    public static final int TRANSFER_COMPLETED = 2;
    public static final String TRANSFER_COMPLETED_NAME = "transfer-completed";
    public static final int TRANSFER_ERROR = 4;
    public static final String TRANSFER_ERROR_NAME = "transfer-error";
    public static final int TRANSFER_INITIATED = 0;
    public static final String TRANSFER_INITIATED_NAME = "transfer-initiated";
    public static final int TRANSFER_PROGRESS = 3;
    public static final String TRANSFER_PROGRESS_NAME = "transfer-progress";
    public static final int TRANSFER_STARTED = 1;
    public static final String TRANSFER_STARTED_NAME = "transfer-started";
    public int eventType;
    public Exception exception;
    public boolean isTotalLengthSet;
    public long length;
    public File localFile;
    public Repository repository;
    public int requestType;
    public Resource resource;
    public long[] timeTracking;
    public long totalLength;

    public TransferEvent(Repository repository, Resource resource, int i, int i2) {
        super(getName(i));
        this.isTotalLengthSet = false;
        this.timeTracking = new long[5];
        this.repository = repository;
        setResource(resource);
        setEventType(i);
        setRequestType(i2);
    }

    public TransferEvent(Repository repository, Resource resource, Exception exc, int i) {
        this(repository, resource, 4, i);
        this.exception = exc;
    }

    public TransferEvent(Repository repository, Resource resource, long j, int i) {
        this(repository, resource, 3, i);
        this.length = j;
        this.totalLength = j;
    }

    public static String getName(int i) {
        if (i == 0) {
            return TRANSFER_INITIATED_NAME;
        }
        if (i == 1) {
            return TRANSFER_STARTED_NAME;
        }
        if (i == 2) {
            return TRANSFER_COMPLETED_NAME;
        }
        if (i == 3) {
            return TRANSFER_PROGRESS_NAME;
        }
        if (i != 4) {
            return null;
        }
        return TRANSFER_ERROR_NAME;
    }

    public Resource getResource() {
        return this.resource;
    }

    public Exception getException() {
        return this.exception;
    }

    public int getRequestType() {
        return this.requestType;
    }

    public void setRequestType(int i) {
        if (i != 5 && i != 6) {
            throw new IllegalArgumentException("Illegal request type: " + i);
        }
        this.requestType = i;
        addAttribute("request-type", i == 5 ? "get" : "put");
    }

    public int getEventType() {
        return this.eventType;
    }

    public void setEventType(int i) {
        checkEventType(i);
        if (this.eventType != i) {
            this.eventType = i;
            this.timeTracking[i] = System.currentTimeMillis();
            if (i > 0) {
                addAttribute("total-duration", String.valueOf(getElapsedTime(0, i)));
                if (i > 1) {
                    addAttribute("duration", String.valueOf(getElapsedTime(1, i)));
                }
            }
        }
    }

    public void setResource(Resource resource) {
        this.resource = resource;
        addAttribute(OBRXMLParser.ResourceHandler.RESOURCE, resource.getName());
    }

    public File getLocalFile() {
        return this.localFile;
    }

    public void setLocalFile(File file) {
        this.localFile = file;
    }

    public long getLength() {
        return this.length;
    }

    public void setLength(long j) {
        this.length = j;
    }

    public long getTotalLength() {
        return this.totalLength;
    }

    public void setTotalLength(long j) {
        this.totalLength = j;
    }

    public void setException(Exception exc) {
        this.exception = exc;
    }

    public boolean isTotalLengthSet() {
        return this.isTotalLengthSet;
    }

    public void setTotalLengthSet(boolean z) {
        this.isTotalLengthSet = z;
    }

    public Repository getRepository() {
        return this.repository;
    }

    public long getElapsedTime(int i, int i2) {
        checkEventType(i);
        checkEventType(i2);
        long[] jArr = this.timeTracking;
        long j = jArr[i];
        long j2 = jArr[i2];
        if (j == 0 || j2 == 0) {
            return -1L;
        }
        if (j2 < j) {
            return 0L;
        }
        return j2 - j;
    }

    public final void checkEventType(int i) {
        if (i < 0 || i > 4) {
            throw new IllegalArgumentException("invalid event type " + i);
        }
    }
}
