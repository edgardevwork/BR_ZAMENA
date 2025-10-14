package ru.rustore.sdk.coreui;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: DialogState.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\r"}, m7105d2 = {"Lru/rustore/sdk/coreui/DialogState;", "", "cancelButtonTextRes", "", "getCancelButtonTextRes", "()Ljava/lang/Integer;", "confirmButtonTextRes", "getConfirmButtonTextRes", "messageRes", "getMessageRes", "()I", "titleRes", "getTitleRes", "sdk-public-coreui_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public interface DialogState {
    @Nullable
    Integer getCancelButtonTextRes();

    @Nullable
    Integer getConfirmButtonTextRes();

    int getMessageRes();

    int getTitleRes();
}
