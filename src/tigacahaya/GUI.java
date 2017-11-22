/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tigacahaya;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.TableRowSorter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import static tigacahaya.TableRowContent.getTableContent;

/**
 *
 * @author ijash
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI & GUI execution
     */
    public GUI() {
        initComponents();
        displayTable();
        sortTable();
        
    }

    public void displayTable() {
        ArrayList<TableRowContent> list = getTableContent();
        DefaultTableModel model = (DefaultTableModel) Tabel.getModel();
        Object[] row = new Object[10];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getIdBarang();
            row[1] = list.get(i).getJenis();
            row[2] = list.get(i).getMerk();
            row[3] = list.get(i).getRagam();
            row[4] = list.get(i).getSeri();
            row[5] = list.get(i).getQty();
            row[6] = list.get(i).getHarga_beli();
            row[7] = list.get(i).getSupplier();
            row[8] = list.get(i).getTgl_masuk();
            row[9] = list.get(i).getGaransi();
            model.addRow(row);
        }
    }

    public void sortTable() {
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>((DefaultTableModel) Tabel.getModel());
        Tabel.setRowSorter(sorter);


    }

    public void refreshTable() {
        DefaultTableModel model = (DefaultTableModel) Tabel.getModel();
        model.setRowCount(0);
        displayTable();
    }

    // execute SQL query
    public void execSQLQuery(String query, String message) {
        Connection conn = MySQLconn.connect();
        Statement st;
        try {
            st = conn.createStatement();
            if ((st.executeUpdate(query)) == 1) {
                JOptionPane.showMessageDialog(null, "Data berhasil " + message);
            } else {
                JOptionPane.showMessageDialog(null, "Data gagal " + message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        TabStok = new javax.swing.JPanel();
        PanelKiri = new javax.swing.JPanel();
        labelInfo = new javax.swing.JLabel();
        buttonRefreshDB = new javax.swing.JToggleButton();
        textAreaKiri = new javax.swing.JTextArea();
        PanelBawah = new javax.swing.JPanel();
        fieldInputId_barang = new javax.swing.JTextField();
        fieldInputJenis = new javax.swing.JTextField();
        fieldInputMerk = new javax.swing.JTextField();
        fieldInputRagam = new javax.swing.JTextField();
        fieldInputSeri = new javax.swing.JTextField();
        fieldInputQty = new javax.swing.JTextField();
        fieldInputHarga_beli = new javax.swing.JTextField();
        fieldInputSupplier = new javax.swing.JTextField();
        fieldInputTanggal_masuk = new javax.swing.JTextField();
        comboBoxGaransi = new javax.swing.JComboBox<>();
        tombolUbah = new javax.swing.JButton();
        tombolTambah = new javax.swing.JButton();
        tombolHapus = new javax.swing.JButton();
        PanelAtas = new javax.swing.JPanel();
        SearchField = new javax.swing.JTextField();
        ComboBoxKolom = new javax.swing.JComboBox<>();
        LabelFilter = new javax.swing.JLabel();
        LabelKolom = new javax.swing.JLabel();
        PanelTengah = new javax.swing.JPanel();
        PanelScrollTabel = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        TabRetur = new javax.swing.JPanel();
        TabTrans = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        TabSupplier = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TabStok.setBackground(new java.awt.Color(0, 204, 255));

        PanelKiri.setBackground(new java.awt.Color(255, 204, 102));

        labelInfo.setText("Info");

        buttonRefreshDB.setText("Refresh DB");
        buttonRefreshDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRefreshDBActionPerformed(evt);
            }
        });

        textAreaKiri.setColumns(20);
        textAreaKiri.setLineWrap(true);
        textAreaKiri.setRows(5);
        textAreaKiri.setWrapStyleWord(true);

        javax.swing.GroupLayout PanelKiriLayout = new javax.swing.GroupLayout(PanelKiri);
        PanelKiri.setLayout(PanelKiriLayout);
        PanelKiriLayout.setHorizontalGroup(
            PanelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKiriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textAreaKiri, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelKiriLayout.createSequentialGroup()
                        .addComponent(buttonRefreshDB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelInfo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelKiriLayout.setVerticalGroup(
            PanelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKiriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelKiriLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(labelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonRefreshDB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textAreaKiri, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        PanelBawah.setBackground(new java.awt.Color(0, 153, 153));

        fieldInputId_barang.setText("ID");

        fieldInputJenis.setText("Jenis");

        fieldInputMerk.setText("Merk");

        fieldInputRagam.setText("Ragam");

        fieldInputSeri.setText("Seri");

        fieldInputQty.setText("Qty");

        fieldInputHarga_beli.setText("Hrg Beli");

        fieldInputSupplier.setText("Supplier");

        fieldInputTanggal_masuk.setText("Tanggal Masuk");

        comboBoxGaransi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "distributor", "toko", "tidak" }));

        tombolUbah.setText("Ubah");
        tombolUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolUbahActionPerformed(evt);
            }
        });

        tombolTambah.setText("Tambah");
        tombolTambah.setPreferredSize(new java.awt.Dimension(80, 30));
        tombolTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolTambahMouseClicked(evt);
            }
        });

        tombolHapus.setText("Hapus");
        tombolHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBawahLayout = new javax.swing.GroupLayout(PanelBawah);
        PanelBawah.setLayout(PanelBawahLayout);
        PanelBawahLayout.setHorizontalGroup(
            PanelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBawahLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(PanelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBawahLayout.createSequentialGroup()
                        .addComponent(fieldInputId_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldInputJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldInputMerk, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldInputRagam, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldInputSeri, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldInputQty, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldInputHarga_beli, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldInputSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldInputTanggal_masuk, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxGaransi, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tombolUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tombolTambah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                        .addComponent(tombolHapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelBawahLayout.setVerticalGroup(
            PanelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBawahLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldInputId_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldInputJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldInputMerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldInputRagam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldInputSeri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldInputQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldInputHarga_beli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldInputSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldInputTanggal_masuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxGaransi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tombolTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tombolHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelAtas.setBackground(new java.awt.Color(0, 204, 153));

        SearchField.setText("jTextField1");

        ComboBoxKolom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Coloumn", "ID Barang", "Jenis", "Merk", "Ragam", "Seri", "Qty", "Harga Beli", "Supplier", "Tanggal Masuk", "Garansi" }));

        LabelFilter.setText("Filter");

        LabelKolom.setText("Kolom");

        javax.swing.GroupLayout PanelAtasLayout = new javax.swing.GroupLayout(PanelAtas);
        PanelAtas.setLayout(PanelAtasLayout);
        PanelAtasLayout.setHorizontalGroup(
            PanelAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAtasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelFilter)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBoxKolom, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelKolom))
                .addContainerGap())
        );
        PanelAtasLayout.setVerticalGroup(
            PanelAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAtasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelFilter)
                    .addComponent(LabelKolom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxKolom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        PanelTengah.setBackground(new java.awt.Color(102, 0, 102));

        Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Barang", "Jenis", "Merk", "Ragam", "Seri", "Qty", "Harga Beli", "Supplier", "Tanggal Masuk", "Garansi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelMouseClicked(evt);
            }
        });
        PanelScrollTabel.setViewportView(Tabel);

        javax.swing.GroupLayout PanelTengahLayout = new javax.swing.GroupLayout(PanelTengah);
        PanelTengah.setLayout(PanelTengahLayout);
        PanelTengahLayout.setHorizontalGroup(
            PanelTengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelScrollTabel, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        PanelTengahLayout.setVerticalGroup(
            PanelTengahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelScrollTabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout TabStokLayout = new javax.swing.GroupLayout(TabStok);
        TabStok.setLayout(TabStokLayout);
        TabStokLayout.setHorizontalGroup(
            TabStokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBawah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TabStokLayout.createSequentialGroup()
                .addComponent(PanelKiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelTengah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(PanelAtas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TabStokLayout.setVerticalGroup(
            TabStokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabStokLayout.createSequentialGroup()
                .addComponent(PanelAtas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TabStokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelTengah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelKiri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addComponent(PanelBawah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane3.addTab("Stok", TabStok);

        javax.swing.GroupLayout TabReturLayout = new javax.swing.GroupLayout(TabRetur);
        TabRetur.setLayout(TabReturLayout);
        TabReturLayout.setHorizontalGroup(
            TabReturLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1099, Short.MAX_VALUE)
        );
        TabReturLayout.setVerticalGroup(
            TabReturLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Retur", TabRetur);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jButton1.setText("jButton1");

        javax.swing.GroupLayout TabTransLayout = new javax.swing.GroupLayout(TabTrans);
        TabTrans.setLayout(TabTransLayout);
        TabTransLayout.setHorizontalGroup(
            TabTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabTransLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabTransLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TabTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabTransLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(324, 324, 324))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabTransLayout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(337, 337, 337))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabTransLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(105, 105, 105))))
        );
        TabTransLayout.setVerticalGroup(
            TabTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabTransLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(32, 32, 32))
        );

        jTabbedPane3.addTab("Transaksi", TabTrans);

        javax.swing.GroupLayout TabSupplierLayout = new javax.swing.GroupLayout(TabSupplier);
        TabSupplier.setLayout(TabSupplierLayout);
        TabSupplierLayout.setHorizontalGroup(
            TabSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1099, Short.MAX_VALUE)
        );
        TabSupplierLayout.setVerticalGroup(
            TabSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Supplier", TabSupplier);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelMouseClicked
        // Display selected row in text fields
        String comb = "Tidak";
        int i = Tabel.getSelectedRow();
        TableModel model = Tabel.getModel();
        fieldInputId_barang.setText(model.getValueAt(i, 0).toString());
        fieldInputJenis.setText(model.getValueAt(i, 1).toString());
        fieldInputMerk.setText(model.getValueAt(i, 2).toString());
        fieldInputRagam.setText(model.getValueAt(i, 3).toString());
        fieldInputRagam.setCaretPosition(0);
        fieldInputSeri.setText(model.getValueAt(i, 4).toString());
        fieldInputSeri.setCaretPosition(0);
        fieldInputQty.setText(model.getValueAt(i, 5).toString());
        fieldInputHarga_beli.setText(model.getValueAt(i, 6).toString());
        fieldInputTanggal_masuk.setText(model.getValueAt(i, 8).toString());
        fieldInputTanggal_masuk.setCaretPosition(0);
        comb = (String) model.getValueAt(i, 9);
        switch (comb) {
            case "Distributor":
                comboBoxGaransi.setSelectedIndex(0);
                break;
            case "Tidak":
                comboBoxGaransi.setSelectedIndex(2);
                break;
            case "Toko":
                comboBoxGaransi.setSelectedIndex(1);
                break;
        }
        System.out.println(comboBoxGaransi.getSelectedIndex());
        textAreaKiri.setText(model.getValueAt(i, 1).toString() + "\n" + model.getValueAt(i, 2).toString() + "\n" + model.getValueAt(i, 3).toString() + " " + model.getValueAt(i, 4).toString());
        fieldInputSupplier.setText(MySQLconn.executeSingleQueryResult("SELECT supplier FROM `barang` WHERE barang.id_barang='" + (model.getValueAt(i, 0).toString()) + "'", "supplier"));
    }//GEN-LAST:event_TabelMouseClicked

    private void tombolTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolTambahMouseClicked
        String query = "INSERT INTO `barang`(`code`, `no`, `id_barang`, `jenis`, `merk`, `ragam`, `seri`, `qty`, `harga_beli`, `supplier`, `tgl_masuk`, `garansi`) VALUES('P',NULL,NULL,'" + fieldInputJenis.getText() + "','" + fieldInputMerk.getText() + "','" + fieldInputRagam.getText() + "','" + fieldInputSeri.getText() + "','" + fieldInputQty.getText() + "','" + fieldInputHarga_beli.getText() + "','" + fieldInputSupplier.getText() + "',CURRENT_TIMESTAMP,'" + comboBoxGaransi.getSelectedItem() + "')";
        execSQLQuery(query, "ditambahkan");
        MySQLconn.executeVoidQuery("UPDATE barang SET id_barang = concat( code,LPAD(barang.`no`, 7,\"000\") );");
        System.out.println(query);
        refreshTable();
    }//GEN-LAST:event_tombolTambahMouseClicked

    private void tombolUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolUbahActionPerformed

        String query = "UPDATE `barang` SET `jenis`= '" + fieldInputJenis.getText() + "',`merk`='" + fieldInputMerk.getText() + "',`ragam`='" + fieldInputRagam.getText() + "',`seri`='" + fieldInputSeri.getText() + "',`qty`='" + fieldInputQty.getText() + "',`harga_beli`='" + fieldInputHarga_beli.getText() + "',`supplier`='" + fieldInputSupplier.getText() + "',`garansi`='" + (String) comboBoxGaransi.getSelectedItem() + "' WHERE `id_barang`='" + fieldInputId_barang.getText() + "';";

        execSQLQuery(query, "diubah");
        MySQLconn.executeVoidQuery("UPDATE barang SET id_barang = concat( code,LPAD(barang.`no`, 7,\"000\") );");

        System.out.println(query);
        refreshTable();
    }//GEN-LAST:event_tombolUbahActionPerformed

    private void tombolHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolHapusActionPerformed

        String query = "DELETE from `barang` WHERE `id_barang`='" + fieldInputId_barang.getText() + "';";
        execSQLQuery(query, "" + "dihapus");
        System.out.println(query);
        refreshTable();
    }//GEN-LAST:event_tombolHapusActionPerformed

    private void buttonRefreshDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRefreshDBActionPerformed
        refreshTable();
        execSQLQuery("UPDATE barang SET id_barang = concat( code,LPAD(barang.`no`, 7,\"000\"))", "refresh");
    }//GEN-LAST:event_buttonRefreshDBActionPerformed

    /**
     * by ijash
     */
    public static void guiStart() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxKolom;
    private javax.swing.JLabel LabelFilter;
    private javax.swing.JLabel LabelKolom;
    private javax.swing.JPanel PanelAtas;
    private javax.swing.JPanel PanelBawah;
    private javax.swing.JPanel PanelKiri;
    private javax.swing.JScrollPane PanelScrollTabel;
    private javax.swing.JPanel PanelTengah;
    private javax.swing.JTextField SearchField;
    private javax.swing.JPanel TabRetur;
    private javax.swing.JPanel TabStok;
    private javax.swing.JPanel TabSupplier;
    private javax.swing.JPanel TabTrans;
    private javax.swing.JTable Tabel;
    private javax.swing.JToggleButton buttonRefreshDB;
    private javax.swing.JComboBox<String> comboBoxGaransi;
    private javax.swing.JTextField fieldInputHarga_beli;
    private javax.swing.JTextField fieldInputId_barang;
    private javax.swing.JTextField fieldInputJenis;
    private javax.swing.JTextField fieldInputMerk;
    private javax.swing.JTextField fieldInputQty;
    private javax.swing.JTextField fieldInputRagam;
    private javax.swing.JTextField fieldInputSeri;
    private javax.swing.JTextField fieldInputSupplier;
    private javax.swing.JTextField fieldInputTanggal_masuk;
    private javax.swing.JButton jButton1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel labelInfo;
    private javax.swing.JTextArea textAreaKiri;
    private javax.swing.JButton tombolHapus;
    private javax.swing.JButton tombolTambah;
    private javax.swing.JButton tombolUbah;
    // End of variables declaration//GEN-END:variables
}
