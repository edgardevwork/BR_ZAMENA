package org.apache.ivy.util;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.apache.ivy.Ivy;

/* loaded from: classes8.dex */
public final class CredentialsUtil {

    public static final class CredentialPanel extends JPanel {
        public static final int FIELD_LENGTH = 20;
        public JTextField userNameField = new JTextField(20);
        public JTextField passwordField = new JPasswordField(20);
        public JCheckBox rememberDataCB = new JCheckBox("remember my information");

        public CredentialPanel(Credentials credentials, File file) {
            String str;
            setLayout(new GridBagLayout());
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.insets = new Insets(2, 2, 2, 2);
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridheight = 1;
            gridBagConstraints.gridwidth = 2;
            if (credentials.getRealm() != null) {
                str = "Enter username and password for \"" + credentials.getRealm() + "\" at " + credentials.getHost();
            } else {
                str = "Enter username and password for " + credentials.getHost();
            }
            add(new JLabel(str), gridBagConstraints);
            gridBagConstraints.gridy = 1;
            gridBagConstraints.gridwidth = 1;
            add(new JLabel("username: "), gridBagConstraints);
            gridBagConstraints.gridx = 2;
            add(this.userNameField, gridBagConstraints);
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy++;
            if (credentials.getUserName() != null) {
                this.userNameField.setText(credentials.getUserName());
            }
            if (credentials.getPasswd() == null) {
                add(new JLabel("passwd:  "), gridBagConstraints);
                gridBagConstraints.gridx = 2;
                add(this.passwordField, gridBagConstraints);
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy++;
            } else {
                this.passwordField.setText(credentials.getPasswd());
            }
            if (file != null) {
                gridBagConstraints.gridwidth = 2;
                add(this.rememberDataCB, gridBagConstraints);
                gridBagConstraints.gridy++;
            }
            gridBagConstraints.gridwidth = 2;
            add(new JLabel(), gridBagConstraints);
        }
    }

    public static Credentials promptCredentials(Credentials credentials, File file) throws IOException {
        Credentials credentialsLoadPassfile = loadPassfile(credentials, file);
        if (credentialsLoadPassfile.getUserName() != null && credentialsLoadPassfile.getPasswd() != null) {
            return credentialsLoadPassfile;
        }
        CredentialPanel credentialPanel = new CredentialPanel(credentialsLoadPassfile, file);
        if (JOptionPane.showOptionDialog((Component) null, credentialPanel, credentialsLoadPassfile.getHost() + " credentials", 2, 0, new ImageIcon(Ivy.class.getResource("logo.png")), (Object[]) null, 0) != 0) {
            return credentialsLoadPassfile;
        }
        String text = credentialPanel.userNameField.getText();
        String text2 = credentialPanel.passwordField.getText();
        if (credentialPanel.rememberDataCB.isSelected()) {
            EncryptedProperties encryptedProperties = new EncryptedProperties();
            encryptedProperties.setProperty("username", text);
            encryptedProperties.setProperty("passwd", text2);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    encryptedProperties.store(fileOutputStream, "");
                    fileOutputStream.close();
                } finally {
                }
            } catch (Exception e) {
                Message.warn("error occurred while saving password file " + file, e);
            }
        }
        return new Credentials(credentialsLoadPassfile.getRealm(), credentialsLoadPassfile.getHost(), text, text2);
    }

    public static Credentials loadPassfile(Credentials credentials, File file) throws IOException {
        if (file != null && file.exists()) {
            EncryptedProperties encryptedProperties = new EncryptedProperties();
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    encryptedProperties.load(fileInputStream);
                    String userName = credentials.getUserName();
                    String passwd = credentials.getPasswd();
                    if (userName == null) {
                        userName = encryptedProperties.getProperty("username");
                    }
                    if (passwd == null) {
                        passwd = encryptedProperties.getProperty("passwd");
                    }
                    Credentials credentials2 = new Credentials(credentials.getRealm(), credentials.getHost(), userName, passwd);
                    fileInputStream.close();
                    return credentials2;
                } finally {
                }
            } catch (IOException e) {
                Message.warn("error occurred while loading password file " + file, e);
            }
        }
        return credentials;
    }
}
