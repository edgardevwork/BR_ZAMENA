package com.thoughtworks.xstream.persistence;

import androidx.appcompat.widget.ActivityChooserModel;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.mapper.Mapper;
import com.thoughtworks.xstream.p042io.StreamException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class AbstractFilePersistenceStrategy implements PersistenceStrategy {
    public final File baseDirectory;
    public final String encoding;
    public final FilenameFilter filter = new ValidFilenameFilter();
    public final transient XStream xstream;

    public abstract Object extractKey(String str);

    public abstract String getName(Object obj);

    public AbstractFilePersistenceStrategy(File file, XStream xStream, String str) {
        this.baseDirectory = file;
        this.xstream = xStream;
        this.encoding = str;
    }

    public ConverterLookup getConverterLookup() {
        return this.xstream.getConverterLookup();
    }

    public Mapper getMapper() {
        return this.xstream.getMapper();
    }

    public boolean isValid(File file, String str) {
        return str.endsWith(ActivityChooserModel.HISTORY_FILE_EXTENSION);
    }

    public class ValidFilenameFilter implements FilenameFilter {
        public ValidFilenameFilter() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return new File(file, str).isFile() && AbstractFilePersistenceStrategy.this.isValid(file, str);
        }
    }

    public class XmlMapEntriesIterator implements Iterator {
        public final File[] files;
        public int position = -1;
        public File current = null;

        public XmlMapEntriesIterator() {
            this.files = AbstractFilePersistenceStrategy.this.baseDirectory.listFiles(AbstractFilePersistenceStrategy.this.filter);
        }

        public static /* synthetic */ int access$404(XmlMapEntriesIterator xmlMapEntriesIterator) {
            int i = xmlMapEntriesIterator.position + 1;
            xmlMapEntriesIterator.position = i;
            return i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.position + 1 < this.files.length;
        }

        @Override // java.util.Iterator
        public void remove() {
            File file = this.current;
            if (file == null) {
                throw new IllegalStateException();
            }
            file.delete();
        }

        @Override // java.util.Iterator
        public Object next() {
            return new Map.Entry() { // from class: com.thoughtworks.xstream.persistence.AbstractFilePersistenceStrategy.XmlMapEntriesIterator.1
                public final File file;
                public final Object key;

                {
                    File file = XmlMapEntriesIterator.this.current = XmlMapEntriesIterator.this.files[XmlMapEntriesIterator.access$404(XmlMapEntriesIterator.this)];
                    this.file = file;
                    this.key = AbstractFilePersistenceStrategy.this.extractKey(file.getName());
                }

                @Override // java.util.Map.Entry
                public Object getKey() {
                    return this.key;
                }

                @Override // java.util.Map.Entry
                public Object getValue() {
                    return AbstractFilePersistenceStrategy.this.readFile(this.file);
                }

                @Override // java.util.Map.Entry
                public Object setValue(Object obj) {
                    return AbstractFilePersistenceStrategy.this.put(this.key, obj);
                }

                @Override // java.util.Map.Entry
                public boolean equals(Object obj) {
                    if (!(obj instanceof Map.Entry)) {
                        return false;
                    }
                    Object value = getValue();
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object value2 = entry.getValue();
                    Object obj2 = this.key;
                    if (obj2 == null) {
                        if (key != null) {
                            return false;
                        }
                    } else if (!obj2.equals(key)) {
                        return false;
                    }
                    if (value == null) {
                        if (value2 != null) {
                            return false;
                        }
                    } else if (!getValue().equals(entry.getValue())) {
                        return false;
                    }
                    return true;
                }
            };
        }
    }

    public final void writeFile(File file, Object obj) throws IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = this.encoding != null ? new OutputStreamWriter(fileOutputStream, this.encoding) : new OutputStreamWriter(fileOutputStream);
            try {
                this.xstream.toXML(obj, outputStreamWriter);
            } finally {
                outputStreamWriter.close();
            }
        } catch (IOException e) {
            throw new StreamException(e);
        }
    }

    public final File getFile(String str) {
        return new File(this.baseDirectory, str);
    }

    public final Object readFile(File file) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = this.encoding != null ? new InputStreamReader(fileInputStream, this.encoding) : new InputStreamReader(fileInputStream);
            try {
                return this.xstream.fromXML(inputStreamReader);
            } finally {
                inputStreamReader.close();
            }
        } catch (FileNotFoundException unused) {
            return null;
        } catch (IOException e) {
            throw new StreamException(e);
        }
    }

    @Override // com.thoughtworks.xstream.persistence.PersistenceStrategy
    public Object put(Object obj, Object obj2) throws IOException {
        Object obj3 = get(obj);
        writeFile(new File(this.baseDirectory, getName(obj)), obj2);
        return obj3;
    }

    @Override // com.thoughtworks.xstream.persistence.PersistenceStrategy
    public Iterator iterator() {
        return new XmlMapEntriesIterator();
    }

    @Override // com.thoughtworks.xstream.persistence.PersistenceStrategy
    public int size() {
        return this.baseDirectory.list(this.filter).length;
    }

    public boolean containsKey(Object obj) {
        return getFile(getName(obj)).isFile();
    }

    @Override // com.thoughtworks.xstream.persistence.PersistenceStrategy
    public Object get(Object obj) {
        return readFile(getFile(getName(obj)));
    }

    @Override // com.thoughtworks.xstream.persistence.PersistenceStrategy
    public Object remove(Object obj) throws IOException {
        File file = getFile(getName(obj));
        if (!file.isFile()) {
            return null;
        }
        Object file2 = readFile(file);
        file.delete();
        return file2;
    }
}
