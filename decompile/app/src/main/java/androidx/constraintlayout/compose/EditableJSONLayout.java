package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableState;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.Registry;
import androidx.constraintlayout.core.state.RegistryCallback;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import org.intellij.lang.annotations.Language;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConstraintLayout.kt */
@Metadata(m7104d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\t\b!\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0013\u001a\u00020\u0003J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u0015\u001a\u00020\bJ\b\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\u0006\u0010\u0018\u001a\u00020\u0003J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0004J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\nH\u0004J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\nH\u0004J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0014J\u0016\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\nJ\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&H\u0014J\u000e\u0010'\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0003J\u0010\u0010(\u001a\u00020\u001b2\b\u0010)\u001a\u0004\u0018\u00010\u0003J\u0010\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u0003H\u0016J\u0014\u0010,\u001a\u00020\u001b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0\u0012J\b\u0010.\u001a\u00020\u001bH\u0004R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, m7105d2 = {"Landroidx/constraintlayout/compose/EditableJSONLayout;", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "content", "", "(Ljava/lang/String;)V", "currentContent", "debugName", "forcedDrawDebug", "Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "forcedHeight", "", "forcedWidth", "last", "", "layoutInformation", "layoutInformationMode", "Landroidx/constraintlayout/compose/LayoutInfoFlags;", "updateFlag", "Landroidx/compose/runtime/MutableState;", "getCurrentContent", "getDebugName", "getForcedDrawDebug", "getForcedHeight", "getForcedWidth", "getLayoutInformation", "getLayoutInformationMode", "initialization", "", "onDrawDebug", "debugMode", "onLayoutInformation", "mode", "onNewContent", "onNewDimensions", "width", "height", "onNewProgress", "progress", "", "setCurrentContent", "setDebugName", "name", "setLayoutInformation", TtmlNode.TAG_INFORMATION, "setUpdateFlag", "needsUpdate", "signalUpdate", "compose_release"}, m7106k = 1, m7107mv = {1, 5, 1}, m7109xi = 48)
@PublishedApi
/* loaded from: classes4.dex */
public abstract class EditableJSONLayout implements LayoutInformationReceiver {

    @NotNull
    public String currentContent;

    @Nullable
    public String debugName;

    @NotNull
    public MotionLayoutDebugFlags forcedDrawDebug;
    public int forcedHeight;
    public int forcedWidth;
    public long last;

    @NotNull
    public String layoutInformation;

    @NotNull
    public LayoutInfoFlags layoutInformationMode;

    @Nullable
    public MutableState<Long> updateFlag;

    public void onNewProgress(float progress) {
    }

    public EditableJSONLayout(@Language("json5") @NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.forcedWidth = Integer.MIN_VALUE;
        this.forcedHeight = Integer.MIN_VALUE;
        this.forcedDrawDebug = MotionLayoutDebugFlags.UNKNOWN;
        this.layoutInformationMode = LayoutInfoFlags.NONE;
        this.layoutInformation = "";
        this.last = System.nanoTime();
        this.currentContent = content;
    }

    public final void initialization() {
        try {
            onNewContent(this.currentContent);
            if (this.debugName != null) {
                Registry.getInstance().register(this.debugName, new RegistryCallback() { // from class: androidx.constraintlayout.compose.EditableJSONLayout$initialization$callback$1
                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void onNewMotionScene(@Nullable String content) {
                        if (content == null) {
                            return;
                        }
                        this.this$0.onNewContent(content);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void onProgress(float progress) {
                        this.this$0.onNewProgress(progress);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void onDimensions(int width, int height) {
                        this.this$0.onNewDimensions(width, height);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    @NotNull
                    public String currentMotionScene() {
                        return this.this$0.currentContent;
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    @NotNull
                    public String currentLayoutInformation() {
                        return this.this$0.layoutInformation;
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void setLayoutInformationMode(int mode) {
                        this.this$0.onLayoutInformation(mode);
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public long getLastModified() {
                        return this.this$0.last;
                    }

                    @Override // androidx.constraintlayout.core.state.RegistryCallback
                    public void setDrawDebug(int debugMode) {
                        this.this$0.onDrawDebug(debugMode);
                    }
                });
            }
        } catch (CLParsingException unused) {
        }
    }

    public final void setUpdateFlag(@NotNull MutableState<Long> needsUpdate) {
        Intrinsics.checkNotNullParameter(needsUpdate, "needsUpdate");
        this.updateFlag = needsUpdate;
    }

    public final void signalUpdate() {
        MutableState<Long> mutableState = this.updateFlag;
        if (mutableState != null) {
            Intrinsics.checkNotNull(mutableState);
            MutableState<Long> mutableState2 = this.updateFlag;
            Intrinsics.checkNotNull(mutableState2);
            mutableState.setValue(Long.valueOf(mutableState2.getValue().longValue() + 1));
        }
    }

    public final void setCurrentContent(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        onNewContent(content);
    }

    @NotNull
    public final String getCurrentContent() {
        return this.currentContent;
    }

    public final void setDebugName(@Nullable String name) {
        this.debugName = name;
    }

    @Nullable
    public final String getDebugName() {
        return this.debugName;
    }

    @NotNull
    public final MotionLayoutDebugFlags getForcedDrawDebug() {
        return this.forcedDrawDebug;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public int getForcedWidth() {
        return this.forcedWidth;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public int getForcedHeight() {
        return this.forcedHeight;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    public void setLayoutInformation(@NotNull String information) {
        Intrinsics.checkNotNullParameter(information, "information");
        this.last = System.nanoTime();
        this.layoutInformation = information;
    }

    @NotNull
    public final String getLayoutInformation() {
        return this.layoutInformation;
    }

    @Override // androidx.constraintlayout.compose.LayoutInformationReceiver
    @NotNull
    public LayoutInfoFlags getLayoutInformationMode() {
        return this.layoutInformationMode;
    }

    public void onNewContent(@NotNull String content) {
        CLObject objectOrNull;
        Intrinsics.checkNotNullParameter(content, "content");
        this.currentContent = content;
        try {
            CLObject cLObject = CLParser.parse(content);
            if (cLObject != null) {
                boolean z = this.debugName == null;
                if (z && (objectOrNull = cLObject.getObjectOrNull("Header")) != null) {
                    this.debugName = objectOrNull.getStringOrNull("exportAs");
                }
                if (z) {
                    return;
                }
                signalUpdate();
            }
        } catch (CLParsingException | Exception unused) {
        }
    }

    public final void onNewDimensions(int width, int height) {
        this.forcedWidth = width;
        this.forcedHeight = height;
        signalUpdate();
    }

    public final void onLayoutInformation(int mode) {
        LayoutInfoFlags layoutInfoFlags = LayoutInfoFlags.NONE;
        if (mode == layoutInfoFlags.ordinal()) {
            this.layoutInformationMode = layoutInfoFlags;
        } else {
            LayoutInfoFlags layoutInfoFlags2 = LayoutInfoFlags.BOUNDS;
            if (mode == layoutInfoFlags2.ordinal()) {
                this.layoutInformationMode = layoutInfoFlags2;
            }
        }
        signalUpdate();
    }

    public final void onDrawDebug(int debugMode) {
        if (debugMode == -1) {
            this.forcedDrawDebug = MotionLayoutDebugFlags.UNKNOWN;
        } else {
            MotionLayoutDebugFlags motionLayoutDebugFlags = MotionLayoutDebugFlags.UNKNOWN;
            if (debugMode == motionLayoutDebugFlags.ordinal()) {
                this.forcedDrawDebug = motionLayoutDebugFlags;
            } else {
                MotionLayoutDebugFlags motionLayoutDebugFlags2 = MotionLayoutDebugFlags.NONE;
                if (debugMode == motionLayoutDebugFlags2.ordinal()) {
                    this.forcedDrawDebug = motionLayoutDebugFlags2;
                } else {
                    MotionLayoutDebugFlags motionLayoutDebugFlags3 = MotionLayoutDebugFlags.SHOW_ALL;
                    if (debugMode == motionLayoutDebugFlags3.ordinal()) {
                        this.forcedDrawDebug = motionLayoutDebugFlags3;
                    }
                }
            }
        }
        signalUpdate();
    }
}
