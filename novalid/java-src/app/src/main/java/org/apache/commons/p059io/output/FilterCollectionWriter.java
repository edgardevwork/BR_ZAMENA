package org.apache.commons.p059io.output;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.apache.commons.p059io.IOExceptionList;
import org.apache.commons.p059io.IOIndexedException;

/* loaded from: classes6.dex */
public class FilterCollectionWriter extends Writer {
    public final Collection<Writer> EMPTY_WRITERS;
    public final Collection<Writer> writers;

    public FilterCollectionWriter(Collection<Writer> collection) {
        List listEmptyList = Collections.emptyList();
        this.EMPTY_WRITERS = listEmptyList;
        this.writers = collection == null ? listEmptyList : collection;
    }

    public FilterCollectionWriter(Writer... writerArr) {
        List listEmptyList = Collections.emptyList();
        this.EMPTY_WRITERS = listEmptyList;
        this.writers = writerArr != null ? Arrays.asList(writerArr) : listEmptyList;
    }

    public final List<Exception> add(List<Exception> list, int i, IOException iOException) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(new IOIndexedException(i, iOException));
        return list;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) throws IOException {
        List<Exception> listAdd = null;
        int i = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.append(c);
                } catch (IOException e) {
                    listAdd = add(listAdd, i, e);
                }
            }
            i++;
        }
        if (notEmpty(listAdd)) {
            throw new IOExceptionList("append", listAdd);
        }
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        List<Exception> listAdd = null;
        int i = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.append(charSequence);
                } catch (IOException e) {
                    listAdd = add(listAdd, i, e);
                }
            }
            i++;
        }
        if (notEmpty(listAdd)) {
            throw new IOExceptionList("append", listAdd);
        }
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        List<Exception> listAdd = null;
        int i3 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.append(charSequence, i, i2);
                } catch (IOException e) {
                    listAdd = add(listAdd, i3, e);
                }
            }
            i3++;
        }
        if (notEmpty(listAdd)) {
            throw new IOExceptionList("append", listAdd);
        }
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        List<Exception> listAdd = null;
        int i = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    listAdd = add(listAdd, i, e);
                }
            }
            i++;
        }
        if (notEmpty(listAdd)) {
            throw new IOExceptionList("close", listAdd);
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        List<Exception> listAdd = null;
        int i = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.flush();
                } catch (IOException e) {
                    listAdd = add(listAdd, i, e);
                }
            }
            i++;
        }
        if (notEmpty(listAdd)) {
            throw new IOExceptionList("flush", listAdd);
        }
    }

    public final boolean notEmpty(List<Exception> list) {
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        List<Exception> listAdd = null;
        int i = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.write(cArr);
                } catch (IOException e) {
                    listAdd = add(listAdd, i, e);
                }
            }
            i++;
        }
        if (notEmpty(listAdd)) {
            throw new IOExceptionList("write", listAdd);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        List<Exception> listAdd = null;
        int i3 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.write(cArr, i, i2);
                } catch (IOException e) {
                    listAdd = add(listAdd, i3, e);
                }
            }
            i3++;
        }
        if (notEmpty(listAdd)) {
            throw new IOExceptionList("write", listAdd);
        }
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        List<Exception> listAdd = null;
        int i2 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.write(i);
                } catch (IOException e) {
                    listAdd = add(listAdd, i2, e);
                }
            }
            i2++;
        }
        if (notEmpty(listAdd)) {
            throw new IOExceptionList("write", listAdd);
        }
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        List<Exception> listAdd = null;
        int i = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.write(str);
                } catch (IOException e) {
                    listAdd = add(listAdd, i, e);
                }
            }
            i++;
        }
        if (notEmpty(listAdd)) {
            throw new IOExceptionList("write", listAdd);
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        List<Exception> listAdd = null;
        int i3 = 0;
        for (Writer writer : this.writers) {
            if (writer != null) {
                try {
                    writer.write(str, i, i2);
                } catch (IOException e) {
                    listAdd = add(listAdd, i3, e);
                }
            }
            i3++;
        }
        if (notEmpty(listAdd)) {
            throw new IOExceptionList("write", listAdd);
        }
    }
}
