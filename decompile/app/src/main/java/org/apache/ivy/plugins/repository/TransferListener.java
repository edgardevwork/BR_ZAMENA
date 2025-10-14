package org.apache.ivy.plugins.repository;

import java.util.EventListener;

/* loaded from: classes6.dex */
public interface TransferListener extends EventListener {
    void transferProgress(TransferEvent transferEvent);
}
