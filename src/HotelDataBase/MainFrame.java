package HotelDataBase;





import java.awt.Color;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;
import oracle.jdbc.pool.OracleDataSource;



public class MainFrame extends javax.swing.JFrame {

    
    public MainFrame() {
        // Constructor
        c1 = new Color(110,198,255);
        c2 = new Color(51,153,255);
        initComponents();
        initialEnviroment();
        this.jTableAllResrAgent.setVisible(false);
        try {

            emf = Persistence.createEntityManagerFactory("JavaApplication10PU");

            //emf = Persistence.createEntityManagerFactory("ProjectPU");

            em = emf.createEntityManager();
            ods = new OracleDataSource();
            ods.setUser("ashraf");
            ods.setPassword("123456");
            ods.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
        } catch(Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
        }
        EntityManagerFactory eemf = Persistence.createEntityManagerFactory("JavaApplication10PU");
        EntityManager eem = eemf.createEntityManager();
        List <Reservationagent>allReservagent = eem.createNamedQuery("Reservationagent.findAll").getResultList();
        int count = allReservagent.size();
        BigDecimal [] reservagentIds = new BigDecimal [count];
        for(int i=0 ; i<count ;i++){
           //System.out.println(allReservagent.get(i).toString());
            reservagentIds [i] = allReservagent.get(i).getReservationagentid();
            System.out.println(reservagentIds [i] );
        }

        DefaultComboBoxModel list = new DefaultComboBoxModel(reservagentIds);
        this.combBxReservagent.setModel(list);
    }
    
    
    private void initialEnviroment() {
        // Initial the displaying of home page panel
        setColor(homePageSide);
        this.AdminPanel.setVisible(false);
        this.HomePanel.setVisible(true);
        this.catalogPanel.setVisible(false);
        this.guestPanel.setVisible(false);
        this.paymentsPanel.setVisible(false);
        this.bookingPanel.setVisible(false);
        this.endBooking.setEnabled(false);
        this.txtAreaPayments.setEditable(false);
        this.roomsAvailable.setEditable(false);
        this.searchTxtFld.setEnabled(false);
        this.searchTxtFld.setEditable(false);

        this.ScrollPaneAdminPaneAfterLogIn.setVisible(false);
        this.AdminPaneAfterLogIn.setVisible(false);

        this.txtAreaPayments.setText("Payment ID\t      Guest ID\t      Reservation Agent ID\t      Room ID\t      Booking ID\t   Total bill\t      Date of bill\n");
        this.txtAreaPayments.append("----------------------------------------------------------------------------------------------------------\n");

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        YazanProjectPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("JavaApplication10PU").createEntityManager();
        start = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        enter = new javax.swing.JButton();
        userTxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        passFld = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        BackGroundPanel = new javax.swing.JPanel();
        SidePanel = new javax.swing.JPanel();
        adminPanelSide = new javax.swing.JPanel();
        adminIcon = new javax.swing.JLabel();
        adminLabelSide = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Sep1 = new javax.swing.JSeparator();
        roomsPanelSide = new javax.swing.JPanel();
        roomsIcon = new javax.swing.JLabel();
        roomsLabelSide = new javax.swing.JLabel();
        guestPanelSide = new javax.swing.JPanel();
        guestIcon = new javax.swing.JLabel();
        guestLabelSide = new javax.swing.JLabel();
        paymentsPanelSide = new javax.swing.JPanel();
        paymentIcon = new javax.swing.JLabel();
        paymentsLabel = new javax.swing.JLabel();
        bookingTableSide = new javax.swing.JPanel();
        bookingIcon = new javax.swing.JLabel();
        bookingLabel = new javax.swing.JLabel();
        homePageSide = new javax.swing.JPanel();
        adminIcon1 = new javax.swing.JLabel();
        HomeLabelSide = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        Sign = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        layeredPanel = new javax.swing.JLayeredPane();
        bookingPanel = new javax.swing.JPanel();
        titleBookingPanel = new javax.swing.JPanel();
        bookingTitleLabel = new javax.swing.JLabel();
        room_id_booking = new javax.swing.JLabel();
        dateFromBooking = new javax.swing.JLabel();
        dateToBooking = new javax.swing.JLabel();
        resAgt_id_booking = new javax.swing.JLabel();
        endBooking = new javax.swing.JButton();
        register = new javax.swing.JButton();
        dateFrom = new com.toedter.calendar.JDateChooser();
        dateTo = new com.toedter.calendar.JDateChooser();
        room_idBooking = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableBookingTable = new javax.swing.JTable();
        combBxReservagent = new javax.swing.JComboBox();
        paymentsPanel = new javax.swing.JPanel();
        titlePaymentsPanel = new javax.swing.JPanel();
        titlePayments = new javax.swing.JLabel();
        resAgtID_Pyts = new javax.swing.JTextField();
        resAgent_Bill = new javax.swing.JLabel();
        resAgent_Bill1 = new javax.swing.JLabel();
        discount = new javax.swing.JComboBox<String>();
        resAgent_Bill2 = new javax.swing.JLabel();
        billDate = new com.toedter.calendar.JDateChooser();
        reportPayments = new javax.swing.JButton();
        billBtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaPayments = new javax.swing.JTextArea();
        totalCharge = new javax.swing.JLabel();
        totalChargeTxtFld = new javax.swing.JTextField();
        guestPanel = new javax.swing.JPanel();
        gTitlePanel = new javax.swing.JPanel();
        guestTitle = new javax.swing.JLabel();
        informationLabel = new javax.swing.JLabel();
        gLNLabel = new javax.swing.JLabel();
        jTxtFname = new javax.swing.JTextField();
        SSNGuest1 = new javax.swing.JLabel();
        gFNLabel = new javax.swing.JLabel();
        gCityLabel = new javax.swing.JLabel();
        gCodeLabel = new javax.swing.JLabel();
        gCountryLabel = new javax.swing.JLabel();
        gNatLabel = new javax.swing.JLabel();
        gCellLabel = new javax.swing.JLabel();
        gHomePhoneLabel = new javax.swing.JLabel();
        gEmailLab = new javax.swing.JLabel();
        gAddLabel = new javax.swing.JLabel();
        gBdateLab = new javax.swing.JLabel();
        gGenderLabel = new javax.swing.JLabel();
        jTxtSsn = new javax.swing.JTextField();
        jTxtLname = new javax.swing.JTextField();
        jTxtCity = new javax.swing.JTextField();
        jTxtCountry = new javax.swing.JTextField();
        jTxtNationality = new javax.swing.JTextField();
        jTxtAdd = new javax.swing.JTextField();
        jTxtCellPhone = new javax.swing.JTextField();
        jTxtHomePhone = new javax.swing.JTextField();
        jTxtEmail = new javax.swing.JTextField();
        jTxtZipCode = new javax.swing.JTextField();
        jTxtBDate = new com.toedter.calendar.JDateChooser();
        combBxGGender = new javax.swing.JComboBox<String>();
        confirmBtnGuest = new javax.swing.JButton();
        clrGuestinfo = new javax.swing.JButton();
        AdminPanel = new javax.swing.JPanel();
        AdminLogniPanel = new javax.swing.JPanel();
        adminStmt = new javax.swing.JLabel();
        adminTitle = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        userNameTxtFld = new javax.swing.JTextField();
        passwordTxtFld = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        HomePanel = new javax.swing.JPanel();
        VelvetHotel = new javax.swing.JPanel();
        blueVelvetHotel = new javax.swing.JLabel();
        greeting = new javax.swing.JLabel();
        logoImg = new javax.swing.JLabel();
        hotelimg = new javax.swing.JLabel();
        catalogPanel = new javax.swing.JPanel();
        titleCatalog = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        insertTitle = new javax.swing.JLabel();
        floor = new javax.swing.JLabel();
        desc = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        State = new javax.swing.JLabel();
        starLabel = new javax.swing.JLabel();
        floorTxtFld = new javax.swing.JTextField();
        descTxtFld = new javax.swing.JTextField();
        priceTxtFld = new javax.swing.JTextField();
        star = new javax.swing.JComboBox<String>();
        status = new javax.swing.JComboBox<String>();
        OKcatalogBtn = new javax.swing.JButton();
        clrBtnRooms = new javax.swing.JButton();
        roomTypeCmbBox = new javax.swing.JComboBox<String>();
        search = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        refreshCatalog = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomsAvailable = new javax.swing.JTextArea();
        chooseSearch = new javax.swing.JComboBox<String>();
        searchTxtFld = new javax.swing.JTextField();
        ScrollPaneAdminPaneAfterLogIn = new javax.swing.JScrollPane();
        AdminPaneAfterLogIn = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableAllResrAgent = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtSsnForRes = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        gNatLabel1 = new javax.swing.JLabel();
        gNatLabel2 = new javax.swing.JLabel();
        jTxtFNameForRes = new javax.swing.JTextField();
        jTxtCityForRes = new javax.swing.JTextField();
        jTxtCountyForRes = new javax.swing.JTextField();
        jTxtLNameForRes = new javax.swing.JTextField();
        jTxtNationalityForRes = new javax.swing.JTextField();
        jTxtAddressForRes = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jDateBirthDateForRese = new com.toedter.calendar.JDateChooser();
        jTxtCellualrForRes = new javax.swing.JTextField();
        jTxtEmailForRes = new javax.swing.JTextField();
        jTxtHomePhoneForRes = new javax.swing.JTextField();
        jTxtSalaryForRes = new javax.swing.JTextField();
        jTxtSectionForRes = new javax.swing.JTextField();
        combBxGGenderForRes = new javax.swing.JComboBox<String>();
        jBtnAddNewReservagevt = new javax.swing.JButton();
        jBtnUpdateReseevagent = new javax.swing.JButton();
        jBtnDeleteReservagent = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jTxtZepCodeForRes = new javax.swing.JTextField();
        jBtnFillDataIntoFieldes = new javax.swing.JButton();

        start.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        start.setTitle("Log in");

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        enter.setBackground(new java.awt.Color(204, 204, 0));
        enter.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        enter.setForeground(new java.awt.Color(0, 0, 255));
        enter.setText("Enter =>");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        userTxt.setBackground(new java.awt.Color(255, 255, 0));
        userTxt.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        userTxt.setForeground(new java.awt.Color(0, 0, 255));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 0));
        jLabel14.setText("User name:");

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 0));
        jLabel18.setText("Password:");

        passFld.setBackground(new java.awt.Color(255, 255, 0));
        passFld.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        passFld.setForeground(new java.awt.Color(0, 0, 255));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 3, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 204, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Blue Velvet Hotel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel19)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel18))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enter)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(userTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                .addComponent(passFld)))
                        .addGap(0, 181, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(passFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(enter)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout startLayout = new javax.swing.GroupLayout(start.getContentPane());
        start.getContentPane().setLayout(startLayout);
        startLayout.setHorizontalGroup(
            startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        startLayout.setVerticalGroup(
            startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hotel Reservation System");
        setBackground(new java.awt.Color(255, 255, 255));
        setExtendedState(MAXIMIZED_BOTH);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1101, 588));

        BackGroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        BackGroundPanel.setPreferredSize(new java.awt.Dimension(1000, 1100));

        SidePanel.setBackground(new java.awt.Color(0, 105, 192));
        SidePanel.setMaximumSize(new java.awt.Dimension(278, 588));

        adminPanelSide.setBackground(new java.awt.Color(110, 198, 255));
        adminPanelSide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminPanelSideMouseClicked(evt);
            }
        });

        adminIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImages/Admin.png"))); // NOI18N
        adminIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminIconMouseClicked(evt);
            }
        });

        adminLabelSide.setBackground(new java.awt.Color(255, 255, 255));
        adminLabelSide.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adminLabelSide.setForeground(new java.awt.Color(255, 255, 255));
        adminLabelSide.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        adminLabelSide.setText("Administrator");
        adminLabelSide.setToolTipText("Adminstrator section");
        adminLabelSide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminLabelSideMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout adminPanelSideLayout = new javax.swing.GroupLayout(adminPanelSide);
        adminPanelSide.setLayout(adminPanelSideLayout);
        adminPanelSideLayout.setHorizontalGroup(
            adminPanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelSideLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(adminIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminLabelSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        adminPanelSideLayout.setVerticalGroup(
            adminPanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPanelSideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(adminPanelSideLayout.createSequentialGroup()
                .addComponent(adminLabelSide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Hotel Reservation System");

        roomsPanelSide.setBackground(new java.awt.Color(110, 198, 255));
        roomsPanelSide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catalogPanelMouseClicked(evt);
            }
        });

        roomsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImages/rooms.png"))); // NOI18N
        roomsIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconCatalogMouseClicked(evt);
            }
        });

        roomsLabelSide.setBackground(new java.awt.Color(204, 255, 255));
        roomsLabelSide.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        roomsLabelSide.setForeground(new java.awt.Color(255, 255, 255));
        roomsLabelSide.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        roomsLabelSide.setText("Catalog of rooms");
        roomsLabelSide.setToolTipText("Rooms Section (Catalog)");
        roomsLabelSide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catalogLabelMouseCliked(evt);
            }
        });

        javax.swing.GroupLayout roomsPanelSideLayout = new javax.swing.GroupLayout(roomsPanelSide);
        roomsPanelSide.setLayout(roomsPanelSideLayout);
        roomsPanelSideLayout.setHorizontalGroup(
            roomsPanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomsPanelSideLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(roomsIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roomsLabelSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roomsPanelSideLayout.setVerticalGroup(
            roomsPanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roomsPanelSideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roomsIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(roomsPanelSideLayout.createSequentialGroup()
                .addComponent(roomsLabelSide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        guestPanelSide.setBackground(new java.awt.Color(110, 198, 255));
        guestPanelSide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guestPanelMouseClicked(evt);
            }
        });

        guestIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImages/Guest.png"))); // NOI18N
        guestIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guestIconMouseClicked(evt);
            }
        });

        guestLabelSide.setBackground(new java.awt.Color(204, 255, 255));
        guestLabelSide.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        guestLabelSide.setForeground(new java.awt.Color(255, 255, 255));
        guestLabelSide.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        guestLabelSide.setText("Add new Guest");
        guestLabelSide.setToolTipText("Add new guest to reserve a room");
        guestLabelSide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guestLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout guestPanelSideLayout = new javax.swing.GroupLayout(guestPanelSide);
        guestPanelSide.setLayout(guestPanelSideLayout);
        guestPanelSideLayout.setHorizontalGroup(
            guestPanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guestPanelSideLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(guestIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guestLabelSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        guestPanelSideLayout.setVerticalGroup(
            guestPanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guestPanelSideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(guestIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(guestLabelSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        paymentsPanelSide.setBackground(new java.awt.Color(110, 198, 255));
        paymentsPanelSide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentsPanelSideMouseClicked(evt);
            }
        });

        paymentIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImages/Pay.png"))); // NOI18N
        paymentIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentIconMouseClicked(evt);
            }
        });

        paymentsLabel.setBackground(new java.awt.Color(255, 255, 255));
        paymentsLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        paymentsLabel.setForeground(new java.awt.Color(255, 255, 255));
        paymentsLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        paymentsLabel.setText("Payments");
        paymentsLabel.setToolTipText("Payment Section - Pay the charge");
        paymentsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentsLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paymentsPanelSideLayout = new javax.swing.GroupLayout(paymentsPanelSide);
        paymentsPanelSide.setLayout(paymentsPanelSideLayout);
        paymentsPanelSideLayout.setHorizontalGroup(
            paymentsPanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentsPanelSideLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(paymentIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paymentsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paymentsPanelSideLayout.setVerticalGroup(
            paymentsPanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentsPanelSideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paymentIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentsPanelSideLayout.createSequentialGroup()
                .addComponent(paymentsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bookingTableSide.setBackground(new java.awt.Color(110, 198, 255));
        bookingTableSide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingTableSideMouseClicked(evt);
            }
        });

        bookingIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImages/BookingTable.png"))); // NOI18N
        bookingIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingIconMouseClicked(evt);
            }
        });

        bookingLabel.setBackground(new java.awt.Color(255, 255, 255));
        bookingLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bookingLabel.setForeground(new java.awt.Color(255, 255, 255));
        bookingLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bookingLabel.setText("Booking table");
        bookingLabel.setToolTipText("All Booking Data");
        bookingLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bookingTableSideLayout = new javax.swing.GroupLayout(bookingTableSide);
        bookingTableSide.setLayout(bookingTableSideLayout);
        bookingTableSideLayout.setHorizontalGroup(
            bookingTableSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingTableSideLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(bookingIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bookingTableSideLayout.setVerticalGroup(
            bookingTableSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookingTableSideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookingIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(bookingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        homePageSide.setBackground(new java.awt.Color(110, 198, 255));
        homePageSide.setToolTipText("Home Page");
        homePageSide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePageSideMouseClicked(evt);
            }
        });

        adminIcon1.setForeground(new java.awt.Color(255, 255, 255));
        adminIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImages/home.png"))); // NOI18N
        adminIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseCliked(evt);
            }
        });

        HomeLabelSide.setBackground(new java.awt.Color(0, 0, 0));
        HomeLabelSide.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HomeLabelSide.setForeground(new java.awt.Color(255, 255, 255));
        HomeLabelSide.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HomeLabelSide.setText("Home Page");
        HomeLabelSide.setToolTipText("Home Page");
        HomeLabelSide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeLabelSideMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout homePageSideLayout = new javax.swing.GroupLayout(homePageSide);
        homePageSide.setLayout(homePageSideLayout);
        homePageSideLayout.setHorizontalGroup(
            homePageSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePageSideLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(adminIcon1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HomeLabelSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homePageSideLayout.setVerticalGroup(
            homePageSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePageSideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(homePageSideLayout.createSequentialGroup()
                .addComponent(HomeLabelSide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SidePanelLayout = new javax.swing.GroupLayout(SidePanel);
        SidePanel.setLayout(SidePanelLayout);
        SidePanelLayout.setHorizontalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminPanelSide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(roomsPanelSide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(guestPanelSide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(paymentsPanelSide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(bookingTableSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Sep1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(homePageSide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SidePanelLayout.setVerticalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sep1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homePageSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(adminPanelSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(roomsPanelSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(guestPanelSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(paymentsPanelSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(bookingTableSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(379, Short.MAX_VALUE))
        );

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setMaximumSize(new java.awt.Dimension(32767, 588));

        Sign.setBackground(new java.awt.Color(255, 255, 255));
        Sign.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        Sign.setText("We ♥ data base");

        exit.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImages/exit.png"))); // NOI18N
        exit.setToolTipText("Exit the application");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        bookingPanel.setBackground(new java.awt.Color(0, 153, 153));

        titleBookingPanel.setBackground(new java.awt.Color(0, 102, 102));

        bookingTitleLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        bookingTitleLabel.setForeground(new java.awt.Color(204, 204, 204));
        bookingTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookingTitleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImages/Reservation.png"))); // NOI18N
        bookingTitleLabel.setText("Booking Table");

        javax.swing.GroupLayout titleBookingPanelLayout = new javax.swing.GroupLayout(titleBookingPanel);
        titleBookingPanel.setLayout(titleBookingPanelLayout);
        titleBookingPanelLayout.setHorizontalGroup(
            titleBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleBookingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookingTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        titleBookingPanelLayout.setVerticalGroup(
            titleBookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleBookingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookingTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addContainerGap())
        );

        room_id_booking.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        room_id_booking.setForeground(new java.awt.Color(255, 255, 255));
        room_id_booking.setText("Room ID:");

        dateFromBooking.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        dateFromBooking.setForeground(new java.awt.Color(255, 255, 255));
        dateFromBooking.setText("Date From:");

        dateToBooking.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        dateToBooking.setForeground(new java.awt.Color(255, 255, 255));
        dateToBooking.setText("Date To:");

        resAgt_id_booking.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        resAgt_id_booking.setForeground(new java.awt.Color(255, 255, 255));
        resAgt_id_booking.setText("Res. Agt. ID :");

        endBooking.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        endBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImages/End.png"))); // NOI18N
        endBooking.setText("End Booking");
        endBooking.setToolTipText("End the booking on room from specific guest");
        endBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endBookingActionPerformed(evt);
            }
        });

        register.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImages/Start.png"))); // NOI18N
        register.setText("Start Booking");
        register.setToolTipText("Start the booking of rooms for specific guest");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        dateFrom.setDateFormatString("dd/MM/yyyy");

        dateTo.setDateFormatString("dd/MM/yyyy");

        room_idBooking.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N

        jTableBookingTable.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jTableBookingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Booking ID", "Guest SSN", "Guest ID", "Room ID", "Date From", "Date To"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableBookingTable.setToolTipText("Data of booking");
        jTableBookingTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBookingTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableBookingTable);

        combBxReservagent.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout bookingPanelLayout = new javax.swing.GroupLayout(bookingPanel);
        bookingPanel.setLayout(bookingPanelLayout);
        bookingPanelLayout.setHorizontalGroup(
            bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleBookingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookingPanelLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookingPanelLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(register))
                    .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bookingPanelLayout.createSequentialGroup()
                            .addComponent(resAgt_id_booking, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(combBxReservagent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bookingPanelLayout.createSequentialGroup()
                            .addComponent(room_id_booking, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(room_idBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookingPanelLayout.createSequentialGroup()
                        .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateToBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateFromBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(endBooking))
                .addGap(121, 121, 121))
            .addGroup(bookingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        bookingPanelLayout.setVerticalGroup(
            bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(titleBookingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookingPanelLayout.createSequentialGroup()
                        .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(room_id_booking, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(room_idBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resAgt_id_booking, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combBxReservagent, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bookingPanelLayout.createSequentialGroup()
                        .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateFromBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateToBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37)
                .addGroup(bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endBooking)
                    .addComponent(register))
                .addGap(113, 113, 113)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        paymentsPanel.setBackground(new java.awt.Color(204, 204, 0));

        titlePaymentsPanel.setBackground(new java.awt.Color(255, 255, 0));

        titlePayments.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        titlePayments.setForeground(new java.awt.Color(102, 102, 102));
        titlePayments.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlePayments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImages/Payment_Section.png"))); // NOI18N
        titlePayments.setText("Payments Section");

        javax.swing.GroupLayout titlePaymentsPanelLayout = new javax.swing.GroupLayout(titlePaymentsPanel);
        titlePaymentsPanel.setLayout(titlePaymentsPanelLayout);
        titlePaymentsPanelLayout.setHorizontalGroup(
            titlePaymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePaymentsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlePayments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        titlePaymentsPanelLayout.setVerticalGroup(
            titlePaymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePaymentsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlePayments, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        resAgtID_Pyts.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        resAgtID_Pyts.setForeground(new java.awt.Color(51, 51, 255));
        resAgtID_Pyts.setToolTipText("Enter the reservation agent who register the bill");

        resAgent_Bill.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        resAgent_Bill.setText("Discount by:");

        resAgent_Bill1.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        resAgent_Bill1.setText("Reservation Agent ID:");

        discount.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        discount.setMaximumRowCount(4);
        discount.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0.0", "0.05", "0.07" }));
        discount.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                discountItemStateChanged(evt);
            }
        });

        resAgent_Bill2.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        resAgent_Bill2.setText("Date of creating bill:");

        billDate.setDateFormatString("dd/MM/yyyy");

        reportPayments.setBackground(new java.awt.Color(153, 153, 0));
        reportPayments.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        reportPayments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImages/report.png"))); // NOI18N
        reportPayments.setText("Refresh the payment report");
        reportPayments.setToolTipText("Refresh the report which stored as PDF");
        reportPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportPaymentsActionPerformed(evt);
            }
        });

        billBtn.setBackground(new java.awt.Color(153, 153, 0));
        billBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        billBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImages/Bill.png"))); // NOI18N
        billBtn.setText("new Bill");
        billBtn.setToolTipText("Create new bill and end booking");
        billBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billBtnActionPerformed(evt);
            }
        });

        txtAreaPayments.setBackground(new java.awt.Color(255, 204, 0));
        txtAreaPayments.setColumns(20);
        txtAreaPayments.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
        txtAreaPayments.setForeground(new java.awt.Color(0, 0, 255));
        txtAreaPayments.setRows(5);
        jScrollPane4.setViewportView(txtAreaPayments);

        totalCharge.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        totalCharge.setText("Total Charge:");

        totalChargeTxtFld.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        totalChargeTxtFld.setForeground(new java.awt.Color(51, 51, 255));
        totalChargeTxtFld.setToolTipText("Enter the reservation agent who register the bill");
        totalChargeTxtFld.setEnabled(false);

        javax.swing.GroupLayout paymentsPanelLayout = new javax.swing.GroupLayout(paymentsPanel);
        paymentsPanel.setLayout(paymentsPanelLayout);
        paymentsPanelLayout.setHorizontalGroup(
            paymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePaymentsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(paymentsPanelLayout.createSequentialGroup()
                .addGroup(paymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentsPanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(paymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(paymentsPanelLayout.createSequentialGroup()
                                    .addComponent(resAgent_Bill2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(billDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(paymentsPanelLayout.createSequentialGroup()
                                    .addComponent(resAgent_Bill1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(resAgtID_Pyts, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(paymentsPanelLayout.createSequentialGroup()
                                .addComponent(totalCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalChargeTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(118, 118, 118)
                        .addGroup(paymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(reportPayments)
                            .addGroup(paymentsPanelLayout.createSequentialGroup()
                                .addComponent(resAgent_Bill)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(discount, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(billBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                    .addGroup(paymentsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4)))
                .addContainerGap())
        );
        paymentsPanelLayout.setVerticalGroup(
            paymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentsPanelLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(titlePaymentsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(paymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resAgent_Bill, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resAgtID_Pyts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resAgent_Bill1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentsPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(paymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reportPayments, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(billBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(paymentsPanelLayout.createSequentialGroup()
                        .addGroup(paymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resAgent_Bill2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(billDate, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                        .addGap(14, 14, 14)
                        .addGroup(paymentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalCharge, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(totalChargeTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        guestPanel.setBackground(new java.awt.Color(51, 153, 255));
        guestPanel.setToolTipText("Guest Panel");

        gTitlePanel.setBackground(new java.awt.Color(0, 102, 204));

        guestTitle.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        guestTitle.setForeground(new java.awt.Color(255, 204, 204));
        guestTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guestTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImages/GuestReception.png"))); // NOI18N
        guestTitle.setText("Guests adding section");

        informationLabel.setBackground(new java.awt.Color(255, 204, 204));
        informationLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        informationLabel.setForeground(new java.awt.Color(255, 204, 204));
        informationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        informationLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImages/Information.png"))); // NOI18N
        informationLabel.setText("Fill the information about the guest:");

        javax.swing.GroupLayout gTitlePanelLayout = new javax.swing.GroupLayout(gTitlePanel);
        gTitlePanel.setLayout(gTitlePanelLayout);
        gTitlePanelLayout.setHorizontalGroup(
            gTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gTitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(guestTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(informationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        gTitlePanelLayout.setVerticalGroup(
            gTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gTitlePanelLayout.createSequentialGroup()
                .addComponent(guestTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(informationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gLNLabel.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        gLNLabel.setForeground(new java.awt.Color(102, 102, 102));
        gLNLabel.setText("Last name:");

        jTxtFname.setBackground(new java.awt.Color(255, 102, 51));
        jTxtFname.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        jTxtFname.setForeground(new java.awt.Color(255, 255, 255));

        SSNGuest1.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        SSNGuest1.setForeground(new java.awt.Color(102, 102, 102));
        SSNGuest1.setText("SSN:");

        gFNLabel.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        gFNLabel.setForeground(new java.awt.Color(102, 102, 102));
        gFNLabel.setText("First name:");

        gCityLabel.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        gCityLabel.setForeground(new java.awt.Color(102, 102, 102));
        gCityLabel.setText("City:");

        gCodeLabel.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        gCodeLabel.setForeground(new java.awt.Color(102, 102, 102));
        gCodeLabel.setText("ZIP Code:");

        gCountryLabel.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        gCountryLabel.setForeground(new java.awt.Color(102, 102, 102));
        gCountryLabel.setText("Country:");

        gNatLabel.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        gNatLabel.setForeground(new java.awt.Color(102, 102, 102));
        gNatLabel.setText("Nationality:");

        gCellLabel.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        gCellLabel.setForeground(new java.awt.Color(102, 102, 102));
        gCellLabel.setText("Cellular Phone Number:");

        gHomePhoneLabel.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        gHomePhoneLabel.setForeground(new java.awt.Color(102, 102, 102));
        gHomePhoneLabel.setText("Home Phone Number:");

        gEmailLab.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        gEmailLab.setForeground(new java.awt.Color(102, 102, 102));
        gEmailLab.setText("Email address:");

        gAddLabel.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        gAddLabel.setForeground(new java.awt.Color(102, 102, 102));
        gAddLabel.setText("Address:");

        gBdateLab.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        gBdateLab.setForeground(new java.awt.Color(102, 102, 102));
        gBdateLab.setText("Birth date:");

        gGenderLabel.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        gGenderLabel.setForeground(new java.awt.Color(102, 102, 102));
        gGenderLabel.setText("Gender:");

        jTxtSsn.setBackground(new java.awt.Color(255, 102, 51));
        jTxtSsn.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        jTxtSsn.setForeground(new java.awt.Color(255, 255, 255));

        jTxtLname.setBackground(new java.awt.Color(255, 102, 51));
        jTxtLname.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        jTxtLname.setForeground(new java.awt.Color(255, 255, 255));

        jTxtCity.setBackground(new java.awt.Color(255, 102, 51));
        jTxtCity.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        jTxtCity.setForeground(new java.awt.Color(255, 255, 255));

        jTxtCountry.setBackground(new java.awt.Color(255, 102, 51));
        jTxtCountry.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        jTxtCountry.setForeground(new java.awt.Color(255, 255, 255));

        jTxtNationality.setBackground(new java.awt.Color(255, 102, 51));
        jTxtNationality.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        jTxtNationality.setForeground(new java.awt.Color(255, 255, 255));

        jTxtAdd.setBackground(new java.awt.Color(255, 102, 51));
        jTxtAdd.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        jTxtAdd.setForeground(new java.awt.Color(255, 255, 255));

        jTxtCellPhone.setBackground(new java.awt.Color(255, 102, 51));
        jTxtCellPhone.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        jTxtCellPhone.setForeground(new java.awt.Color(255, 255, 255));

        jTxtHomePhone.setBackground(new java.awt.Color(255, 102, 51));
        jTxtHomePhone.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        jTxtHomePhone.setForeground(new java.awt.Color(255, 255, 255));

        jTxtEmail.setBackground(new java.awt.Color(255, 102, 51));
        jTxtEmail.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        jTxtEmail.setForeground(new java.awt.Color(255, 255, 255));

        jTxtZipCode.setBackground(new java.awt.Color(255, 102, 51));
        jTxtZipCode.setFont(new java.awt.Font("Simplified Arabic", 0, 14)); // NOI18N
        jTxtZipCode.setForeground(new java.awt.Color(255, 255, 255));

        jTxtBDate.setBackground(new java.awt.Color(255, 102, 51));
        jTxtBDate.setDateFormatString("dd/MM/yyyy");

        combBxGGender.setBackground(new java.awt.Color(255, 102, 51));
        combBxGGender.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        combBxGGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        combBxGGender.setSelectedIndex(-1);
        combBxGGender.setSelectedItem("Male");

        confirmBtnGuest.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        confirmBtnGuest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImages/Confirm.png"))); // NOI18N
        confirmBtnGuest.setText("Confirm and continue");
        confirmBtnGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnGuestActionPerformed(evt);
            }
        });

        clrGuestinfo.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        clrGuestinfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImages/Clear_Fields.png"))); // NOI18N
        clrGuestinfo.setText("Clear all fields");
        clrGuestinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrGuestinfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout guestPanelLayout = new javax.swing.GroupLayout(guestPanel);
        guestPanel.setLayout(guestPanelLayout);
        guestPanelLayout.setHorizontalGroup(
            guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guestPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(guestPanelLayout.createSequentialGroup()
                        .addGroup(guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(gLNLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gFNLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SSNGuest1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gCountryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gCityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gNatLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                            .addComponent(gAddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(183, 183, 183)
                        .addGroup(guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gCellLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gBdateLab, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gEmailLab, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gHomePhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gGenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                        .addGroup(guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTxtCellPhone)
                                .addComponent(jTxtBDate, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(jTxtEmail))
                            .addComponent(jTxtHomePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combBxGGender, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guestPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(clrGuestinfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirmBtnGuest)
                        .addGap(352, 352, 352))))
        );
        guestPanelLayout.setVerticalGroup(
            guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guestPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(gTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gBdateLab, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtBDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(guestPanelLayout.createSequentialGroup()
                        .addGroup(guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(guestPanelLayout.createSequentialGroup()
                                .addGroup(guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SSNGuest1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(gFNLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gLNLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(guestPanelLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTxtCellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gCellLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(guestPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(gEmailLab, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(gHomePhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtHomePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(guestPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(gCityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(gCountryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gNatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(guestPanelLayout.createSequentialGroup()
                        .addGroup(guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combBxGGender, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gGenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(guestPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gAddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46)
                .addGroup(guestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmBtnGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clrGuestinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        AdminPanel.setBackground(new java.awt.Color(110, 198, 255));

        AdminLogniPanel.setBackground(new java.awt.Color(110, 198, 255));

        adminStmt.setBackground(new java.awt.Color(110, 198, 255));
        adminStmt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adminStmt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminStmt.setText("Login as admin and manage");

        adminTitle.setBackground(new java.awt.Color(110, 198, 255));
        adminTitle.setFont(new java.awt.Font("Lucida Fax", 1, 26)); // NOI18N
        adminTitle.setForeground(new java.awt.Color(51, 51, 51));
        adminTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImages/LockIcon.png"))); // NOI18N
        adminTitle.setText("Administrator login");

        userName.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        userName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImages/Username.png"))); // NOI18N
        userName.setText("User name (admin):");
        userName.setToolTipText("User name as in DataBase");

        password.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        password.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImages/Password.png"))); // NOI18N
        password.setText("Password:");
        password.setToolTipText("Password as in DataBase");

        userNameTxtFld.setBackground(new java.awt.Color(255, 102, 51));
        userNameTxtFld.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userNameTxtFld.setForeground(new java.awt.Color(255, 255, 255));
        userNameTxtFld.setFocusTraversalPolicyProvider(true);

        passwordTxtFld.setBackground(new java.awt.Color(255, 102, 51));
        passwordTxtFld.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordTxtFld.setForeground(new java.awt.Color(255, 255, 255));

        loginBtn.setBackground(new java.awt.Color(255, 102, 51));
        loginBtn.setFont(new java.awt.Font("Levenim MT", 0, 11)); // NOI18N
        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImages/Login.png"))); // NOI18N
        loginBtn.setText("Login");
        loginBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.darkGray));
        loginBtn.setBorderPainted(false);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AdminLogniPanelLayout = new javax.swing.GroupLayout(AdminLogniPanel);
        AdminLogniPanel.setLayout(AdminLogniPanelLayout);
        AdminLogniPanelLayout.setHorizontalGroup(
            AdminLogniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLogniPanelLayout.createSequentialGroup()
                .addGroup(AdminLogniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 1101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AdminLogniPanelLayout.createSequentialGroup()
                        .addGap(442, 442, 442)
                        .addComponent(adminStmt))
                    .addGroup(AdminLogniPanelLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addGroup(AdminLogniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AdminLogniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userNameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminLogniPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(483, 483, 483))
        );
        AdminLogniPanelLayout.setVerticalGroup(
            AdminLogniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLogniPanelLayout.createSequentialGroup()
                .addComponent(adminTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminStmt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(AdminLogniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(AdminLogniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(loginBtn)
                .addContainerGap(335, Short.MAX_VALUE))
        );

        loginBtn.getAccessibleContext().setAccessibleDescription("");
        loginBtn.getAccessibleContext().setAccessibleParent(AdminLogniPanel);

        javax.swing.GroupLayout AdminPanelLayout = new javax.swing.GroupLayout(AdminPanel);
        AdminPanel.setLayout(AdminPanelLayout);
        AdminPanelLayout.setHorizontalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addComponent(AdminLogniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1082, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AdminPanelLayout.setVerticalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminLogniPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        HomePanel.setBackground(new java.awt.Color(110, 198, 255));
        HomePanel.setAutoscrolls(true);

        VelvetHotel.setBackground(new java.awt.Color(51, 51, 255));

        blueVelvetHotel.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        blueVelvetHotel.setForeground(new java.awt.Color(255, 255, 255));
        blueVelvetHotel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blueVelvetHotel.setText("Blue Velvet Hotel");

        greeting.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        greeting.setForeground(new java.awt.Color(204, 204, 204));
        greeting.setText("We're Looking Forward To Having You As Our Guests");

        javax.swing.GroupLayout VelvetHotelLayout = new javax.swing.GroupLayout(VelvetHotel);
        VelvetHotel.setLayout(VelvetHotelLayout);
        VelvetHotelLayout.setHorizontalGroup(
            VelvetHotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VelvetHotelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VelvetHotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blueVelvetHotel)
                    .addComponent(greeting))
                .addGap(175, 175, 175))
        );
        VelvetHotelLayout.setVerticalGroup(
            VelvetHotelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VelvetHotelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(blueVelvetHotel)
                .addGap(40, 40, 40)
                .addComponent(greeting)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(VelvetHotelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        hotelimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addComponent(hotelimg, javax.swing.GroupLayout.DEFAULT_SIZE, 1091, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(VelvetHotel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(VelvetHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hotelimg, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        catalogPanel.setBackground(new java.awt.Color(110, 198, 255));

        titleCatalog.setBackground(new java.awt.Color(0, 153, 255));

        title.setFont(new java.awt.Font("Palatino Linotype", 2, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 102, 102));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Catalog of rooms section");

        insertTitle.setBackground(new java.awt.Color(255, 255, 255));
        insertTitle.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        insertTitle.setForeground(new java.awt.Color(255, 102, 102));
        insertTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        insertTitle.setText("Insert new room");

        floor.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        floor.setForeground(new java.awt.Color(255, 255, 255));
        floor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        floor.setText("Floor:");

        desc.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        desc.setForeground(new java.awt.Color(255, 255, 255));
        desc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        desc.setText("Additional description:");

        type.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        type.setForeground(new java.awt.Color(255, 255, 255));
        type.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        type.setText("Room type:");

        price.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 255));
        price.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        price.setText("Price (per night):");

        State.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        State.setForeground(new java.awt.Color(255, 255, 255));
        State.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        State.setText("Status:");

        starLabel.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        starLabel.setForeground(new java.awt.Color(255, 255, 255));
        starLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        starLabel.setText("Star:");

        floorTxtFld.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N

        descTxtFld.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N

        priceTxtFld.setToolTipText("The price of the room per night");

        star.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        star.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        star.setToolTipText("Degree of the room");

        status.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Working ON", "Ready" }));
        status.setToolTipText("The current state of the room");

        OKcatalogBtn.setBackground(new java.awt.Color(51, 255, 255));
        OKcatalogBtn.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        OKcatalogBtn.setForeground(new java.awt.Color(102, 102, 102));
        OKcatalogBtn.setText("Confirm and register the room");
        OKcatalogBtn.setToolTipText("Add the room to data base");
        OKcatalogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKcatalogBtnActionPerformed(evt);
            }
        });

        clrBtnRooms.setBackground(new java.awt.Color(51, 255, 255));
        clrBtnRooms.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        clrBtnRooms.setForeground(new java.awt.Color(102, 102, 102));
        clrBtnRooms.setText("Clear all fields");
        clrBtnRooms.setToolTipText("Add the room to data base");
        clrBtnRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrBtnRoomsActionPerformed(evt);
            }
        });

        roomTypeCmbBox.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        roomTypeCmbBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single", "Twin" }));
        roomTypeCmbBox.setToolTipText("Degree of the room");

        javax.swing.GroupLayout titleCatalogLayout = new javax.swing.GroupLayout(titleCatalog);
        titleCatalog.setLayout(titleCatalogLayout);
        titleCatalogLayout.setHorizontalGroup(
            titleCatalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleCatalogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titleCatalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(insertTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleCatalogLayout.createSequentialGroup()
                        .addGroup(titleCatalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(titleCatalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(titleCatalogLayout.createSequentialGroup()
                                    .addComponent(floor, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)
                                    .addComponent(floorTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, titleCatalogLayout.createSequentialGroup()
                                    .addGroup(titleCatalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(price))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(titleCatalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(priceTxtFld)
                                        .addComponent(descTxtFld))))
                            .addGroup(titleCatalogLayout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(OKcatalogBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                        .addGroup(titleCatalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(titleCatalogLayout.createSequentialGroup()
                                .addGroup(titleCatalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(starLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(State, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(titleCatalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(star, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(clrBtnRooms, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                            .addGroup(titleCatalogLayout.createSequentialGroup()
                                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(roomTypeCmbBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(107, 107, 107)))
                .addContainerGap())
        );
        titleCatalogLayout.setVerticalGroup(
            titleCatalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleCatalogLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertTitle)
                .addGap(25, 25, 25)
                .addGroup(titleCatalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(titleCatalogLayout.createSequentialGroup()
                        .addGroup(titleCatalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(floor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(floorTxtFld))
                        .addGap(128, 128, 128)
                        .addGroup(titleCatalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomTypeCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76))
                    .addGroup(titleCatalogLayout.createSequentialGroup()
                        .addGroup(titleCatalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(State)
                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(titleCatalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(titleCatalogLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(titleCatalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(starLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(star, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(94, 94, 94))
                            .addGroup(titleCatalogLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(titleCatalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(priceTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(titleCatalogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clrBtnRooms)
                            .addComponent(OKcatalogBtn))
                        .addGap(27, 27, 27))))
        );

        search.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search for availables rooms:");

        searchBtn.setBackground(new java.awt.Color(102, 102, 255));
        searchBtn.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImages/Search.png"))); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        refreshCatalog.setBackground(new java.awt.Color(102, 102, 255));
        refreshCatalog.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refreshCatalog.setForeground(new java.awt.Color(255, 255, 255));
        refreshCatalog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImages/Refresh.png"))); // NOI18N
        refreshCatalog.setText("Refresh table");
        refreshCatalog.setToolTipText("Refresh the data in this table");
        refreshCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshCatalogActionPerformed(evt);
            }
        });

        roomsAvailable.setColumns(20);
        roomsAvailable.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        roomsAvailable.setForeground(new java.awt.Color(51, 51, 51));
        roomsAvailable.setRows(5);
        jScrollPane1.setViewportView(roomsAvailable);

        chooseSearch.setFont(new java.awt.Font("Trebuchet MS", 2, 16)); // NOI18N
        chooseSearch.setForeground(new java.awt.Color(51, 51, 51));
        chooseSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Available rooms", "Star" }));
        chooseSearch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chooseSearchItemStateChanged(evt);
            }
        });

        searchTxtFld.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        searchTxtFld.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout catalogPanelLayout = new javax.swing.GroupLayout(catalogPanel);
        catalogPanel.setLayout(catalogPanelLayout);
        catalogPanelLayout.setHorizontalGroup(
            catalogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleCatalog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(catalogPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(catalogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(catalogPanelLayout.createSequentialGroup()
                        .addComponent(refreshCatalog)
                        .addGap(202, 202, 202)
                        .addComponent(search)
                        .addGap(18, 18, 18)
                        .addComponent(chooseSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTxtFld)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        catalogPanelLayout.setVerticalGroup(
            catalogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catalogPanelLayout.createSequentialGroup()
                .addComponent(titleCatalog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(catalogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(catalogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(refreshCatalog)
                        .addComponent(chooseSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(searchTxtFld)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        AdminPaneAfterLogIn.setBackground(new java.awt.Color(110, 198, 255));
        AdminPaneAfterLogIn.setDoubleBuffered(false);

        jTableAllResrAgent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ssn", "Reservagent id ", "Salary", "Section "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTableAllResrAgent);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel1.setText("Administrator Interface : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("All reservagent agents:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Add or update a reservagent agent :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("ssn:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("First name:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Last name:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("City: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("County: ");

        gNatLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gNatLabel1.setText("Nationality:");

        gNatLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gNatLabel2.setText("Address");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Birth date");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Cellular Phone Number:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Email address");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Home Phone Number:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Gender");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Salary");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Section");

        combBxGGenderForRes.setBackground(new java.awt.Color(255, 102, 51));
        combBxGGenderForRes.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        combBxGGenderForRes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        combBxGGenderForRes.setSelectedItem("Male");

        jBtnAddNewReservagevt.setText("Add a new reservagent ");
        jBtnAddNewReservagevt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddNewReservagevtActionPerformed(evt);
            }
        });

        jBtnUpdateReseevagent.setText("Update selected reservagent");
        jBtnUpdateReseevagent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUpdateReseevagentActionPerformed(evt);
            }
        });

        jBtnDeleteReservagent.setText("Delete selected reservagent");
        jBtnDeleteReservagent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDeleteReservagentActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Zip code");

        jBtnFillDataIntoFieldes.setText("Fill selected row into fieldes to Update");
        jBtnFillDataIntoFieldes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFillDataIntoFieldesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AdminPaneAfterLogInLayout = new javax.swing.GroupLayout(AdminPaneAfterLogIn);
        AdminPaneAfterLogIn.setLayout(AdminPaneAfterLogInLayout);
        AdminPaneAfterLogInLayout.setHorizontalGroup(
            AdminPaneAfterLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPaneAfterLogInLayout.createSequentialGroup()
                .addGroup(AdminPaneAfterLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminPaneAfterLogInLayout.createSequentialGroup()
                        .addGroup(AdminPaneAfterLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AdminPaneAfterLogInLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(AdminPaneAfterLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(AdminPaneAfterLogInLayout.createSequentialGroup()
                                        .addComponent(gNatLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTxtAddressForRes, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(AdminPaneAfterLogInLayout.createSequentialGroup()
                                        .addComponent(gNatLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTxtNationalityForRes, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(AdminPaneAfterLogInLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTxtCityForRes, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(AdminPaneAfterLogInLayout.createSequentialGroup()
                                        .addGroup(AdminPaneAfterLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(AdminPaneAfterLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTxtCountyForRes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTxtLNameForRes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPaneAfterLogInLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTxtFNameForRes, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPaneAfterLogInLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(112, 112, 112)
                                        .addComponent(jTxtSsnForRes, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 411, Short.MAX_VALUE)
                                .addGroup(AdminPaneAfterLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(AdminPaneAfterLogInLayout.createSequentialGroup()
                                .addGroup(AdminPaneAfterLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AdminPaneAfterLogInLayout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(AdminPaneAfterLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(AdminPaneAfterLogInLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AdminPaneAfterLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtCellualrForRes, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(jDateBirthDateForRese, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTxtEmailForRes, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(jTxtHomePhoneForRes, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(jTxtSalaryForRes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(jTxtSectionForRes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(combBxGGenderForRes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTxtZepCodeForRes, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPaneAfterLogInLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnAddNewReservagevt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnUpdateReseevagent, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnDeleteReservagent, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(261, 261, 261)))
                .addGap(74, 74, 74))
            .addGroup(AdminPaneAfterLogInLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(AdminPaneAfterLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnFillDataIntoFieldes, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AdminPaneAfterLogInLayout.setVerticalGroup(
            AdminPaneAfterLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPaneAfterLogInLayout.createSequentialGroup()
                .addGap(18, 74, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnFillDataIntoFieldes)
                .addGap(30, 30, 30)
                .addGroup(AdminPaneAfterLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPaneAfterLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTxtFNameForRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jTxtCellualrForRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPaneAfterLogInLayout.createSequentialGroup()
                        .addGroup(AdminPaneAfterLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateBirthDateForRese, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPaneAfterLogInLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(AdminPaneAfterLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AdminPaneAfterLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTxtSsnForRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPaneAfterLogInLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(3, 3, 3)))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addGap(21, 21, 21)
                .addGroup(AdminPaneAfterLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTxtLNameForRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTxtEmailForRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AdminPaneAfterLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtCityForRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AdminPaneAfterLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel12)
                        .addComponent(jTxtHomePhoneForRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(AdminPaneAfterLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTxtCountyForRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(combBxGGenderForRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AdminPaneAfterLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gNatLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtNationalityForRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jTxtSalaryForRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AdminPaneAfterLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gNatLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtAddressForRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jTxtSectionForRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AdminPaneAfterLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTxtZepCodeForRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(AdminPaneAfterLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnDeleteReservagent)
                    .addComponent(jBtnUpdateReseevagent)
                    .addComponent(jBtnAddNewReservagevt))
                .addContainerGap(366, Short.MAX_VALUE))
        );

        ScrollPaneAdminPaneAfterLogIn.setViewportView(AdminPaneAfterLogIn);

        javax.swing.GroupLayout layeredPanelLayout = new javax.swing.GroupLayout(layeredPanel);
        layeredPanel.setLayout(layeredPanelLayout);
        layeredPanelLayout.setHorizontalGroup(
            layeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1101, Short.MAX_VALUE)
            .addGroup(layeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(HomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(catalogPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(guestPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(paymentsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bookingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ScrollPaneAdminPaneAfterLogIn, javax.swing.GroupLayout.Alignment.TRAILING))
        );
        layeredPanelLayout.setVerticalGroup(
            layeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
            .addGroup(layeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPanelLayout.createSequentialGroup()
                    .addComponent(AdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 169, Short.MAX_VALUE)))
            .addGroup(layeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPanelLayout.createSequentialGroup()
                    .addComponent(HomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 21, Short.MAX_VALUE)))
            .addGroup(layeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPanelLayout.createSequentialGroup()
                    .addComponent(catalogPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 154, Short.MAX_VALUE)))
            .addGroup(layeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPanelLayout.createSequentialGroup()
                    .addComponent(guestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 165, Short.MAX_VALUE)))
            .addGroup(layeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPanelLayout.createSequentialGroup()
                    .addComponent(paymentsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 173, Short.MAX_VALUE)))
            .addGroup(layeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPanelLayout.createSequentialGroup()
                    .addComponent(bookingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 169, Short.MAX_VALUE)))
            .addGroup(layeredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layeredPanelLayout.createSequentialGroup()
                    .addComponent(ScrollPaneAdminPaneAfterLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 169, Short.MAX_VALUE)))
        );
        layeredPanel.setLayer(bookingPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPanel.setLayer(paymentsPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPanel.setLayer(guestPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPanel.setLayer(AdminPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPanel.setLayer(HomePanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPanel.setLayer(catalogPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPanel.setLayer(ScrollPaneAdminPaneAfterLogIn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(Sign, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(914, 914, 914)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
            .addComponent(layeredPanel, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(exit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sign, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(layeredPanel))
        );

        javax.swing.GroupLayout BackGroundPanelLayout = new javax.swing.GroupLayout(BackGroundPanel);
        BackGroundPanel.setLayout(BackGroundPanelLayout);
        BackGroundPanelLayout.setHorizontalGroup(
            BackGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundPanelLayout.createSequentialGroup()
                .addComponent(SidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackGroundPanelLayout.setVerticalGroup(
            BackGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundPanelLayout.createSequentialGroup()
                .addComponent(SidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1385, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 943, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
            em.close();
            emf.close();
            conn = null;
            ods = null;
            System.gc();
            System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        
        try{
                ScrollPaneAdminPaneAfterLogIn.setVisible(true);
                String userName = this.userNameTxtFld.getText();
                char [] password = this.passwordTxtFld.getPassword();
                String pass = new String(password);
                if ((userName.equals("Ashraf")||userName.equals("Yazan")) && pass.equals("123456")){
                   setAdminPanelVisible();
                   setAllReservgentInTable();
                   this.userNameTxtFld.setText("");
                   this.passwordTxtFld.setText("");
                }
                else 
                    JOptionPane.showMessageDialog(null, "Invalid USERNAME or PASSWORD!", "Incorrect Information!", ERROR_MESSAGE);
        
            } catch(NullPointerException ex){
                JOptionPane.showMessageDialog(null, "Please enter valid password", "Invalid password", JOptionPane.ERROR_MESSAGE);
            } catch(Exception ex){
                this.userNameTxtFld.setText("Invalid info.");
            }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void homePageSideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePageSideMouseClicked
        setOnlyHomePagePaneVisible();
    }//GEN-LAST:event_homePageSideMouseClicked

    private void adminPanelSideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminPanelSideMouseClicked
        setOnlyAdminPaneVisible();
    }//GEN-LAST:event_adminPanelSideMouseClicked

    private void HomeLabelSideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLabelSideMouseClicked
        setOnlyHomePagePaneVisible();
    }//GEN-LAST:event_HomeLabelSideMouseClicked

    private void adminLabelSideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLabelSideMouseClicked
        setOnlyAdminPaneVisible();
    }//GEN-LAST:event_adminLabelSideMouseClicked

    private void adminIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminIconMouseClicked
        setOnlyAdminPaneVisible();
    }//GEN-LAST:event_adminIconMouseClicked

    private void homeMouseCliked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseCliked
        setOnlyHomePagePaneVisible();
    }//GEN-LAST:event_homeMouseCliked

    private void catalogLabelMouseCliked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catalogLabelMouseCliked
        setOnlyCatalogPaneVisible();
    }//GEN-LAST:event_catalogLabelMouseCliked

    private void iconCatalogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconCatalogMouseClicked
        setOnlyCatalogPaneVisible();
    }//GEN-LAST:event_iconCatalogMouseClicked

    private void catalogPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catalogPanelMouseClicked
        setOnlyCatalogPaneVisible();
    }//GEN-LAST:event_catalogPanelMouseClicked

    private void OKcatalogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKcatalogBtnActionPerformed
            try {
                room = new Catalogeofroom();
                short floor = Short.parseShort(this.floorTxtFld.getText());
                String roomType = (String) this.roomTypeCmbBox.getSelectedItem();
                String desc = descTxtFld.getText();
                String roomStatus = (String) status.getSelectedItem();
                short Star = Short.parseShort((String) star.getSelectedItem());
                BigInteger price =  BigInteger.valueOf(Long.parseLong(this.priceTxtFld.getText()));
                room.setDscr(desc);
                room.setFloor(floor);
                try {
                    room.setPricepernight(price);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please set the price as number correctly.");
                }
                room.setRoomstar(Star);
                room.setRoomstatus(roomStatus);
                room.setRoomtype(roomType);
                em.getTransaction().begin();
                em.persist(room);
                em.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "The room has inserted successfully! ☺");
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Incorrect information has been inserted", "Invalid information inserted", ERROR_MESSAGE);
            }
    }//GEN-LAST:event_OKcatalogBtnActionPerformed

    private void guestLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guestLabelMouseClicked
        this.setGuestPanelShown();
    }//GEN-LAST:event_guestLabelMouseClicked

    private void guestIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guestIconMouseClicked
        this.setGuestPanelShown();
    }//GEN-LAST:event_guestIconMouseClicked

    private void guestPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guestPanelMouseClicked
        this.setGuestPanelShown();
    }//GEN-LAST:event_guestPanelMouseClicked

    private void paymentsPanelSideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentsPanelSideMouseClicked
            this.setPaymentsPanelShown();
    }//GEN-LAST:event_paymentsPanelSideMouseClicked

    private void paymentIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentIconMouseClicked
            this.setPaymentsPanelShown();
    }//GEN-LAST:event_paymentIconMouseClicked

    private void paymentsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentsLabelMouseClicked
            this.setPaymentsPanelShown();
    }//GEN-LAST:event_paymentsLabelMouseClicked

    private void bookingTableSideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingTableSideMouseClicked
            this.setBookingPanelShown();
    }//GEN-LAST:event_bookingTableSideMouseClicked

    private void bookingLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingLabelMouseClicked
            this.setBookingPanelShown();
    }//GEN-LAST:event_bookingLabelMouseClicked

    private void bookingIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingIconMouseClicked
            this.setBookingPanelShown();
    }//GEN-LAST:event_bookingIconMouseClicked

    private void refreshCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshCatalogActionPerformed
            try {
            Query q = em.createNamedQuery("Catalogeofroom.findAll");
            List <Catalogeofroom> allRooms = q.getResultList();
            this.roomsAvailable.setText("Room ID\tFloor\tRoom Type\tRoom Status\tStar\tPrice Per Night\tAdditional Description\n");
            this.roomsAvailable.append("----------------------------------------------------------------------------------------------------------------------------------------\n");
            for(Catalogeofroom room : allRooms)
                this.roomsAvailable.append(room.getRoomid() + "\t" + room.getFloor() + "\t"  + room.getRoomtype()
                + "\t" + room.getRoomstatus() + "\t" + room.getRoomstar() + "\t" + room.getPricepernight() + "\t"
                + room.getDscr() + "\n");
            JOptionPane.showMessageDialog(null, "Table refreshed, The catalog is ready, all rooms are here.");
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid process, make sure that the table of rooms is not empty.");
            }
    }//GEN-LAST:event_refreshCatalogActionPerformed

    private void confirmBtnGuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnGuestActionPerformed
        
        try{
                String fName = this.jTxtFname.getText();
                String lName = this.jTxtLname.getText();
                if (fName.equals("") || lName.equals("")){
                    JOptionPane.showMessageDialog(rootPane, "Please enter correct name", "Invalid name", JOptionPane.ERROR_MESSAGE);
                    throw new Exception();
                }
            
                person = new Person();
                g = new Guest();
                person.setFname(fName);
                person.setLname(lName);
            
                try{
                    person.setSsn(Long.parseLong(this.jTxtSsn.getText()));
                } catch(Exception ex){
                    JOptionPane.showMessageDialog(rootPane, "Please set the value of 'SSN' correctly.", "Invalid ssn", JOptionPane.ERROR_MESSAGE);
                    return ;
                }
            
                person.setCity(this.jTxtCity.getText());
                person.setCountry(this.jTxtCountry.getText());
                person.setNationality(this.jTxtNationality.getText());
                person.setAddress(this.jTxtAdd.getText());          
                person.setBdate(jTxtBDate.getDate());
                
                
                try {
                    person.setCellularphonenum(BigInteger.valueOf(Long.parseLong(this.jTxtCellPhone.getText())));
                } catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(rootPane, "Please enter correct cellular phone number", "Invalid call phone", JOptionPane.ERROR_MESSAGE);
                    return ; 
                } 
                try{
                    person.setHomephonenum(BigInteger.valueOf(Long.parseLong(this.jTxtHomePhone.getText())));
                } catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(rootPane, "Please enter correct home phone number", "Invalid home phone", JOptionPane.ERROR_MESSAGE);
                    return ; 
                }
                person.setEmailadd(this.jTxtEmail.getText());
                String gender = (String) this.combBxGGender.getSelectedItem();
                if(gender.equals("Male"))
                    person.setGender("M");
                else person.setGender("F");
                
                // Persist objects
                g.setSsn(person);
                em.getTransaction().begin();
                em.persist(person);
                em.persist(g);
                em.getTransaction().commit();
                JOptionPane.showMessageDialog(null, "New guest has been inserted successfully! ☺");
                this.guestPanel.setVisible(false);
                this.resetColor(this.guestPanelSide);
                this.catalogPanel.setVisible(true);
                this.setColor(this.roomsPanelSide);
          } catch(Exception ex){
            
        }
        
        
    }//GEN-LAST:event_confirmBtnGuestActionPerformed

    private void clrBtnRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrBtnRoomsActionPerformed
            this.floorTxtFld.setText("");
            this.descTxtFld.setText("");
            this.priceTxtFld.setText("");
    }//GEN-LAST:event_clrBtnRoomsActionPerformed

    private void clrGuestinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrGuestinfoActionPerformed
            this.jTxtSsn.setText("");
            this.jTxtAdd.setText("");
            this.jTxtFname.setText("");
            this.jTxtLname.setText("");
            this.jTxtCity.setText("");
            this.jTxtCountry.setText("");
            this.jTxtNationality.setText("");
            this.jTxtAdd.setText("");
            this.jTxtCellPhone.setText("");
            this.jTxtEmail.setText("");
            this.jTxtHomePhone.setText("");
            this.discount.setSelectedItem("Male");
            this.jTxtZipCode.setText("");
    }//GEN-LAST:event_clrGuestinfoActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
            try {
                String roomID = this.room_idBooking.getText();
                boolean can = true;
                //String resID = this.resAgtID_Pyts.getText();
                //System.out.println("done 1");
                java.util.Date dFrom = this.dateFrom.getDate();
                java.util.Date dTo = this.dateTo.getDate();
                //System.out.println("done 2");
                Bookingtable bt = new Bookingtable();
                bt.setDatefrom(dFrom);
                bt.setDateto(dTo);
                Query q1 = em.createNamedQuery("Catalogeofroom.findByRoomid").setParameter("roomid", BigDecimal.valueOf(Long.parseLong(roomID)));
                List <Catalogeofroom> all = q1.getResultList();
                for(Catalogeofroom o: all) {

                    if( !o.getRoomstatus().equals("Working ON") ) {
                        if( o.getRoomstatus().equals("Ready") && o.getRoomtype().equals("Single") ) {
                            o.setRoomstatus("Reserved");
                            bt.setRoomid(o);
                        }
                        else if( o.getRoomstatus().equals("Ready") && o.getRoomtype().equals("Twin") ) {
                            o.setRoomstatus("Res.Once");
                            bt.setRoomid(o);
                        }
                        else if( o.getRoomstatus().equals("Res.Once") && o.getRoomtype().equals("Twin") ) {
                            o.setRoomstatus("Full");
                            bt.setRoomid(o);
                        }
                    } else if( o.getRoomstatus().equals("Full") || o.getRoomstatus().equals("Reserved") ) {
                            can = false;
                    }

                }
                
                //System.out.println("done 3");
                bt.setGuestid(g);
                
                    
                BigDecimal selectedID  = (BigDecimal) this.combBxReservagent.getSelectedItem();
                
                
                List<Reservationagent> RsvAgtList= em.createNamedQuery("Reservationagent.findByReservationagentid")
                        .setParameter("reservationagentid", selectedID).getResultList();
                Reservationagent RsvAgt = RsvAgtList.get(0);
                if(can) {
                    bt.setBookingstatus(BigInteger.ONE);
                    em.getTransaction().begin();
                    // em.persist(p);
                    //em.persist(RsvAgt);
                    em.persist(bt);
                    em.getTransaction().commit();
                //System.out.println("done 6");

                JOptionPane.showMessageDialog(null, "The booking has been added successfully ☺");
                //System.out.println("done 7");
                addToJTable(bt, g, roomID, dFrom, dTo);
                //System.out.println("done 8");
                // Inserting the data to table (BookingBy)
                Bookingby bb = new Bookingby();
                bb.setRid(RsvAgt);
                bb.setBid(bt.getBookingid());
                em.getTransaction().begin(); 
                em.persist(bb);
                em.getTransaction().commit();
                }
                //System.out.println("done new table");
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, "You have chosen the wrong room: the room is full reserved!", "Process failed!", ERROR_MESSAGE);
            }
    }//GEN-LAST:event_registerActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
            if(this.chooseSearch.getSelectedIndex() == 0)
            try {
                Query q = em.createNamedQuery("Catalogeofroom.findByRoomstatus").setParameter("roomstatus", "Ready");
                List <Catalogeofroom> allRooms = q.getResultList();
                this.roomsAvailable.setText("Room ID\tFloor\tRoom Type\tRoom Status\tStar\tPrice Per Night\tAdditional Description\n");
                this.roomsAvailable.append("----------------------------------------------------------------------------------------------------------------------------------------\n");
                    for(Catalogeofroom room : allRooms)
                this.roomsAvailable.append(room.getRoomid() + "\t" + room.getFloor() + "\t"  + room.getRoomtype()
                + "\t" + room.getRoomstatus() + "\t" + room.getRoomstar() + "\t" + room.getPricepernight() + "\t"
                + room.getDscr() + "\n");
            JOptionPane.showMessageDialog(null, "All rooms available are here, you can choose.");
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid process ! make sure that the rooms table is not empty.");
            }
            
            // Main if statement
            else {
                if(this.chooseSearch.getSelectedIndex() == 1) {
                    Query q = em.createNamedQuery("Catalogeofroom.findByRoomstar")
                            .setParameter("roomstar", Short.parseShort( this.searchTxtFld.getText() ) );
                    List <Catalogeofroom> allRooms = q.getResultList();
                    this.roomsAvailable.setText("Room ID\tFloor\tRoom Type\tRoom Status\tStar\tPrice Per Night\tAdditional Description\n");
                    this.roomsAvailable.append("----------------------------------------------------------------------------------------------------------------------------------------\n");
                    for(Catalogeofroom room : allRooms)
                    this.roomsAvailable.append(room.getRoomid() + "\t" + room.getFloor() + "\t"  + room.getRoomtype()
                    + "\t" + room.getRoomstatus() + "\t" + room.getRoomstar() + "\t" + room.getPricepernight() + "\t"
                    + room.getDscr() + "\n");
                    JOptionPane.showMessageDialog(null, "The process completed by 'star', all rooms available are here, you can choose.");
                }
            }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void chooseSearchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chooseSearchItemStateChanged
            if( (evt.getStateChange() == ItemEvent.SELECTED) && (this.chooseSearch.getSelectedIndex() == 0) ) {
                this.searchTxtFld.setEnabled(false);
                this.searchTxtFld.setEditable(false);
            } else {
                this.searchTxtFld.setEnabled(true);
                this.searchTxtFld.setEditable(true);
            }
    }//GEN-LAST:event_chooseSearchItemStateChanged

    private void jBtnAddNewReservagevtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddNewReservagevtActionPerformed
        // TODO add your handling code here:
        
        try { 
            Person person = new  Person();
            
            try{
                person.setSsn(Long.parseLong(this.jTxtSsnForRes.getText()));
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(rootPane, "Please make sure about ssn", "Invalid ssn", WARNING_MESSAGE);
            }
            
            person.setFname(this.jTxtFNameForRes.getText());
            person.setLname(this.jTxtLNameForRes.getText());
            person.setCity(this.jTxtCityForRes.getText());
            person.setCountry(this.jTxtCountyForRes.getText());
            person.setNationality(this.jTxtNationalityForRes.getText());
            person.setAddress(this.jTxtAddressForRes.getText());
            try{
                person.setBdate(this.jDateBirthDateForRese.getDate());
            }catch(Exception ex){
                JOptionPane.showMessageDialog(rootPane, "please make sure about Birth date", "Invalid Birth date", WARNING_MESSAGE);
            }
            
            try{
                person.setCellularphonenum(BigInteger.valueOf(Long.parseLong(this.jTxtCellualrForRes.getText())));
                person.setHomephonenum(BigInteger.valueOf(Long.parseLong(this.jTxtHomePhoneForRes.getText())));
            }catch(Exception ex){
                JOptionPane.showMessageDialog(rootPane, "Please make sure about phone number", "Invalid  phone number", WARNING_MESSAGE);
            }
            
            person.setEmailadd(this.jTxtEmailForRes.getText());
            person.setZipcode(BigInteger.valueOf(Long.parseLong(this.jTxtZepCodeForRes.getText())));
            
            if(this.combBxGGenderForRes.getSelectedIndex()==0)
                person.setGender("M");
            else person.setGender("F");
            
            Reservationagent reservagent = new Reservationagent();
            reservagent.setSalary(Short.parseShort(this.jTxtSalaryForRes.getText()));
            reservagent.setSection(this.jTxtSectionForRes.getText());
            reservagent.setSsn(person);
            
            em.getTransaction().begin();
            em.persist(person);
            em.persist(reservagent);
            em.getTransaction().commit();
            this.combBxReservagent.addItem(reservagent.getReservationagentid());
            JOptionPane.showMessageDialog(rootPane, "Added successfuly", "Add", INFORMATION_MESSAGE);
            this.setAllReservgentInTable();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString(), "Process failed!", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtnAddNewReservagevtActionPerformed

    private void jBtnUpdateReseevagentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpdateReseevagentActionPerformed
        // TODO add your handling code here:
        try {
        EntityManagerFactory eemf = Persistence.createEntityManagerFactory("JavaApplication10PU");
        EntityManager eem  = eemf.createEntityManager();
        Reservationagent reservagent = this.getResevagent();
        Person person = reservagent.getSsn();
        
        String section = this.jTxtSectionForRes.getText();
        short salary = Short.parseShort(this.jTxtSalaryForRes.getText());
        
        Long personSsn = Long.parseLong(this.jTxtSsnForRes.getText());
        String fistName = this.jTxtFNameForRes.getText();
        String lastName = this.jTxtLNameForRes.getText();
        String city = this.jTxtCityForRes.getText();
        String country = this.jTxtCountyForRes.getText();
        String nationality = this.jTxtNationalityForRes.getText();
        BigInteger cellPhonNumber = BigInteger.valueOf(Long.parseLong(this.jTxtCellualrForRes.getText()));
        BigInteger homePhone = BigInteger.valueOf(Long.parseLong(this.jTxtHomePhoneForRes.getText()));
        BigInteger zipCode = BigInteger.valueOf(Long.parseLong(this.jTxtZepCodeForRes.getText()));
        String email = this.jTxtEmailForRes.getText();
        String address = this.jTxtAddressForRes.getText();
        Date bdate = this.jDateBirthDateForRese.getDate();
        String gender;
        if (this.combBxGGenderForRes.getSelectedIndex()==0)
             gender = "M";
        else gender = "F";
        
        eem.getTransaction().begin();
        eem.createNamedQuery("Reservationagent.update").setParameter("section" ,section)
                .setParameter("salary", salary).setParameter("RESERVATIONAGENTID", reservagent.getReservationagentid()).executeUpdate();
        
        eem.createNamedQuery("Person.update").setParameter("SSN", personSsn).setParameter("FNAME", fistName)
                .setParameter("LNAME", lastName).setParameter("CITY", city).setParameter("COUNTRY", country)
                .setParameter("NATIONALITY",nationality).setParameter("CELLULARPHONENUM", cellPhonNumber)
                .setParameter("HOMEPHONENUM", homePhone).setParameter("ZIPCODE", zipCode).setParameter("GENDER", gender)
                .setParameter("EMAILADD", email).setParameter("ADDRESS", address).setParameter("BDATE", bdate)
                .setParameter("SSN", person.getSsn()).executeUpdate();
        eem.getTransaction().commit();
        eem.close();
        
        
                
        JOptionPane.showMessageDialog(rootPane, "Update on resrevagent who has Ssn="+String.valueOf(person.getSsn())+"done successfuly", "Updated", JOptionPane.INFORMATION_MESSAGE);
        this.setAllReservgentInTable();

        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.toString(), "Invalid prosses", WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jBtnUpdateReseevagentActionPerformed

    private void jBtnDeleteReservagentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDeleteReservagentActionPerformed
        // TODO add your handling code here:
        
        try { 
        EntityManagerFactory eemf = Persistence.createEntityManagerFactory("JavaApplication10PU");
        EntityManager eem  = eemf.createEntityManager();
        DefaultTableModel table = (DefaultTableModel)this.jTableAllResrAgent.getModel();
        int rowNumber = jTableAllResrAgent.getSelectedRow();
        Object reservagentId = table.getValueAt(rowNumber, 1);
        Object reservagebtSsn = table.getValueAt(rowNumber, 0);
        Query q = em.createNativeQuery("delete from bookingby where RID = " + reservagentId);
        Query update = em.createNativeQuery("update payments set resagentID = 1 where resagentid = " + reservagentId);
        em.getTransaction().begin();
        update.executeUpdate();
        q.executeUpdate();
        em.getTransaction().commit();
        eem.getTransaction().begin();
        eem.createNamedQuery("Reservationagent.delete")
                .setParameter("reservagentId", reservagentId).executeUpdate();
        eem.createNamedQuery("Person.delete")
                .setParameter("personSsn", reservagebtSsn).executeUpdate();
        
        jTableAllResrAgent.setVisible(true);
        eem.getTransaction().commit();
        eem.close();
        this.combBxReservagent.removeItem(reservagentId);
        JOptionPane.showMessageDialog(rootPane, "Deleted successfuly", "Delete", INFORMATION_MESSAGE);
        this.setAllReservgentInTable();
        }
        catch(Exception es){
            JOptionPane.showMessageDialog(rootPane, es.toString(), "Invalid prosses", ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_jBtnDeleteReservagentActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
            char [] pass = passFld.getPassword();
            String password = new String(pass);
            if(userTxt.getText().equals("hotel") && password.equals("123456")) {
                start.setVisible(false);
                MF.setVisible(true);
            } else
                JOptionPane.showMessageDialog(null, "Invalid user name or password", "Access denied", ERROR_MESSAGE);
    }//GEN-LAST:event_enterActionPerformed

    private void jTableBookingTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBookingTableMouseClicked
            int i = this.jTableBookingTable.getSelectedRow();
            dmt = (DefaultTableModel) this.jTableBookingTable.getModel();
            this.endBooking.setEnabled(true);
            this.tableBID = (BigDecimal) dmt.getValueAt(i, 0);
            this.tableGID = (BigDecimal) dmt.getValueAt(i, 2);
            this.tableRoomID = (BigDecimal) dmt.getValueAt(i, 3);
            this.tableFrom = (java.util.Date) dmt.getValueAt(i, 4);
            this.tableTo = (java.util.Date) dmt.getValueAt(i, 5);
            this.dateDiff = getDifference(tableFrom, tableTo);
            /*System.out.println(tableBID);
            System.out.println(tableGID);
            System.out.println(tableRoomID);
            System.out.println(dateDiff);*/
    }//GEN-LAST:event_jTableBookingTableMouseClicked

    private void endBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endBookingActionPerformed
            this.bookingPanel.setVisible(false);
            this.resetColor(this.bookingTableSide);
            this.paymentsPanel.setVisible(true);
            this.setColor(this.paymentsPanelSide);
            Query q = em.createNamedQuery("Catalogeofroom.findByRoomid").setParameter("roomid", tableRoomID);
            List <Catalogeofroom> allRooms = q.getResultList();
            BigInteger charge = BigInteger.ZERO;
            for(Catalogeofroom r: allRooms)
                charge = r.getPricepernight();
            total = charge.multiply(BigInteger.valueOf(dateDiff));
            saveTotal = total;
            this.totalChargeTxtFld.setText(total + "");
    }//GEN-LAST:event_endBookingActionPerformed

    private void billBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billBtnActionPerformed
        pp = new Payments();
        
        Query getBooking = em.createNamedQuery("Bookingtable.findByBookingid").setParameter("bookingid", this.tableBID);
        List <Bookingtable> bb = getBooking.getResultList();
        Bookingtable bookingDesired = null;
        for(Bookingtable b: bb)
            bookingDesired = b;
        
        pp.setBookingid(bookingDesired);
        //System.out.println("com1");
        pp.setDateofbill(this.billDate.getDate());
        //System.out.println("com2");
        pp.setGuestid(bookingDesired.getGuestid());
        //System.out.println("com3");
        pp.setRoomid(bookingDesired.getRoomid());
        //System.out.println("com4");
        pp.setTotalcharge(this.total);
        //System.out.println("com5");
        
        Query getBy = em.createNamedQuery("Reservationagent.findByReservationagentid").setParameter("reservationagentid", new BigDecimal(this.resAgtID_Pyts.getText()));
        List <Reservationagent> getRes = getBy.getResultList();
        Reservationagent bookBy = null;
        for(Reservationagent by : getRes)
            bookBy = by;
        pp.setResagentid(bookBy);
        em.persist(pp);
        //System.out.println("com6");
        // Modify database
        Query q1 = em.createNativeQuery("UPDATE BOOKINGTABLE SET BOOKINGSTATUS = 0 WHERE BOOKINGID = " + this.tableBID);
        Query q2 = null;
        Query q = em.createNamedQuery("Catalogeofroom.findByRoomid").setParameter("roomid", this.tableRoomID);
        List <Catalogeofroom> one = q.getResultList();
        //System.out.println("task1");
        for(Catalogeofroom r : one) {
            if(r.getRoomtype().equals("Single")) 
                q2 = em.createNativeQuery("UPDATE CATALOGEOFROOM SET ROOMSTATUS = 'Ready' WHERE ROOMID = " + this.tableRoomID);
            else {
                if(r.getRoomstatus().equals("Full"))
                    q2 = em.createNativeQuery("UPDATE CATALOGEOFROOM SET ROOMSTATUS = 'Res.Once' WHERE ROOMID = " + this.tableRoomID);
                else if(r.getRoomstatus().equals("Res.Once"))
                    q2 = em.createNativeQuery("UPDATE CATALOGEOFROOM SET ROOMSTATUS = 'Ready' WHERE ROOMID = " + this.tableRoomID);
            }
        }
        //System.out.println("task2");
        try {
            em.getTransaction().begin();
            q1.executeUpdate();
            q2.executeUpdate();
            em.getTransaction().commit();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Can't update on dataBase, some thing wrong");
            return;
        }
        //System.out.println("task3");
        JOptionPane.showMessageDialog(null, "The booking has been ended properly");
        this.txtAreaPayments.append(pp.getPaymentid().toString() + "\t       " + pp.getGuestid().toString() + "     \t       " + pp.getResagentid().toString() + "               \t    \t" + pp.getRoomid().toString() + "                \t"
                                                                + pp.getBookingid().toString() + "                     \t" + pp.getTotalcharge().toString() + "\t" + pp.getDateofbill().toString() + "\n");
        
        // Generate bill
        Map <String, Object> params = new HashMap <> ();
        
        params.put("guest_id_from_user", this.tableGID );
        try {
            conn = ods.getConnection();
            in1 = new FileInputStream(new File("Bill.jrxml"));
            System.out.println("Lol213344444");
            JasperDesign jd1 = JRXmlLoader.load(in1);
            System.out.println("Lol213333333");
            JasperReport jr1 = JasperCompileManager.compileReport(jd1);
            System.out.println("Lol21335555");
            JasperPrint jp1 = JasperFillManager.fillReport(jr1, params, conn);
            System.out.println("Lol");
            JFrame f = new JFrame("Bill");
            f.getContentPane().add(new JRViewer(jp1));
            f.pack();
            f.setLocation(250, 100);
            f.setResizable(true);
            f.setVisible(true);
            in1.close();
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Something has gone wrong while connecting to database");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "The report does not exist, make sure to include it correctly", "Error message", ERROR_MESSAGE);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "There is a problem while loading the report");
            System.out.println(ex.toString());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "the input stream cannot close properly");
        }
    }//GEN-LAST:event_billBtnActionPerformed

    private void reportPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportPaymentsActionPerformed
        try {
            conn = ods.getConnection();
            in2 = new FileInputStream(new File("AllPayments.jrxml"));
            JasperDesign jd1 = JRXmlLoader.load(in2);
            JasperReport jr1 = JasperCompileManager.compileReport(jd1);
            JasperPrint jp1 = JasperFillManager.fillReport(jr1, null, conn);
            out = new FileOutputStream( new File("AllPayments.pdf") );
            JasperExportManager.exportReportToPdfStream(jp1, out);
            in2.close();
            out.close();
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Can't connect to dataBase", "Invalid connection", ERROR_MESSAGE);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "The report file not found not found", "Not found any fil report", ERROR_MESSAGE);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "The report not found not found", "Not found any report", ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "There is a problem while exporting the report to PDF", "Problem in exporting", ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "The report has been updated successfully");
    }//GEN-LAST:event_reportPaymentsActionPerformed

    private void discountItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_discountItemStateChanged
            Double discnt = Double.parseDouble((String) this.discount.getSelectedItem());
            BigDecimal bd, res, all;
            BigInteger totalBill = new BigInteger(this.saveTotal + "");
            if( (evt.getStateChange() == ItemEvent.SELECTED) && (this.discount.getSelectedIndex() == 1) ) {
                bd = new BigDecimal(totalBill);
                res = bd.multiply(new BigDecimal(discnt));
                all = new BigDecimal(totalBill).subtract(res);
                totalBill = all.toBigInteger();
                this.totalChargeTxtFld.setText(totalBill + "");
                this.total = totalBill;
            } else if((evt.getStateChange() == ItemEvent.SELECTED) && (this.discount.getSelectedIndex() == 2)) {
                bd = new BigDecimal(totalBill);
                res = bd.multiply(new BigDecimal(discnt));
                all = new BigDecimal(totalBill).subtract(res);
                totalBill = all.toBigInteger();
                this.totalChargeTxtFld.setText(totalBill + "");
                this.total = totalBill;
            } else if((evt.getStateChange() == ItemEvent.SELECTED) && (this.discount.getSelectedIndex() == 0)) {
                this.total = saveTotal;
                this.totalChargeTxtFld.setText(this.total + "");
            }
    }//GEN-LAST:event_discountItemStateChanged

    private void jBtnFillDataIntoFieldesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFillDataIntoFieldesActionPerformed
        // TODO add your handling code here:
        try{
                    EntityManagerFactory eemf = Persistence.createEntityManagerFactory("JavaApplication10PU");
        EntityManager eem  = eemf.createEntityManager();
        DefaultTableModel table = (DefaultTableModel)this.jTableAllResrAgent.getModel();
        int rowNumber = jTableAllResrAgent.getSelectedRow();
        Object ssn = table.getValueAt(rowNumber, 0);
        Object reservegentId = table.getValueAt(rowNumber, 1);
        Query selectedReservagent = eem.createNamedQuery("Reservationagent.findByReservationagentid").setParameter("reservationagentid", reservegentId);
        List <Reservationagent> resevagentList =  selectedReservagent.getResultList();
        Reservationagent resevagent = resevagentList.get(0);
        this.setResevagent(resevagent);                //to use it in update
        Person reservAsPerson = resevagent.getSsn();
        this.jTxtSsnForRes.setText(String.valueOf(reservAsPerson.getSsn()));
        this.jTxtFNameForRes.setText(reservAsPerson.getFname());
        this.jTxtLNameForRes.setText(reservAsPerson.getLname());
        this.jTxtCityForRes.setText(reservAsPerson.getCity());
        this.jTxtCountyForRes.setText(reservAsPerson.getCountry());
        this.jTxtAddressForRes.setText(reservAsPerson.getAddress());
        this.jTxtNationalityForRes.setText(reservAsPerson.getNationality());
        this.jDateBirthDateForRese.setDate(reservAsPerson.getBdate());
        this.jTxtHomePhoneForRes.setText(String.valueOf(reservAsPerson.getHomephonenum()));
        this.jTxtEmailForRes.setText(reservAsPerson.getEmailadd());
        this.jTxtCellualrForRes.setText(String.valueOf(reservAsPerson.getCellularphonenum()));
        this.jTxtZepCodeForRes.setText(String.valueOf(reservAsPerson.getZipcode()));
        this.jTxtSectionForRes.setText(resevagent.getSection());
        this.jTxtSalaryForRes.setText(String.valueOf(resevagent.getSalary()));
        if (reservAsPerson.getGender().equals("F")){
            this.combBxGGenderForRes.setSelectedIndex(1);
        }
        else    this.combBxGGenderForRes.setSelectedIndex(0);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, "Please select a row to fill in fields");
        }


    }//GEN-LAST:event_jBtnFillDataIntoFieldesActionPerformed

    

    
    private void setOnlyHomePagePaneVisible(){
        this.setColor(homePageSide);
        this.HomePanel.setVisible(true);
        
        resetColor(adminPanelSide);
        this.AdminPanel.setVisible(false);
        
        resetColor(roomsPanelSide);
        this.catalogPanel.setVisible(false);
        
        resetColor(guestPanelSide);
        this.guestPanel.setVisible(false);
        
        resetColor(paymentsPanelSide);
        this.paymentsPanel.setVisible(false);
        
        resetColor(this.bookingTableSide);
        this.bookingPanel.setVisible(false);
        
        this.ScrollPaneAdminPaneAfterLogIn.setVisible(false);
     }
    
    
    private void setOnlyAdminPaneVisible(){
        resetColor(this.homePageSide);
        this.HomePanel.setVisible(false);
        
        setColor(this.adminPanelSide);
        this.AdminPanel.setVisible(true);
        
        resetColor(this.roomsPanelSide);
        this.catalogPanel.setVisible(false);
        
        resetColor(this.guestPanelSide);
        this.guestPanel.setVisible(false);
        
        resetColor(this.paymentsPanelSide);
        this.paymentsPanel.setVisible(false);
        
        resetColor(this.bookingTableSide);
        this.bookingPanel.setVisible(false);
        
        this.ScrollPaneAdminPaneAfterLogIn.setVisible(false);
    }
    
    
    private void setOnlyCatalogPaneVisible() {
        resetColor(homePageSide);
        this.HomePanel.setVisible(false);
        
        resetColor(this.adminPanelSide);
        this.AdminPanel.setVisible(false);
        
        setColor(this.roomsPanelSide);
        this.catalogPanel.setVisible(true);
        
        resetColor(guestPanelSide);
        this.guestPanel.setVisible(false);
        
        resetColor(this.paymentsPanelSide);
        this.paymentsPanel.setVisible(false);
        
        resetColor(this.bookingTableSide);
        this.bookingPanel.setVisible(false);
        
        this.ScrollPaneAdminPaneAfterLogIn.setVisible(false);
    }
    
    
    private void setGuestPanelShown() {
        resetColor(homePageSide);
        this.HomePanel.setVisible(false);
        
        resetColor(adminPanelSide);
        this.AdminPanel.setVisible(false);
        
        resetColor(roomsPanelSide);
        this.catalogPanel.setVisible(false);
        
        setColor(guestPanelSide);
        this.guestPanel.setVisible(true);
        
        resetColor(paymentsPanelSide);
        this.paymentsPanel.setVisible(false);
        
        resetColor(this.bookingTableSide);
        this.bookingPanel.setVisible(false);
        
        this.ScrollPaneAdminPaneAfterLogIn.setVisible(false);
    }
    
    
    private void setPaymentsPanelShown() {
        setColor(paymentsPanelSide);
        this.paymentsPanel.setVisible(true);
        
        resetColor(homePageSide);
        this.HomePanel.setVisible(false);
        
        resetColor(adminPanelSide);
        this.AdminPanel.setVisible(false);
        
        resetColor(roomsPanelSide);
        this.catalogPanel.setVisible(false);
        
        resetColor(guestPanelSide);
        this.guestPanel.setVisible(false);
        
        resetColor(this.bookingTableSide);
        this.bookingPanel.setVisible(false);
        
        this.ScrollPaneAdminPaneAfterLogIn.setVisible(false);
    }
    
    
    private void setBookingPanelShown() {
        resetColor(this.homePageSide);
        this.HomePanel.setVisible(false);
        
        resetColor(this.adminPanelSide);
        this.AdminPanel.setVisible(false);
        
        resetColor(this.roomsPanelSide);
        this.catalogPanel.setVisible(false);
        
        resetColor(this.guestPanelSide);
        this.guestPanel.setVisible(false);
        
        resetColor(this.paymentsPanelSide);
        this.paymentsPanel.setVisible(false);
        
        setColor(this.bookingTableSide);
        this.bookingPanel.setVisible(true);
        
      //  this.AdminPaneAfterLogIn.setVisible(false);
        this.ScrollPaneAdminPaneAfterLogIn.setVisible(false);
        
        this.getAllBooking();
    }
    
    
    private void setAdminPanelVisible(){
        this.AdminPanel.setVisible(false);
        this.AdminPaneAfterLogIn.setVisible(true);
    }
    
    
    private void setAllReservgentInTable(){
        
        EntityManagerFactory eemf = Persistence.createEntityManagerFactory("JavaApplication10PU");
        EntityManager eem  = eemf.createEntityManager();
        eem.getTransaction().begin();
        Query getAllReser = eem.createNamedQuery("Reservationagent.findAll");
        List<Reservationagent> allReser = getAllReser.getResultList();
        DefaultTableModel reserTable = (DefaultTableModel) jTableAllResrAgent.getModel();
        reserTable.setRowCount(0);
        
        for (Reservationagent reser : allReser) {
            reserTable = (DefaultTableModel) jTableAllResrAgent.getModel();
            reserTable.addRow(new Object[]{reser.getSsn().getSsn(), reser.getReservationagentid(),
                reser.getSalary(), reser.getSection()});
            
            System.out.println("here");
        }
        jTableAllResrAgent.setVisible(true);
        eem.getTransaction().commit();
    }

    
    
    void emptyReservagentTable(){
//        DefaultTableModel reservagentTable = (DefaultTableModel) jTableAllResrAgent.getModel();
//        int rowCount = reservagentTable.getRowCount();
//        for (int i=0 ; i<rowCount ;i++){
//            reservagentTable.removeRow(i);
//        }
    }
    
    
    
    private void setColor(javax.swing.JPanel p) {
        p.setBackground(c2);
    }
    
    
    private void resetColor(javax.swing.JPanel p) {
        p.setBackground(c1);
    }
    
    
    private long getDifference(java.util.Date d1, java.util.Date d2) {
        long diff = d2.getTime() - d1.getTime();
        long hours = diff/(60*60*1000);
        long days = hours/24 + 1;
        return (days);
    }
    
    
    private void addToJTable(Bookingtable b, Guest guest, String roomId, java.util.Date from, java.util.Date to) {
        dmt = (DefaultTableModel) this.jTableBookingTable.getModel();
        BigDecimal rId = BigDecimal.valueOf(Long.parseLong(roomId));
        //System.out.println(" in in table");
        Object [] arr = {b.getBookingid(), guest.getSsn(), guest.getGuestid(), rId, from, to};
        //System.out.println("in JTABLE");
        dmt.addRow(arr);
    }

    
     private void setResevagent(Reservationagent reservId) {
            this.resevagentToUpdate = reservId;
    }
      
      
    Reservationagent getResevagent(){
        return this.resevagentToUpdate ;
    }
    
    void getAllBooking(){
        EntityManagerFactory eemf = Persistence.createEntityManagerFactory("JavaApplication10PU");
        EntityManager eem  = eemf.createEntityManager();
        eem.getTransaction().begin();
        Query getAllBooking = eem.createNamedQuery("Bookingtable.findByBookingstatus").setParameter("bookingstatus", BigInteger.ONE);
        List <Bookingtable> bookingTables = getAllBooking.getResultList();
        int bookingCount = bookingTables.size();
        DefaultTableModel bookingTableTable = (DefaultTableModel) this.jTableBookingTable.getModel();
        bookingTableTable.setRowCount(0);
        for (Bookingtable bookingTable :bookingTables){

           bookingTableTable = (DefaultTableModel) this.jTableBookingTable.getModel();
           Object [] booking =  {bookingTable.getBookingid() , bookingTable.getGuestid().getSsn().getSsn()
                   ,bookingTable.getGuestid().getGuestid(), bookingTable.getRoomid().getRoomid()
                    ,bookingTable.getDatefrom(),bookingTable.getDateto()};
           bookingTableTable.addRow(booking);
        }
        eem.getTransaction().commit();
        eem.close();

//        
//        for (Reservationagent reser : allReser) {
//            reserTable = (DefaultTableModel) jTableAllResrAgent.getModel();
//            reserTable.addRow(new Object[]{reser.getSsn().getSsn(), reser.getReservationagentid(),
//                reser.getSalary(), reser.getSection()});
    }
   
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

                MF = new MainFrame();
                MF.setResizable(true);
                MF.setExtendedState(MAXIMIZED_BOTH);
                MF.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                start.pack();
                start.setLocation(230, 200);
                start.setVisible(true);
                System.out.print("Lol");
        
//        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                MF = new MainFrame();
//                MF.setResizable(true);
//                MF.setExtendedState(MAXIMIZED_BOTH);
//                MF.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//                start.pack();
//                start.setLocation(230, 200);
//                start.setVisible(true);
//            }
//        });
    }
    
  
    
    private Reservationagent resevagentToUpdate ;
    private static MainFrame MF;
    private final Color c1, c2;
    private EntityManagerFactory emf;
    private EntityManager em;
    private Reservationagent RsvAgt;
    private Guest g;
    private Person person, p;
    private Catalogeofroom room;
    private Payments pp;
    private DefaultTableModel dmt;
    private BigDecimal tableRoomID, tableBID, tableGID;
    private java.util.Date tableFrom, tableTo;
    private long dateDiff;
    private OracleDataSource ods;
    private Connection conn;
    private FileInputStream in1, in2;
    private FileOutputStream out;
    private BigInteger total, saveTotal;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminLogniPanel;
    private javax.swing.JPanel AdminPaneAfterLogIn;
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JPanel BackGroundPanel;
    private javax.swing.JLabel HomeLabelSide;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton OKcatalogBtn;
    private javax.swing.JLabel SSNGuest1;
    private javax.swing.JScrollPane ScrollPaneAdminPaneAfterLogIn;
    private javax.swing.JSeparator Sep1;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JLabel Sign;
    private javax.swing.JLabel State;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel VelvetHotel;
    private javax.persistence.EntityManager YazanProjectPUEntityManager;
    private javax.swing.JLabel adminIcon;
    private javax.swing.JLabel adminIcon1;
    private javax.swing.JLabel adminLabelSide;
    private javax.swing.JPanel adminPanelSide;
    private javax.swing.JLabel adminStmt;
    private javax.swing.JLabel adminTitle;
    private javax.swing.JButton billBtn;
    private com.toedter.calendar.JDateChooser billDate;
    private javax.swing.JLabel blueVelvetHotel;
    private javax.swing.JLabel bookingIcon;
    private javax.swing.JLabel bookingLabel;
    private javax.swing.JPanel bookingPanel;
    private javax.swing.JPanel bookingTableSide;
    private javax.swing.JLabel bookingTitleLabel;
    private javax.swing.JPanel catalogPanel;
    private javax.swing.JComboBox<String> chooseSearch;
    private javax.swing.JButton clrBtnRooms;
    private javax.swing.JButton clrGuestinfo;
    private javax.swing.JComboBox<String> combBxGGender;
    private javax.swing.JComboBox<String> combBxGGenderForRes;
    private javax.swing.JComboBox combBxReservagent;
    private javax.swing.JButton confirmBtnGuest;
    private com.toedter.calendar.JDateChooser dateFrom;
    private javax.swing.JLabel dateFromBooking;
    private com.toedter.calendar.JDateChooser dateTo;
    private javax.swing.JLabel dateToBooking;
    private javax.swing.JLabel desc;
    private javax.swing.JTextField descTxtFld;
    private javax.swing.JComboBox<String> discount;
    private javax.swing.JButton endBooking;
    private javax.swing.JButton enter;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel floor;
    private javax.swing.JTextField floorTxtFld;
    private javax.swing.JLabel gAddLabel;
    private javax.swing.JLabel gBdateLab;
    private javax.swing.JLabel gCellLabel;
    private javax.swing.JLabel gCityLabel;
    private javax.swing.JLabel gCodeLabel;
    private javax.swing.JLabel gCountryLabel;
    private javax.swing.JLabel gEmailLab;
    private javax.swing.JLabel gFNLabel;
    private javax.swing.JLabel gGenderLabel;
    private javax.swing.JLabel gHomePhoneLabel;
    private javax.swing.JLabel gLNLabel;
    private javax.swing.JLabel gNatLabel;
    private javax.swing.JLabel gNatLabel1;
    private javax.swing.JLabel gNatLabel2;
    private javax.swing.JPanel gTitlePanel;
    private javax.swing.JLabel greeting;
    private javax.swing.JLabel guestIcon;
    private javax.swing.JLabel guestLabelSide;
    private javax.swing.JPanel guestPanel;
    private javax.swing.JPanel guestPanelSide;
    private javax.swing.JLabel guestTitle;
    private javax.swing.JPanel homePageSide;
    private javax.swing.JLabel hotelimg;
    private javax.swing.JLabel informationLabel;
    private javax.swing.JLabel insertTitle;
    private javax.swing.JButton jBtnAddNewReservagevt;
    private javax.swing.JButton jBtnDeleteReservagent;
    private javax.swing.JButton jBtnFillDataIntoFieldes;
    private javax.swing.JButton jBtnUpdateReseevagent;
    private com.toedter.calendar.JDateChooser jDateBirthDateForRese;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableAllResrAgent;
    private javax.swing.JTable jTableBookingTable;
    private javax.swing.JTextField jTxtAdd;
    private javax.swing.JTextField jTxtAddressForRes;
    private com.toedter.calendar.JDateChooser jTxtBDate;
    private javax.swing.JTextField jTxtCellPhone;
    private javax.swing.JTextField jTxtCellualrForRes;
    private javax.swing.JTextField jTxtCity;
    private javax.swing.JTextField jTxtCityForRes;
    private javax.swing.JTextField jTxtCountry;
    private javax.swing.JTextField jTxtCountyForRes;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtEmailForRes;
    private javax.swing.JTextField jTxtFNameForRes;
    private javax.swing.JTextField jTxtFname;
    private javax.swing.JTextField jTxtHomePhone;
    private javax.swing.JTextField jTxtHomePhoneForRes;
    private javax.swing.JTextField jTxtLNameForRes;
    private javax.swing.JTextField jTxtLname;
    private javax.swing.JTextField jTxtNationality;
    private javax.swing.JTextField jTxtNationalityForRes;
    private javax.swing.JTextField jTxtSalaryForRes;
    private javax.swing.JTextField jTxtSectionForRes;
    private javax.swing.JTextField jTxtSsn;
    private javax.swing.JTextField jTxtSsnForRes;
    private javax.swing.JTextField jTxtZepCodeForRes;
    private javax.swing.JTextField jTxtZipCode;
    private javax.swing.JLayeredPane layeredPanel;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel logoImg;
    private javax.swing.JPasswordField passFld;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordTxtFld;
    private javax.swing.JLabel paymentIcon;
    private javax.swing.JLabel paymentsLabel;
    private javax.swing.JPanel paymentsPanel;
    private javax.swing.JPanel paymentsPanelSide;
    private javax.swing.JLabel price;
    private javax.swing.JTextField priceTxtFld;
    private javax.swing.JButton refreshCatalog;
    private javax.swing.JButton register;
    private javax.swing.JButton reportPayments;
    private javax.swing.JLabel resAgent_Bill;
    private javax.swing.JLabel resAgent_Bill1;
    private javax.swing.JLabel resAgent_Bill2;
    private javax.swing.JTextField resAgtID_Pyts;
    private javax.swing.JLabel resAgt_id_booking;
    private javax.swing.JComboBox<String> roomTypeCmbBox;
    private javax.swing.JTextField room_idBooking;
    private javax.swing.JLabel room_id_booking;
    private javax.swing.JTextArea roomsAvailable;
    private javax.swing.JLabel roomsIcon;
    private javax.swing.JLabel roomsLabelSide;
    private javax.swing.JPanel roomsPanelSide;
    private javax.swing.JLabel search;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTxtFld;
    private javax.swing.JComboBox<String> star;
    private javax.swing.JLabel starLabel;
    private static javax.swing.JDialog start;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JLabel title;
    private javax.swing.JPanel titleBookingPanel;
    private javax.swing.JPanel titleCatalog;
    private javax.swing.JLabel titlePayments;
    private javax.swing.JPanel titlePaymentsPanel;
    private javax.swing.JLabel totalCharge;
    private javax.swing.JTextField totalChargeTxtFld;
    private javax.swing.JTextArea txtAreaPayments;
    private javax.swing.JLabel type;
    private javax.swing.JLabel userName;
    private javax.swing.JTextField userNameTxtFld;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}