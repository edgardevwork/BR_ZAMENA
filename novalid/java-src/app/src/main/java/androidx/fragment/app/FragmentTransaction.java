package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class FragmentTransaction {
    public static final int OP_ADD = 1;
    public static final int OP_ATTACH = 7;
    public static final int OP_DETACH = 6;
    public static final int OP_HIDE = 4;
    public static final int OP_NULL = 0;
    public static final int OP_REMOVE = 3;
    public static final int OP_REPLACE = 2;
    public static final int OP_SET_MAX_LIFECYCLE = 10;
    public static final int OP_SET_PRIMARY_NAV = 8;
    public static final int OP_SHOW = 5;
    public static final int OP_UNSET_PRIMARY_NAV = 9;
    public static final int TRANSIT_ENTER_MASK = 4096;
    public static final int TRANSIT_EXIT_MASK = 8192;
    public static final int TRANSIT_FRAGMENT_CLOSE = 8194;
    public static final int TRANSIT_FRAGMENT_FADE = 4099;
    public static final int TRANSIT_FRAGMENT_MATCH_ACTIVITY_CLOSE = 8197;
    public static final int TRANSIT_FRAGMENT_MATCH_ACTIVITY_OPEN = 4100;
    public static final int TRANSIT_FRAGMENT_OPEN = 4097;
    public static final int TRANSIT_NONE = 0;
    public static final int TRANSIT_UNSET = -1;
    public boolean mAddToBackStack;
    public boolean mAllowAddToBackStack;
    public int mBreadCrumbShortTitleRes;
    public CharSequence mBreadCrumbShortTitleText;
    public int mBreadCrumbTitleRes;
    public CharSequence mBreadCrumbTitleText;
    public final ClassLoader mClassLoader;
    public ArrayList<Runnable> mCommitRunnables;
    public int mEnterAnim;
    public int mExitAnim;
    public final FragmentFactory mFragmentFactory;

    @Nullable
    public String mName;
    public ArrayList<C2585Op> mOps;
    public int mPopEnterAnim;
    public int mPopExitAnim;
    public boolean mReorderingAllowed;
    public ArrayList<String> mSharedElementSourceNames;
    public ArrayList<String> mSharedElementTargetNames;
    public int mTransition;

    public abstract int commit();

    public abstract int commitAllowingStateLoss();

    @MainThread
    public abstract void commitNow();

    @MainThread
    public abstract void commitNowAllowingStateLoss();

    @NonNull
    @Deprecated
    public FragmentTransaction setTransitionStyle(@StyleRes int i) {
        return this;
    }

    /* renamed from: androidx.fragment.app.FragmentTransaction$Op */
    public static final class C2585Op {
        public int mCmd;
        public Lifecycle.State mCurrentMaxState;
        public int mEnterAnim;
        public int mExitAnim;
        public Fragment mFragment;
        public boolean mFromExpandedOp;
        public Lifecycle.State mOldMaxState;
        public int mPopEnterAnim;
        public int mPopExitAnim;

        public C2585Op() {
        }

        public C2585Op(int i, Fragment fragment) {
            this.mCmd = i;
            this.mFragment = fragment;
            this.mFromExpandedOp = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.mOldMaxState = state;
            this.mCurrentMaxState = state;
        }

        public C2585Op(int i, Fragment fragment, boolean z) {
            this.mCmd = i;
            this.mFragment = fragment;
            this.mFromExpandedOp = z;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.mOldMaxState = state;
            this.mCurrentMaxState = state;
        }

        public C2585Op(int i, @NonNull Fragment fragment, Lifecycle.State state) {
            this.mCmd = i;
            this.mFragment = fragment;
            this.mFromExpandedOp = false;
            this.mOldMaxState = fragment.mMaxState;
            this.mCurrentMaxState = state;
        }

        public C2585Op(C2585Op c2585Op) {
            this.mCmd = c2585Op.mCmd;
            this.mFragment = c2585Op.mFragment;
            this.mFromExpandedOp = c2585Op.mFromExpandedOp;
            this.mEnterAnim = c2585Op.mEnterAnim;
            this.mExitAnim = c2585Op.mExitAnim;
            this.mPopEnterAnim = c2585Op.mPopEnterAnim;
            this.mPopExitAnim = c2585Op.mPopExitAnim;
            this.mOldMaxState = c2585Op.mOldMaxState;
            this.mCurrentMaxState = c2585Op.mCurrentMaxState;
        }
    }

    @Deprecated
    public FragmentTransaction() {
        this.mOps = new ArrayList<>();
        this.mAllowAddToBackStack = true;
        this.mReorderingAllowed = false;
        this.mFragmentFactory = null;
        this.mClassLoader = null;
    }

    public FragmentTransaction(@NonNull FragmentFactory fragmentFactory, @Nullable ClassLoader classLoader) {
        this.mOps = new ArrayList<>();
        this.mAllowAddToBackStack = true;
        this.mReorderingAllowed = false;
        this.mFragmentFactory = fragmentFactory;
        this.mClassLoader = classLoader;
    }

    public FragmentTransaction(@NonNull FragmentFactory fragmentFactory, @Nullable ClassLoader classLoader, @NonNull FragmentTransaction fragmentTransaction) {
        this(fragmentFactory, classLoader);
        Iterator<C2585Op> it = fragmentTransaction.mOps.iterator();
        while (it.hasNext()) {
            this.mOps.add(new C2585Op(it.next()));
        }
        this.mEnterAnim = fragmentTransaction.mEnterAnim;
        this.mExitAnim = fragmentTransaction.mExitAnim;
        this.mPopEnterAnim = fragmentTransaction.mPopEnterAnim;
        this.mPopExitAnim = fragmentTransaction.mPopExitAnim;
        this.mTransition = fragmentTransaction.mTransition;
        this.mAddToBackStack = fragmentTransaction.mAddToBackStack;
        this.mAllowAddToBackStack = fragmentTransaction.mAllowAddToBackStack;
        this.mName = fragmentTransaction.mName;
        this.mBreadCrumbShortTitleRes = fragmentTransaction.mBreadCrumbShortTitleRes;
        this.mBreadCrumbShortTitleText = fragmentTransaction.mBreadCrumbShortTitleText;
        this.mBreadCrumbTitleRes = fragmentTransaction.mBreadCrumbTitleRes;
        this.mBreadCrumbTitleText = fragmentTransaction.mBreadCrumbTitleText;
        if (fragmentTransaction.mSharedElementSourceNames != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.mSharedElementSourceNames = arrayList;
            arrayList.addAll(fragmentTransaction.mSharedElementSourceNames);
        }
        if (fragmentTransaction.mSharedElementTargetNames != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.mSharedElementTargetNames = arrayList2;
            arrayList2.addAll(fragmentTransaction.mSharedElementTargetNames);
        }
        this.mReorderingAllowed = fragmentTransaction.mReorderingAllowed;
    }

    public void addOp(C2585Op c2585Op) {
        this.mOps.add(c2585Op);
        c2585Op.mEnterAnim = this.mEnterAnim;
        c2585Op.mExitAnim = this.mExitAnim;
        c2585Op.mPopEnterAnim = this.mPopEnterAnim;
        c2585Op.mPopExitAnim = this.mPopExitAnim;
    }

    @NonNull
    public final Fragment createFragment(@NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle) {
        FragmentFactory fragmentFactory = this.mFragmentFactory;
        if (fragmentFactory == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        ClassLoader classLoader = this.mClassLoader;
        if (classLoader == null) {
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        Fragment fragmentInstantiate = fragmentFactory.instantiate(classLoader, cls.getName());
        if (bundle != null) {
            fragmentInstantiate.setArguments(bundle);
        }
        return fragmentInstantiate;
    }

    @NonNull
    public final FragmentTransaction add(@NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle, @Nullable String str) {
        return add(createFragment(cls, bundle), str);
    }

    @NonNull
    public FragmentTransaction add(@NonNull Fragment fragment, @Nullable String str) {
        doAddOp(0, fragment, str, 1);
        return this;
    }

    @NonNull
    public final FragmentTransaction add(@IdRes int i, @NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle) {
        return add(i, createFragment(cls, bundle));
    }

    @NonNull
    public FragmentTransaction add(@IdRes int i, @NonNull Fragment fragment) {
        doAddOp(i, fragment, null, 1);
        return this;
    }

    @NonNull
    public final FragmentTransaction add(@IdRes int i, @NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle, @Nullable String str) {
        return add(i, createFragment(cls, bundle), str);
    }

    @NonNull
    public FragmentTransaction add(@IdRes int i, @NonNull Fragment fragment, @Nullable String str) {
        doAddOp(i, fragment, str, 1);
        return this;
    }

    public FragmentTransaction add(@NonNull ViewGroup viewGroup, @NonNull Fragment fragment, @Nullable String str) {
        fragment.mContainer = viewGroup;
        return add(viewGroup.getId(), fragment, str);
    }

    public void doAddOp(int i, Fragment fragment, @Nullable String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.onFragmentReuse(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.mFragmentId;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        addOp(new C2585Op(i2, fragment));
    }

    @NonNull
    public final FragmentTransaction replace(@IdRes int i, @NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle) {
        return replace(i, cls, bundle, null);
    }

    @NonNull
    public FragmentTransaction replace(@IdRes int i, @NonNull Fragment fragment) {
        return replace(i, fragment, (String) null);
    }

    @NonNull
    public final FragmentTransaction replace(@IdRes int i, @NonNull Class<? extends Fragment> cls, @Nullable Bundle bundle, @Nullable String str) {
        return replace(i, createFragment(cls, bundle), str);
    }

    @NonNull
    public FragmentTransaction replace(@IdRes int i, @NonNull Fragment fragment, @Nullable String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        doAddOp(i, fragment, str, 2);
        return this;
    }

    @NonNull
    public FragmentTransaction remove(@NonNull Fragment fragment) {
        addOp(new C2585Op(3, fragment));
        return this;
    }

    @NonNull
    public FragmentTransaction hide(@NonNull Fragment fragment) {
        addOp(new C2585Op(4, fragment));
        return this;
    }

    @NonNull
    public FragmentTransaction show(@NonNull Fragment fragment) {
        addOp(new C2585Op(5, fragment));
        return this;
    }

    @NonNull
    public FragmentTransaction detach(@NonNull Fragment fragment) {
        addOp(new C2585Op(6, fragment));
        return this;
    }

    @NonNull
    public FragmentTransaction attach(@NonNull Fragment fragment) {
        addOp(new C2585Op(7, fragment));
        return this;
    }

    @NonNull
    public FragmentTransaction setPrimaryNavigationFragment(@Nullable Fragment fragment) {
        addOp(new C2585Op(8, fragment));
        return this;
    }

    @NonNull
    public FragmentTransaction setMaxLifecycle(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        addOp(new C2585Op(10, fragment, state));
        return this;
    }

    public boolean isEmpty() {
        return this.mOps.isEmpty();
    }

    @NonNull
    public FragmentTransaction setCustomAnimations(@AnimRes @AnimatorRes int i, @AnimRes @AnimatorRes int i2) {
        return setCustomAnimations(i, i2, 0, 0);
    }

    @NonNull
    public FragmentTransaction setCustomAnimations(@AnimRes @AnimatorRes int i, @AnimRes @AnimatorRes int i2, @AnimRes @AnimatorRes int i3, @AnimRes @AnimatorRes int i4) {
        this.mEnterAnim = i;
        this.mExitAnim = i2;
        this.mPopEnterAnim = i3;
        this.mPopExitAnim = i4;
        return this;
    }

    @NonNull
    public FragmentTransaction addSharedElement(@NonNull View view, @NonNull String str) {
        if (FragmentTransition.supportsTransition()) {
            String transitionName = ViewCompat.getTransitionName(view);
            if (transitionName == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.mSharedElementSourceNames == null) {
                this.mSharedElementSourceNames = new ArrayList<>();
                this.mSharedElementTargetNames = new ArrayList<>();
            } else {
                if (this.mSharedElementTargetNames.contains(str)) {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                }
                if (this.mSharedElementSourceNames.contains(transitionName)) {
                    throw new IllegalArgumentException("A shared element with the source name '" + transitionName + "' has already been added to the transaction.");
                }
            }
            this.mSharedElementSourceNames.add(transitionName);
            this.mSharedElementTargetNames.add(str);
        }
        return this;
    }

    @NonNull
    public FragmentTransaction setTransition(int i) {
        this.mTransition = i;
        return this;
    }

    @NonNull
    public FragmentTransaction addToBackStack(@Nullable String str) {
        if (!this.mAllowAddToBackStack) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.mAddToBackStack = true;
        this.mName = str;
        return this;
    }

    public boolean isAddToBackStackAllowed() {
        return this.mAllowAddToBackStack;
    }

    @NonNull
    public FragmentTransaction disallowAddToBackStack() {
        if (this.mAddToBackStack) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.mAllowAddToBackStack = false;
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setBreadCrumbTitle(@StringRes int i) {
        this.mBreadCrumbTitleRes = i;
        this.mBreadCrumbTitleText = null;
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setBreadCrumbTitle(@Nullable CharSequence charSequence) {
        this.mBreadCrumbTitleRes = 0;
        this.mBreadCrumbTitleText = charSequence;
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setBreadCrumbShortTitle(@StringRes int i) {
        this.mBreadCrumbShortTitleRes = i;
        this.mBreadCrumbShortTitleText = null;
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setBreadCrumbShortTitle(@Nullable CharSequence charSequence) {
        this.mBreadCrumbShortTitleRes = 0;
        this.mBreadCrumbShortTitleText = charSequence;
        return this;
    }

    @NonNull
    public FragmentTransaction setReorderingAllowed(boolean z) {
        this.mReorderingAllowed = z;
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction setAllowOptimization(boolean z) {
        return setReorderingAllowed(z);
    }

    @NonNull
    public FragmentTransaction runOnCommit(@NonNull Runnable runnable) {
        disallowAddToBackStack();
        if (this.mCommitRunnables == null) {
            this.mCommitRunnables = new ArrayList<>();
        }
        this.mCommitRunnables.add(runnable);
        return this;
    }
}
