package androidx.fragment.app;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.media3.extractor.text.webvtt.WebvttCssParser;
import com.bumptech.glide.load.engine.GlideException;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class BackStackRecord extends FragmentTransaction implements FragmentManager.BackStackEntry, FragmentManager.OpGenerator {
    public static final String TAG = "FragmentManager";
    public boolean mBeingSaved;
    public boolean mCommitted;
    public int mIndex;
    public final FragmentManager mManager;

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.mIndex >= 0) {
            sb.append(" #");
            sb.append(this.mIndex);
        }
        if (this.mName != null) {
            sb.append(" ");
            sb.append(this.mName);
        }
        sb.append(WebvttCssParser.RULE_END);
        return sb.toString();
    }

    public void dump(String str, PrintWriter printWriter) {
        dump(str, printWriter, true);
    }

    public void dump(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.mName);
            printWriter.print(" mIndex=");
            printWriter.print(this.mIndex);
            printWriter.print(" mCommitted=");
            printWriter.println(this.mCommitted);
            if (this.mTransition != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.mTransition));
            }
            if (this.mEnterAnim != 0 || this.mExitAnim != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.mEnterAnim));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.mExitAnim));
            }
            if (this.mPopEnterAnim != 0 || this.mPopExitAnim != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.mPopEnterAnim));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.mPopExitAnim));
            }
            if (this.mBreadCrumbTitleRes != 0 || this.mBreadCrumbTitleText != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.mBreadCrumbTitleRes));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.mBreadCrumbTitleText);
            }
            if (this.mBreadCrumbShortTitleRes != 0 || this.mBreadCrumbShortTitleText != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.mBreadCrumbShortTitleRes));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.mBreadCrumbShortTitleText);
            }
        }
        if (this.mOps.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.mOps.size();
        for (int i = 0; i < size; i++) {
            FragmentTransaction.C2585Op c2585Op = this.mOps.get(i);
            switch (c2585Op.mCmd) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c2585Op.mCmd;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c2585Op.mFragment);
            if (z) {
                if (c2585Op.mEnterAnim != 0 || c2585Op.mExitAnim != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c2585Op.mEnterAnim));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c2585Op.mExitAnim));
                }
                if (c2585Op.mPopEnterAnim != 0 || c2585Op.mPopExitAnim != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c2585Op.mPopEnterAnim));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c2585Op.mPopExitAnim));
                }
            }
        }
    }

    public BackStackRecord(@NonNull FragmentManager fragmentManager) {
        super(fragmentManager.getFragmentFactory(), fragmentManager.getHost() != null ? fragmentManager.getHost().getContext().getClassLoader() : null);
        this.mIndex = -1;
        this.mBeingSaved = false;
        this.mManager = fragmentManager;
    }

    public BackStackRecord(@NonNull BackStackRecord backStackRecord) {
        super(backStackRecord.mManager.getFragmentFactory(), backStackRecord.mManager.getHost() != null ? backStackRecord.mManager.getHost().getContext().getClassLoader() : null, backStackRecord);
        this.mIndex = -1;
        this.mBeingSaved = false;
        this.mManager = backStackRecord.mManager;
        this.mCommitted = backStackRecord.mCommitted;
        this.mIndex = backStackRecord.mIndex;
        this.mBeingSaved = backStackRecord.mBeingSaved;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getId() {
        return this.mIndex;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getBreadCrumbTitleRes() {
        return this.mBreadCrumbTitleRes;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getBreadCrumbShortTitleRes() {
        return this.mBreadCrumbShortTitleRes;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    @Nullable
    public CharSequence getBreadCrumbTitle() {
        if (this.mBreadCrumbTitleRes != 0) {
            return this.mManager.getHost().getContext().getText(this.mBreadCrumbTitleRes);
        }
        return this.mBreadCrumbTitleText;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    @Nullable
    public CharSequence getBreadCrumbShortTitle() {
        if (this.mBreadCrumbShortTitleRes != 0) {
            return this.mManager.getHost().getContext().getText(this.mBreadCrumbShortTitleRes);
        }
        return this.mBreadCrumbShortTitleText;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void doAddOp(int i, Fragment fragment, @Nullable String str, int i2) {
        super.doAddOp(i, fragment, str, i2);
        fragment.mFragmentManager = this.mManager;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @NonNull
    public FragmentTransaction remove(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.mManager) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.remove(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @NonNull
    public FragmentTransaction hide(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.mManager) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.hide(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @NonNull
    public FragmentTransaction show(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.mManager) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.show(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @NonNull
    public FragmentTransaction detach(@NonNull Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager != null && fragmentManager != this.mManager) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.detach(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @NonNull
    public FragmentTransaction setPrimaryNavigationFragment(@Nullable Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment != null && (fragmentManager = fragment.mFragmentManager) != null && fragmentManager != this.mManager) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.setPrimaryNavigationFragment(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    @NonNull
    public FragmentTransaction setMaxLifecycle(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        if (fragment.mFragmentManager != this.mManager) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.mManager);
        }
        if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        }
        if (state == Lifecycle.State.DESTROYED) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        return super.setMaxLifecycle(fragment, state);
    }

    public void bumpBackStackNesting(int i) {
        if (this.mAddToBackStack) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.mOps.size();
            for (int i2 = 0; i2 < size; i2++) {
                FragmentTransaction.C2585Op c2585Op = this.mOps.get(i2);
                Fragment fragment = c2585Op.mFragment;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c2585Op.mFragment + " to " + c2585Op.mFragment.mBackStackNesting);
                    }
                }
            }
        }
    }

    public void runOnCommitRunnables() {
        if (this.mCommitRunnables != null) {
            for (int i = 0; i < this.mCommitRunnables.size(); i++) {
                this.mCommitRunnables.get(i).run();
            }
            this.mCommitRunnables = null;
        }
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int commit() {
        return commitInternal(false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int commitAllowingStateLoss() {
        return commitInternal(true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void commitNow() {
        disallowAddToBackStack();
        this.mManager.execSingleAction(this, false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void commitNowAllowingStateLoss() {
        disallowAddToBackStack();
        this.mManager.execSingleAction(this, true);
    }

    public int commitInternal(boolean z) {
        if (this.mCommitted) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new LogWriter("FragmentManager"));
            dump(GlideException.IndentedAppendable.INDENT, printWriter);
            printWriter.close();
        }
        this.mCommitted = true;
        if (this.mAddToBackStack) {
            this.mIndex = this.mManager.allocBackStackIndex();
        } else {
            this.mIndex = -1;
        }
        this.mManager.enqueueAction(this, z);
        return this.mIndex;
    }

    @Override // androidx.fragment.app.FragmentManager.OpGenerator
    public boolean generateOps(@NonNull ArrayList<BackStackRecord> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.mAddToBackStack) {
            return true;
        }
        this.mManager.addBackStackState(this);
        return true;
    }

    public void executeOps() {
        int size = this.mOps.size();
        for (int i = 0; i < size; i++) {
            FragmentTransaction.C2585Op c2585Op = this.mOps.get(i);
            Fragment fragment = c2585Op.mFragment;
            if (fragment != null) {
                fragment.mBeingSaved = this.mBeingSaved;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.mTransition);
                fragment.setSharedElementNames(this.mSharedElementSourceNames, this.mSharedElementTargetNames);
            }
            switch (c2585Op.mCmd) {
                case 1:
                    fragment.setAnimations(c2585Op.mEnterAnim, c2585Op.mExitAnim, c2585Op.mPopEnterAnim, c2585Op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(fragment, false);
                    this.mManager.addFragment(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c2585Op.mCmd);
                case 3:
                    fragment.setAnimations(c2585Op.mEnterAnim, c2585Op.mExitAnim, c2585Op.mPopEnterAnim, c2585Op.mPopExitAnim);
                    this.mManager.removeFragment(fragment);
                    break;
                case 4:
                    fragment.setAnimations(c2585Op.mEnterAnim, c2585Op.mExitAnim, c2585Op.mPopEnterAnim, c2585Op.mPopExitAnim);
                    this.mManager.hideFragment(fragment);
                    break;
                case 5:
                    fragment.setAnimations(c2585Op.mEnterAnim, c2585Op.mExitAnim, c2585Op.mPopEnterAnim, c2585Op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(fragment, false);
                    this.mManager.showFragment(fragment);
                    break;
                case 6:
                    fragment.setAnimations(c2585Op.mEnterAnim, c2585Op.mExitAnim, c2585Op.mPopEnterAnim, c2585Op.mPopExitAnim);
                    this.mManager.detachFragment(fragment);
                    break;
                case 7:
                    fragment.setAnimations(c2585Op.mEnterAnim, c2585Op.mExitAnim, c2585Op.mPopEnterAnim, c2585Op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(fragment, false);
                    this.mManager.attachFragment(fragment);
                    break;
                case 8:
                    this.mManager.setPrimaryNavigationFragment(fragment);
                    break;
                case 9:
                    this.mManager.setPrimaryNavigationFragment(null);
                    break;
                case 10:
                    this.mManager.setMaxLifecycle(fragment, c2585Op.mCurrentMaxState);
                    break;
            }
        }
    }

    public void executePopOps() {
        for (int size = this.mOps.size() - 1; size >= 0; size--) {
            FragmentTransaction.C2585Op c2585Op = this.mOps.get(size);
            Fragment fragment = c2585Op.mFragment;
            if (fragment != null) {
                fragment.mBeingSaved = this.mBeingSaved;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.reverseTransit(this.mTransition));
                fragment.setSharedElementNames(this.mSharedElementTargetNames, this.mSharedElementSourceNames);
            }
            switch (c2585Op.mCmd) {
                case 1:
                    fragment.setAnimations(c2585Op.mEnterAnim, c2585Op.mExitAnim, c2585Op.mPopEnterAnim, c2585Op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(fragment, true);
                    this.mManager.removeFragment(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c2585Op.mCmd);
                case 3:
                    fragment.setAnimations(c2585Op.mEnterAnim, c2585Op.mExitAnim, c2585Op.mPopEnterAnim, c2585Op.mPopExitAnim);
                    this.mManager.addFragment(fragment);
                    break;
                case 4:
                    fragment.setAnimations(c2585Op.mEnterAnim, c2585Op.mExitAnim, c2585Op.mPopEnterAnim, c2585Op.mPopExitAnim);
                    this.mManager.showFragment(fragment);
                    break;
                case 5:
                    fragment.setAnimations(c2585Op.mEnterAnim, c2585Op.mExitAnim, c2585Op.mPopEnterAnim, c2585Op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(fragment, true);
                    this.mManager.hideFragment(fragment);
                    break;
                case 6:
                    fragment.setAnimations(c2585Op.mEnterAnim, c2585Op.mExitAnim, c2585Op.mPopEnterAnim, c2585Op.mPopExitAnim);
                    this.mManager.attachFragment(fragment);
                    break;
                case 7:
                    fragment.setAnimations(c2585Op.mEnterAnim, c2585Op.mExitAnim, c2585Op.mPopEnterAnim, c2585Op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(fragment, true);
                    this.mManager.detachFragment(fragment);
                    break;
                case 8:
                    this.mManager.setPrimaryNavigationFragment(null);
                    break;
                case 9:
                    this.mManager.setPrimaryNavigationFragment(fragment);
                    break;
                case 10:
                    this.mManager.setMaxLifecycle(fragment, c2585Op.mOldMaxState);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Fragment expandOps(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.mOps.size()) {
            FragmentTransaction.C2585Op c2585Op = this.mOps.get(i);
            int i2 = c2585Op.mCmd;
            if (i2 == 1) {
                arrayList.add(c2585Op.mFragment);
            } else if (i2 == 2) {
                Fragment fragment3 = c2585Op.mFragment;
                int i3 = fragment3.mContainerId;
                boolean z = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Fragment fragment4 = arrayList.get(size);
                    if (fragment4.mContainerId == i3) {
                        if (fragment4 == fragment3) {
                            z = true;
                        } else {
                            if (fragment4 == fragment2) {
                                this.mOps.add(i, new FragmentTransaction.C2585Op(9, fragment4, true));
                                i++;
                                fragment2 = null;
                            }
                            FragmentTransaction.C2585Op c2585Op2 = new FragmentTransaction.C2585Op(3, fragment4, true);
                            c2585Op2.mEnterAnim = c2585Op.mEnterAnim;
                            c2585Op2.mPopEnterAnim = c2585Op.mPopEnterAnim;
                            c2585Op2.mExitAnim = c2585Op.mExitAnim;
                            c2585Op2.mPopExitAnim = c2585Op.mPopExitAnim;
                            this.mOps.add(i, c2585Op2);
                            arrayList.remove(fragment4);
                            i++;
                        }
                    }
                }
                if (z) {
                    this.mOps.remove(i);
                    i--;
                } else {
                    c2585Op.mCmd = 1;
                    c2585Op.mFromExpandedOp = true;
                    arrayList.add(fragment3);
                }
            } else if (i2 == 3 || i2 == 6) {
                arrayList.remove(c2585Op.mFragment);
                Fragment fragment5 = c2585Op.mFragment;
                if (fragment5 == fragment2) {
                    this.mOps.add(i, new FragmentTransaction.C2585Op(9, fragment5));
                    i++;
                    fragment2 = null;
                }
            } else if (i2 != 7) {
                if (i2 == 8) {
                    this.mOps.add(i, new FragmentTransaction.C2585Op(9, fragment2, true));
                    c2585Op.mFromExpandedOp = true;
                    i++;
                    fragment2 = c2585Op.mFragment;
                }
            }
            i++;
        }
        return fragment2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Fragment trackAddedFragmentsInPop(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.mOps.size() - 1; size >= 0; size--) {
            FragmentTransaction.C2585Op c2585Op = this.mOps.get(size);
            int i = c2585Op.mCmd;
            if (i == 1) {
                arrayList.remove(c2585Op.mFragment);
            } else if (i != 3) {
                switch (i) {
                    case 6:
                        arrayList.add(c2585Op.mFragment);
                        break;
                    case 8:
                        fragment = null;
                        break;
                    case 9:
                        fragment = c2585Op.mFragment;
                        break;
                    case 10:
                        c2585Op.mCurrentMaxState = c2585Op.mOldMaxState;
                        break;
                }
            }
        }
        return fragment;
    }

    public void collapseOps() {
        int size = this.mOps.size() - 1;
        while (size >= 0) {
            FragmentTransaction.C2585Op c2585Op = this.mOps.get(size);
            if (c2585Op.mFromExpandedOp) {
                if (c2585Op.mCmd == 8) {
                    c2585Op.mFromExpandedOp = false;
                    this.mOps.remove(size - 1);
                    size--;
                } else {
                    int i = c2585Op.mFragment.mContainerId;
                    c2585Op.mCmd = 2;
                    c2585Op.mFromExpandedOp = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        FragmentTransaction.C2585Op c2585Op2 = this.mOps.get(i2);
                        if (c2585Op2.mFromExpandedOp && c2585Op2.mFragment.mContainerId == i) {
                            this.mOps.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    @Nullable
    public String getName() {
        return this.mName;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public boolean isEmpty() {
        return this.mOps.isEmpty();
    }
}
