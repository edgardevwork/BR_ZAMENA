package org.apache.ivy.ant;

import org.apache.ivy.Ivy;
import org.apache.ivy.util.AbstractMessageLogger;
import org.apache.ivy.util.Checks;
import org.apache.ivy.util.MessageLogger;
import org.apache.tools.ant.BuildEvent;
import org.apache.tools.ant.BuildListener;
import org.apache.tools.ant.ProjectComponent;
import org.apache.tools.ant.Task;

/* loaded from: classes8.dex */
public class AntMessageLogger extends AbstractMessageLogger {
    public static final int PROGRESS_LOG_PERIOD = 1500;
    public ProjectComponent task;
    public long lastProgressFlush = 0;
    public StringBuilder buf = new StringBuilder();

    public static void register(ProjectComponent projectComponent, Ivy ivy) {
        MessageLogger messageLoggerPeekLogger = ivy.getLoggerEngine().peekLogger();
        if ((messageLoggerPeekLogger instanceof AntMessageLogger) && (projectComponent instanceof Task)) {
            Task task = ((AntMessageLogger) messageLoggerPeekLogger).task;
            if (task instanceof Task) {
                Task task2 = task;
                if (task2.getTaskName() != null && task2.getTaskName().equals(((Task) projectComponent).getTaskName())) {
                    return;
                }
            }
        }
        ivy.getLoggerEngine().pushLogger(new AntMessageLogger(projectComponent));
        projectComponent.getProject().addBuildListener(new BuildListener() { // from class: org.apache.ivy.ant.AntMessageLogger.1
            public int stackDepth = 0;

            public void buildFinished(BuildEvent buildEvent) {
            }

            public void buildStarted(BuildEvent buildEvent) {
            }

            public void messageLogged(BuildEvent buildEvent) {
            }

            public void targetFinished(BuildEvent buildEvent) {
            }

            public void targetStarted(BuildEvent buildEvent) {
            }

            public C111531() {
            }

            public void taskStarted(BuildEvent buildEvent) {
                this.stackDepth++;
            }

            public void taskFinished(BuildEvent buildEvent) {
                int i = this.stackDepth - 1;
                this.stackDepth = i;
                if (i == -1) {
                    ivy.getLoggerEngine().popLogger();
                    buildEvent.getProject().removeBuildListener(this);
                }
            }
        });
    }

    /* renamed from: org.apache.ivy.ant.AntMessageLogger$1 */
    /* loaded from: classes7.dex */
    public class C111531 implements BuildListener {
        public int stackDepth = 0;

        public void buildFinished(BuildEvent buildEvent) {
        }

        public void buildStarted(BuildEvent buildEvent) {
        }

        public void messageLogged(BuildEvent buildEvent) {
        }

        public void targetFinished(BuildEvent buildEvent) {
        }

        public void targetStarted(BuildEvent buildEvent) {
        }

        public C111531() {
        }

        public void taskStarted(BuildEvent buildEvent) {
            this.stackDepth++;
        }

        public void taskFinished(BuildEvent buildEvent) {
            int i = this.stackDepth - 1;
            this.stackDepth = i;
            if (i == -1) {
                ivy.getLoggerEngine().popLogger();
                buildEvent.getProject().removeBuildListener(this);
            }
        }
    }

    public AntMessageLogger(ProjectComponent projectComponent) {
        Checks.checkNotNull(projectComponent, "task");
        this.task = projectComponent;
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void log(String str, int i) {
        this.task.log(str, i);
    }

    @Override // org.apache.ivy.util.MessageLogger
    public void rawlog(String str, int i) {
        this.task.getProject().log(str, i);
    }

    @Override // org.apache.ivy.util.AbstractMessageLogger
    public void doProgress() {
        this.buf.append(".");
        if (this.lastProgressFlush == 0) {
            this.lastProgressFlush = System.currentTimeMillis();
        }
        if (System.currentTimeMillis() - this.lastProgressFlush > 1500) {
            this.task.log(this.buf.toString());
            this.buf.setLength(0);
            this.lastProgressFlush = System.currentTimeMillis();
        }
    }

    @Override // org.apache.ivy.util.AbstractMessageLogger
    public void doEndProgress(String str) {
        this.task.log(((Object) this.buf) + str);
        this.buf.setLength(0);
        this.lastProgressFlush = 0L;
    }

    public String toString() {
        return "AntMessageLogger:" + this.task;
    }
}
