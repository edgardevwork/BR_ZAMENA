package androidx.window.embedding;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.util.Consumer;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingCompat;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.embedding.ExtensionEmbeddingBackend;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.ivy.osgi.p063p2.P2ArtifactParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExtensionEmbeddingBackend.kt */
@ExperimentalWindowApi
@Metadata(m7104d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 )2\u00020\u0001:\u0003)*+B\u0011\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J,\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!H\u0016J\u0016\u0010$\u001a\u00020\u00192\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0016J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u001c\u0010'\u001a\u00020\u00192\u0012\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!H\u0016R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00060\u0010R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, m7105d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend;", "Landroidx/window/embedding/EmbeddingBackend;", "embeddingExtension", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "(Landroidx/window/embedding/EmbeddingInterfaceCompat;)V", "getEmbeddingExtension", "()Landroidx/window/embedding/EmbeddingInterfaceCompat;", "setEmbeddingExtension", "splitChangeCallbacks", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;", "getSplitChangeCallbacks$annotations", "()V", "getSplitChangeCallbacks", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "splitInfoEmbeddingCallback", "Landroidx/window/embedding/ExtensionEmbeddingBackend$EmbeddingCallbackImpl;", "splitRules", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Landroidx/window/embedding/EmbeddingRule;", "getSplitRules", "", "isSplitSupported", "", "registerRule", "", P2ArtifactParser.RuleHandler.RULE, "registerSplitListenerForActivity", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Landroid/app/Activity;", "executor", "Ljava/util/concurrent/Executor;", "callback", "Landroidx/core/util/Consumer;", "", "Landroidx/window/embedding/SplitInfo;", "setSplitRules", "rules", "unregisterRule", "unregisterSplitListenerForActivity", "consumer", "Companion", "EmbeddingCallbackImpl", "SplitListenerWrapper", "window_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class ExtensionEmbeddingBackend implements EmbeddingBackend {

    @NotNull
    public static final String TAG = "EmbeddingBackend";

    @Nullable
    public static volatile ExtensionEmbeddingBackend globalInstance;

    @GuardedBy("globalLock")
    @VisibleForTesting
    @Nullable
    public EmbeddingInterfaceCompat embeddingExtension;

    @NotNull
    public final CopyOnWriteArrayList<SplitListenerWrapper> splitChangeCallbacks;

    @NotNull
    public final EmbeddingCallbackImpl splitInfoEmbeddingCallback;

    @NotNull
    public final CopyOnWriteArraySet<EmbeddingRule> splitRules;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final ReentrantLock globalLock = new ReentrantLock();

    @VisibleForTesting
    public static /* synthetic */ void getSplitChangeCallbacks$annotations() {
    }

    @VisibleForTesting
    public ExtensionEmbeddingBackend(@Nullable EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        this.embeddingExtension = embeddingInterfaceCompat;
        EmbeddingCallbackImpl embeddingCallbackImpl = new EmbeddingCallbackImpl(this);
        this.splitInfoEmbeddingCallback = embeddingCallbackImpl;
        this.splitChangeCallbacks = new CopyOnWriteArrayList<>();
        EmbeddingInterfaceCompat embeddingInterfaceCompat2 = this.embeddingExtension;
        if (embeddingInterfaceCompat2 != null) {
            embeddingInterfaceCompat2.setEmbeddingCallback(embeddingCallbackImpl);
        }
        this.splitRules = new CopyOnWriteArraySet<>();
    }

    @Nullable
    public final EmbeddingInterfaceCompat getEmbeddingExtension() {
        return this.embeddingExtension;
    }

    public final void setEmbeddingExtension(@Nullable EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        this.embeddingExtension = embeddingInterfaceCompat;
    }

    @NotNull
    public final CopyOnWriteArrayList<SplitListenerWrapper> getSplitChangeCallbacks() {
        return this.splitChangeCallbacks;
    }

    /* compiled from: ExtensionEmbeddingBackend.kt */
    @Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0006J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0017\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m7105d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$Companion;", "", "()V", "TAG", "", "globalInstance", "Landroidx/window/embedding/ExtensionEmbeddingBackend;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "getInstance", "initAndVerifyEmbeddingExtension", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "isExtensionVersionSupported", "", "extensionVersion", "", "(Ljava/lang/Integer;)Z", "window_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final ExtensionEmbeddingBackend getInstance() {
            if (ExtensionEmbeddingBackend.globalInstance == null) {
                ReentrantLock reentrantLock = ExtensionEmbeddingBackend.globalLock;
                reentrantLock.lock();
                try {
                    if (ExtensionEmbeddingBackend.globalInstance == null) {
                        ExtensionEmbeddingBackend.globalInstance = new ExtensionEmbeddingBackend(ExtensionEmbeddingBackend.INSTANCE.initAndVerifyEmbeddingExtension());
                    }
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            ExtensionEmbeddingBackend extensionEmbeddingBackend = ExtensionEmbeddingBackend.globalInstance;
            Intrinsics.checkNotNull(extensionEmbeddingBackend);
            return extensionEmbeddingBackend;
        }

        public final EmbeddingInterfaceCompat initAndVerifyEmbeddingExtension() {
            EmbeddingCompat embeddingCompat = null;
            try {
                EmbeddingCompat.Companion companion = EmbeddingCompat.INSTANCE;
                if (isExtensionVersionSupported(companion.getExtensionApiLevel()) && companion.isEmbeddingAvailable()) {
                    embeddingCompat = new EmbeddingCompat();
                }
            } catch (Throwable th) {
                Log.d(ExtensionEmbeddingBackend.TAG, Intrinsics.stringPlus("Failed to load embedding extension: ", th));
            }
            if (embeddingCompat == null) {
                Log.d(ExtensionEmbeddingBackend.TAG, "No supported embedding extension found");
            }
            return embeddingCompat;
        }

        @VisibleForTesting
        public final boolean isExtensionVersionSupported(@Nullable Integer extensionVersion) {
            return extensionVersion != null && extensionVersion.intValue() >= 1;
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    @NotNull
    public Set<EmbeddingRule> getSplitRules() {
        return this.splitRules;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void setSplitRules(@NotNull Set<? extends EmbeddingRule> rules) {
        Intrinsics.checkNotNullParameter(rules, "rules");
        this.splitRules.clear();
        this.splitRules.addAll(rules);
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat == null) {
            return;
        }
        embeddingInterfaceCompat.setSplitRules(this.splitRules);
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void registerRule(@NotNull EmbeddingRule rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        if (this.splitRules.contains(rule)) {
            return;
        }
        this.splitRules.add(rule);
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat == null) {
            return;
        }
        embeddingInterfaceCompat.setSplitRules(this.splitRules);
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void unregisterRule(@NotNull EmbeddingRule rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        if (this.splitRules.contains(rule)) {
            this.splitRules.remove(rule);
            EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
            if (embeddingInterfaceCompat == null) {
                return;
            }
            embeddingInterfaceCompat.setSplitRules(this.splitRules);
        }
    }

    /* compiled from: ExtensionEmbeddingBackend.kt */
    @Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\u0002\u0010\nJ\u0014\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m7105d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;", "", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Landroid/app/Activity;", "executor", "Ljava/util/concurrent/Executor;", "callback", "Landroidx/core/util/Consumer;", "", "Landroidx/window/embedding/SplitInfo;", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "getCallback", "()Landroidx/core/util/Consumer;", "lastValue", "accept", "", "splitInfoList", "window_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
    public static final class SplitListenerWrapper {

        @NotNull
        public final Activity activity;

        @NotNull
        public final Consumer<List<SplitInfo>> callback;

        @NotNull
        public final Executor executor;

        @Nullable
        public List<SplitInfo> lastValue;

        public SplitListenerWrapper(@NotNull Activity activity, @NotNull Executor executor, @NotNull Consumer<List<SplitInfo>> callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(executor, "executor");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.activity = activity;
            this.executor = executor;
            this.callback = callback;
        }

        @NotNull
        public final Consumer<List<SplitInfo>> getCallback() {
            return this.callback;
        }

        public final void accept(@NotNull List<SplitInfo> splitInfoList) {
            Intrinsics.checkNotNullParameter(splitInfoList, "splitInfoList");
            final ArrayList arrayList = new ArrayList();
            for (Object obj : splitInfoList) {
                if (((SplitInfo) obj).contains(this.activity)) {
                    arrayList.add(obj);
                }
            }
            if (Intrinsics.areEqual(arrayList, this.lastValue)) {
                return;
            }
            this.lastValue = arrayList;
            this.executor.execute(new Runnable() { // from class: androidx.window.embedding.ExtensionEmbeddingBackend$SplitListenerWrapper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ExtensionEmbeddingBackend.SplitListenerWrapper.m14237accept$lambda1(this.f$0, arrayList);
                }
            });
        }

        /* renamed from: accept$lambda-1, reason: not valid java name */
        public static final void m14237accept$lambda1(SplitListenerWrapper this$0, List splitsWithActivity) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(splitsWithActivity, "$splitsWithActivity");
            this$0.callback.accept(splitsWithActivity);
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void registerSplitListenerForActivity(@NotNull Activity activity, @NotNull Executor executor, @NotNull Consumer<List<SplitInfo>> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            if (getEmbeddingExtension() == null) {
                Log.v(TAG, "Extension not loaded, skipping callback registration.");
                callback.accept(CollectionsKt__CollectionsKt.emptyList());
                return;
            }
            SplitListenerWrapper splitListenerWrapper = new SplitListenerWrapper(activity, executor, callback);
            getSplitChangeCallbacks().add(splitListenerWrapper);
            if (this.splitInfoEmbeddingCallback.getLastInfo() != null) {
                List<SplitInfo> lastInfo = this.splitInfoEmbeddingCallback.getLastInfo();
                Intrinsics.checkNotNull(lastInfo);
                splitListenerWrapper.accept(lastInfo);
            } else {
                splitListenerWrapper.accept(CollectionsKt__CollectionsKt.emptyList());
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void unregisterSplitListenerForActivity(@NotNull Consumer<List<SplitInfo>> consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            Iterator<SplitListenerWrapper> it = getSplitChangeCallbacks().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SplitListenerWrapper next = it.next();
                if (Intrinsics.areEqual(next.getCallback(), consumer)) {
                    getSplitChangeCallbacks().remove(next);
                    break;
                }
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* compiled from: ExtensionEmbeddingBackend.kt */
    @Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, m7105d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$EmbeddingCallbackImpl;", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "(Landroidx/window/embedding/ExtensionEmbeddingBackend;)V", "lastInfo", "", "Landroidx/window/embedding/SplitInfo;", "getLastInfo", "()Ljava/util/List;", "setLastInfo", "(Ljava/util/List;)V", "onSplitInfoChanged", "", "splitInfo", "window_release"}, m7106k = 1, m7107mv = {1, 6, 0}, m7109xi = 48)
    public final class EmbeddingCallbackImpl implements EmbeddingInterfaceCompat.EmbeddingCallbackInterface {

        @Nullable
        public List<SplitInfo> lastInfo;
        public final /* synthetic */ ExtensionEmbeddingBackend this$0;

        public EmbeddingCallbackImpl(ExtensionEmbeddingBackend this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
        }

        @Nullable
        public final List<SplitInfo> getLastInfo() {
            return this.lastInfo;
        }

        public final void setLastInfo(@Nullable List<SplitInfo> list) {
            this.lastInfo = list;
        }

        @Override // androidx.window.embedding.EmbeddingInterfaceCompat.EmbeddingCallbackInterface
        public void onSplitInfoChanged(@NotNull List<SplitInfo> splitInfo) {
            Intrinsics.checkNotNullParameter(splitInfo, "splitInfo");
            this.lastInfo = splitInfo;
            Iterator<SplitListenerWrapper> it = this.this$0.getSplitChangeCallbacks().iterator();
            while (it.hasNext()) {
                it.next().accept(splitInfo);
            }
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public boolean isSplitSupported() {
        return this.embeddingExtension != null;
    }
}
