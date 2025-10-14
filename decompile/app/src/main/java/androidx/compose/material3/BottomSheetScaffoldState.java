package androidx.compose.material3;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: BottomSheetScaffold.kt */
@Stable
@ExperimentalMaterial3Api
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m7105d2 = {"Landroidx/compose/material3/BottomSheetScaffoldState;", "", "bottomSheetState", "Landroidx/compose/material3/SheetState;", "snackbarHostState", "Landroidx/compose/material3/SnackbarHostState;", "(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;)V", "getBottomSheetState", "()Landroidx/compose/material3/SheetState;", "getSnackbarHostState", "()Landroidx/compose/material3/SnackbarHostState;", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class BottomSheetScaffoldState {
    public static final int $stable = 0;

    @NotNull
    private final SheetState bottomSheetState;

    @NotNull
    private final SnackbarHostState snackbarHostState;

    public BottomSheetScaffoldState(@NotNull SheetState sheetState, @NotNull SnackbarHostState snackbarHostState) {
        this.bottomSheetState = sheetState;
        this.snackbarHostState = snackbarHostState;
    }

    @NotNull
    public final SheetState getBottomSheetState() {
        return this.bottomSheetState;
    }

    @NotNull
    public final SnackbarHostState getSnackbarHostState() {
        return this.snackbarHostState;
    }
}
