/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hordegraphique;


import java.awt.BorderLayout;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
/**
 *
 * @author Gabriel
 */
public class HordeInterface extends javax.swing.JFrame {

    /**
     * Creates new form HordeInterface
     */
    public HordeInterface() {
        initComponents();
    }
    private int cpt;
    private boolean partieDemarree=false;
    private Menu menu;
    private Jeu partie;
    private boolean isNbJoueurSet=false;
    private int copieNbJoueur;
    private int cptCase=0;
    private int cptSac=0;
    
    // Debut getter et setter
    public JRadioButton getAfficherConstruction() {
        return afficherConstruction;
    }

    public void setAfficherConstruction(JRadioButton afficherConstruction) {
        this.afficherConstruction = afficherConstruction;
    }

    public JRadioButton getAfficherRegle() {
        return afficherRegle;
    }

    public void setAfficherRegle(JRadioButton afficherRegle) {
        this.afficherRegle = afficherRegle;
    }

    public JRadioButton getAfficherResume() {
        return afficherResume;
    }

    public void setAfficherResume(JRadioButton afficherResume) {
        this.afficherResume = afficherResume;
    }

    public JRadioButton getConstruire() {
        return construire;
    }

    public void setConstruire(JRadioButton construire) {
        this.construire = construire;
    }

    public JRadioButton getConsulterEntrepot() {
        return consulterEntrepot;
    }

    public void setConsulterEntrepot(JRadioButton consulterEntrepot) {
        this.consulterEntrepot = consulterEntrepot;
    }

    public JPanel getExterieur() {
        return exterieur;
    }

    public void setExterieur(JPanel exterieur) {
        this.exterieur = exterieur;
    }

    public JRadioButton getFouiller() {
        return fouiller;
    }

    public void setFouiller(JRadioButton fouiller) {
        this.fouiller = fouiller;
    }

    public JRadioButton getInteragirPorte() {
        return interagirPorte;
    }

    public void setInteragirPorte(JRadioButton interagirPorte) {
        this.interagirPorte = interagirPorte;
    }

    public JPanel getInterieur() {
        return interieur;
    }

    public void setInterieur(JPanel interieur) {
        this.interieur = interieur;
    }

    public JLayeredPane getjLayeredPane1() {
        return jLayeredPane1;
    }

    public void setjLayeredPane1(JLayeredPane jLayeredPane1) {
        this.jLayeredPane1 = jLayeredPane1;
    }

    public JRadioButton getParticiper() {
        return participer;
    }

    public void setParticiper(JRadioButton participer) {
        this.participer = participer;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Jeu getPartie() {
        return partie;
    }

    public void setPartie(Jeu partie) {
        this.partie = partie;
    }

    public boolean isIsNbJoueurSet() {
        return isNbJoueurSet;
    }

    public void setIsNbJoueurSet(boolean isNbJoueurSet) {
        this.isNbJoueurSet = isNbJoueurSet;
    }

    public int getCopieNbJoueur() {
        return copieNbJoueur;
    }

    public void setCopieNbJoueur(int copieNbJoueur) {
        this.copieNbJoueur = copieNbJoueur;
    }

    public int getCptCase() {
        return cptCase;
    }

    public void setCptCase(int cptCase) {
        this.cptCase = cptCase;
    }

    public int getCptSac() {
        return cptSac;
    }

    public void setCptSac(int cptSac) {
        this.cptSac = cptSac;
    }

    public JProgressBar getLifeProgressBar() {
        return LifeProgressBar;
    }

    public void setLifeProgressBar(JProgressBar LifeProgressBar) {
        this.LifeProgressBar = LifeProgressBar;
    }

   

    public JProgressBar getPAProgressBar() {
        return PAProgressBar;
    }

    public void setPAProgressBar(JProgressBar PAProgressBar) {
        this.PAProgressBar = PAProgressBar;
    }

    public ButtonGroup getBgEcranA() {
        return bgEcranA;
    }

    public void setBgEcranA(ButtonGroup bgEcranA) {
        this.bgEcranA = bgEcranA;
    }

    public JLabel getButBas() {
        return butBas;
    }

    public void setButBas(JLabel butBas) {
        this.butBas = butBas;
    }

    public JLabel getButBois() {
        return butBois;
    }

    public void setButBois(JLabel butBois) {
        this.butBois = butBois;
    }

    public JLabel getButCarte() {
        return butCarte;
    }

    public void setButCarte(JLabel butCarte) {
        this.butCarte = butCarte;
    }

    public JLabel getButClou() {
        return butClou;
    }

    public void setButClou(JLabel butClou) {
        this.butClou = butClou;
    }

    public JLabel getButDroit() {
        return butDroit;
    }

    public void setButDroit(JLabel butDroit) {
        this.butDroit = butDroit;
    }

    public JLabel getButGauche() {
        return butGauche;
    }

    public void setButGauche(JLabel butGauche) {
        this.butGauche = butGauche;
    }

    public JLabel getButGourde() {
        return butGourde;
    }

    public void setButGourde(JLabel butGourde) {
        this.butGourde = butGourde;
    }

    public JLabel getButHaut() {
        return butHaut;
    }

    public void setButHaut(JLabel butHaut) {
        this.butHaut = butHaut;
    }

    public JLabel getButPlan() {
        return butPlan;
    }

    public void setButPlan(JLabel butPlan) {
        this.butPlan = butPlan;
    }

    public JLabel getButRation() {
        return butRation;
    }

    public void setButRation(JLabel butRation) {
        this.butRation = butRation;
    }

    public JLabel getButTalki() {
        return butTalki;
    }

    public void setButTalki(JLabel butTalki) {
        this.butTalki = butTalki;
    }

    public JRadioButton getContinuer() {
        return continuer;
    }

    public void setContinuer(JRadioButton continuer) {
        this.continuer = continuer;
    }

    public JRadioButton getDemarrer() {
        return demarrer;
    }

    public void setDemarrer(JRadioButton demarrer) {
        this.demarrer = demarrer;
    }

    public JPanel getEcranAccueil() {
        return ecranAccueil;
    }

    public void setEcranAccueil(JPanel ecranAccueil) {
        this.ecranAccueil = ecranAccueil;
    }

    public JPanel getEcranTitre() {
        return ecranTitre;
    }

    public void setEcranTitre(JPanel ecranTitre) {
        this.ecranTitre = ecranTitre;
    }

    public JButton getEntrer() {
        return entrer;
    }

    public void setEntrer(JButton entrer) {
        this.entrer = entrer;
    }

    public JButton getFinirTour() {
        return finirTour;
    }

    public void setFinirTour(JButton finirTour) {
        this.finirTour = finirTour;
    }

    public JLabel getFondMini() {
        return fondMini;
    }

    public void setFondMini(JLabel fondMini) {
        this.fondMini = fondMini;
    }

    public JPanel getHub() {
        return hub;
    }

    public void setHub(JPanel hub) {
        this.hub = hub;
    }

    public JLabel getIndJour() {
        return indJour;
    }

    public void setIndJour(JLabel indJour) {
        this.indJour = indJour;
    }

    public JLabel getIndJournal() {
        return indJournal;
    }

    public void setIndJournal(JLabel indJournal) {
        this.indJournal = indJournal;
    }

    public JLabel getIndObjet() {
        return indObjet;
    }

    public void setIndObjet(JLabel indObjet) {
        this.indObjet = indObjet;
    }

    public JLabel getIndTour() {
        return indTour;
    }

    public void setIndTour(JLabel indTour) {
        this.indTour = indTour;
    }

    public JLabel getIndcoor() {
        return indcoor;
    }

    public void setIndcoor(JLabel indcoor) {
        this.indcoor = indcoor;
    }

    public JLabel getIndsac() {
        return indsac;
    }

    public void setIndsac(JLabel indsac) {
        this.indsac = indsac;
    }

    public JLabel getItem() {
        return item;
    }

    public void setItem(JLabel item) {
        this.item = item;
    }

    public JLabel getItem1() {
        return item1;
    }

    public void setItem1(JLabel item1) {
        this.item1 = item1;
    }

    public JLabel getItemDroit() {
        return itemDroit;
    }

    public void setItemDroit(JLabel itemDroit) {
        this.itemDroit = itemDroit;
    }

    public JLabel getItemDroit1() {
        return itemDroit1;
    }

    public void setItemDroit1(JLabel itemDroit1) {
        this.itemDroit1 = itemDroit1;
    }

    public JLabel getItemGauche() {
        return itemGauche;
    }

    public void setItemGauche(JLabel itemGauche) {
        this.itemGauche = itemGauche;
    }

    public JLabel getItemGauche1() {
        return itemGauche1;
    }

    public void setItemGauche1(JLabel itemGauche1) {
        this.itemGauche1 = itemGauche1;
    }

    public JFrame getjFrame1() {
        return jFrame1;
    }

    public void setjFrame1(JFrame jFrame1) {
        this.jFrame1 = jFrame1;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JRadioButton getjRadioButton1() {
        return afficherResume;
    }

    public void setjRadioButton1(JRadioButton jRadioButton1) {
        this.afficherResume = jRadioButton1;
    }

    public JRadioButton getjRadioButton2() {
        return afficherRegle;
    }

    public void setjRadioButton2(JRadioButton jRadioButton2) {
        this.afficherRegle = jRadioButton2;
    }

    public JRadioButton getjRadioButton3() {
        return afficherConstruction;
    }

    public void setjRadioButton3(JRadioButton jRadioButton3) {
        this.afficherConstruction = jRadioButton3;
    }

    public JRadioButton getjRadioButton4() {
        return construire;
    }

    public void setjRadioButton4(JRadioButton jRadioButton4) {
        this.construire = jRadioButton4;
    }

    public JRadioButton getjRadioButton5() {
        return participer;
    }

    public void setjRadioButton5(JRadioButton jRadioButton5) {
        this.participer = jRadioButton5;
    }

    public JRadioButton getjRadioButton6() {
        return consulterEntrepot;
    }

    public void setjRadioButton6(JRadioButton jRadioButton6) {
        this.consulterEntrepot = jRadioButton6;
    }

    public JRadioButton getjRadioButton7() {
        return interagirPorte;
    }

    public void setjRadioButton7(JRadioButton jRadioButton7) {
        this.interagirPorte = jRadioButton7;
    }

    public JLabel getJour() {
        return jour;
    }

    public void setJour(JLabel jour) {
        this.jour = jour;
    }

    public JLabel getlJournal() {
        return lJournal;
    }

    public void setlJournal(JLabel lJournal) {
        this.lJournal = lJournal;
    }

    public JLabel getLogo() {
        return logo;
    }

    public void setLogo(JLabel logo) {
        this.logo = logo;
    }

    public JPanel getMiniMap() {
        return miniMap;
    }

    public void setMiniMap(JPanel miniMap) {
        this.miniMap = miniMap;
    }

    public JLabel getNbClou() {
        return nbClou;
    }

    public void setNbClou(JLabel nbClou) {
        this.nbClou = nbClou;
    }

    public JLabel getNbEnergie() {
        return nbEnergie;
    }

    public void setNbEnergie(JLabel nbEnergie) {
        this.nbEnergie = nbEnergie;
    }

    public JLabel getNbGourde() {
        return nbGourde;
    }

    public void setNbGourde(JLabel nbGourde) {
        this.nbGourde = nbGourde;
    }

    public JLabel getNbObjet() {
        return nbObjet;
    }

    public void setNbObjet(JLabel nbObjet) {
        this.nbObjet = nbObjet;
    }

    public JLabel getNbPlanche() {
        return nbPlanche;
    }

    public void setNbPlanche(JLabel nbPlanche) {
        this.nbPlanche = nbPlanche;
    }

    public JLabel getNbRation() {
        return nbRation;
    }

    public void setNbRation(JLabel nbRation) {
        this.nbRation = nbRation;
    }

    public JLabel getNomJoueur() {
        return nomJoueur;
    }

    public void setNomJoueur(JLabel nomJoueur) {
        this.nomJoueur = nomJoueur;
    }

    public JPanel getpJournal() {
        return pJournal;
    }

    public void setpJournal(JPanel pJournal) {
        this.pJournal = pJournal;
    }

    public JTextPane getPage1() {
        return page1;
    }

    public void setPage1(JTextPane page1) {
        this.page1 = page1;
    }

    

    public JLabel getPage2() {
        return page2;
    }

    public void setPage2(JLabel page2) {
        this.page2 = page2;
    }

    public JLabel getPointAction() {
        return pointAction;
    }

    public void setPointAction(JLabel pointAction) {
        this.pointAction = pointAction;
    }

    public JLabel getPointVie() {
        return pointVie;
    }

    public void setPointVie(JLabel pointVie) {
        this.pointVie = pointVie;
    }

    public JLabel getPosition() {
        return position;
    }

    public void setPosition(JLabel position) {
        this.position = position;
    }

    public JButton getPrendreObjet() {
        return prendreObjet;
    }

    public void setPrendreObjet(JButton prendreObjet) {
        this.prendreObjet = prendreObjet;
    }

    public JButton getPrendreObjet1() {
        return prendreObjet1;
    }

    public void setPrendreObjet1(JButton prendreObjet1) {
        this.prendreObjet1 = prendreObjet1;
    }

    public JRadioButton getQuitter() {
        return quitter;
    }

    public void setQuitter(JRadioButton quitter) {
        this.quitter = quitter;
    }

    public JLabel getTour() {
        return tour;
    }

    public void setTour(JLabel tour) {
        this.tour = tour;
    }
    
    
    public boolean isPartieDemarree() {
        return partieDemarree;
    }

    public void setPartieDemarree(boolean partieDemarree) {
        this.partieDemarree = partieDemarree;
    }

    public int getCpt() {
        return cpt;
    }

    public void setCpt(int cpt) {
        this.cpt = cpt;
    }

    public JRadioButton getCalculerDefenses() {
        return CalculerDefenses;
    }

    public void setCalculerDefenses(JRadioButton CalculerDefenses) {
        this.CalculerDefenses = CalculerDefenses;
    }

    public ButtonGroup getBoutonRadio() {
        return boutonRadio;
    }

    public void setBoutonRadio(ButtonGroup boutonRadio) {
        this.boutonRadio = boutonRadio;
    }

    public JLabel getDefense() {
        return defense;
    }

    public void setDefense(JLabel defense) {
        this.defense = defense;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public JSeparator getjSeparator2() {
        return jSeparator2;
    }

    public void setjSeparator2(JSeparator jSeparator2) {
        this.jSeparator2 = jSeparator2;
    }

    public JSeparator getjSeparator3() {
        return jSeparator3;
    }

    public void setjSeparator3(JSeparator jSeparator3) {
        this.jSeparator3 = jSeparator3;
    }

    public JSeparator getjSeparator4() {
        return jSeparator4;
    }

    public void setjSeparator4(JSeparator jSeparator4) {
        this.jSeparator4 = jSeparator4;
    }

    public JSeparator getjSeparator5() {
        return jSeparator5;
    }

    public void setjSeparator5(JSeparator jSeparator5) {
        this.jSeparator5 = jSeparator5;
    }

    public JTextPane getjTextPane1() {
        return jTextPane1;
    }

    public void setjTextPane1(JTextPane jTextPane1) {
        this.jTextPane1 = jTextPane1;
    }
    // Fin des getters et setters
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        bgEcranA = new javax.swing.ButtonGroup();
        boutonRadio = new javax.swing.ButtonGroup();
        ecranTitre = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        entrer = new javax.swing.JButton();
        ecranAccueil = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        demarrer = new javax.swing.JRadioButton();
        continuer = new javax.swing.JRadioButton();
        quitter = new javax.swing.JRadioButton();
        hub = new javax.swing.JPanel();
        PAProgressBar = new javax.swing.JProgressBar();
        LifeProgressBar = new javax.swing.JProgressBar();
        butGourde = new javax.swing.JLabel();
        butRation = new javax.swing.JLabel();
        pointAction = new javax.swing.JLabel();
        pointVie = new javax.swing.JLabel();
        butBois = new javax.swing.JLabel();
        butPlan = new javax.swing.JLabel();
        butClou = new javax.swing.JLabel();
        indsac = new javax.swing.JLabel();
        butTalki = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        indcoor = new javax.swing.JLabel();
        finirTour = new javax.swing.JButton();
        indJournal = new javax.swing.JLabel();
        miniMap = new javax.swing.JPanel();
        butHaut = new javax.swing.JLabel();
        butDroit = new javax.swing.JLabel();
        butGauche = new javax.swing.JLabel();
        butBas = new javax.swing.JLabel();
        butCarte = new javax.swing.JLabel();
        pJournal = new javax.swing.JPanel();
        page2 = new javax.swing.JLabel();
        afficherResume = new javax.swing.JRadioButton();
        afficherRegle = new javax.swing.JRadioButton();
        afficherConstruction = new javax.swing.JRadioButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        exterieur = new javax.swing.JPanel();
        fouiller = new javax.swing.JRadioButton();
        interieur = new javax.swing.JPanel();
        construire = new javax.swing.JRadioButton();
        participer = new javax.swing.JRadioButton();
        consulterEntrepot = new javax.swing.JRadioButton();
        interagirPorte = new javax.swing.JRadioButton();
        CalculerDefenses = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        page1 = new javax.swing.JTextPane();
        nomJoueur = new javax.swing.JLabel();
        tour = new javax.swing.JLabel();
        jour = new javax.swing.JLabel();
        indTour = new javax.swing.JLabel();
        indJour = new javax.swing.JLabel();
        position = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        itemGauche = new javax.swing.JLabel();
        item = new javax.swing.JLabel();
        itemDroit = new javax.swing.JLabel();
        prendreObjet = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        itemGauche1 = new javax.swing.JLabel();
        item1 = new javax.swing.JLabel();
        itemDroit1 = new javax.swing.JLabel();
        prendreObjet1 = new javax.swing.JButton();
        fondMini = new javax.swing.JLabel();
        lJournal = new javax.swing.JLabel();
        indObjet = new javax.swing.JLabel();
        nbObjet = new javax.swing.JLabel();
        nbEnergie = new javax.swing.JLabel();
        nbPlanche = new javax.swing.JLabel();
        nbGourde = new javax.swing.JLabel();
        nbRation = new javax.swing.JLabel();
        nbClou = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        defense = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        jFrame1.setTitle("Maps");
        jFrame1.setMinimumSize(new java.awt.Dimension(1030, 750));
        jFrame1.setResizable(false);

        jScrollPane2.setEnabled(false);
        jScrollPane2.setMaximumSize(new java.awt.Dimension(1030, 750));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(1030, 750));
        jScrollPane2.setOpaque(false);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(1030, 750));

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        jTextPane1.setEnabled(false);
        jTextPane1.setMaximumSize(new java.awt.Dimension(1027, 750));
        jTextPane1.setMinimumSize(new java.awt.Dimension(1027, 750));
        jTextPane1.setOpaque(false);
        jTextPane1.setPreferredSize(new java.awt.Dimension(1027, 750));
        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Horde");
        setMinimumSize(new java.awt.Dimension(1080, 530));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        ecranTitre.setBackground(new java.awt.Color(255, 255, 255));
        ecranTitre.setMinimumSize(new java.awt.Dimension(1080, 530));
        ecranTitre.setPreferredSize(new java.awt.Dimension(1080, 530));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/titre.png"))); // NOI18N

        entrer.setBackground(new java.awt.Color(0, 0, 0));
        entrer.setForeground(new java.awt.Color(204, 0, 51));
        entrer.setText("Entrer");
        entrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ecranTitreLayout = new javax.swing.GroupLayout(ecranTitre);
        ecranTitre.setLayout(ecranTitreLayout);
        ecranTitreLayout.setHorizontalGroup(
            ecranTitreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ecranTitreLayout.createSequentialGroup()
                .addGroup(ecranTitreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ecranTitreLayout.createSequentialGroup()
                        .addGap(423, 423, 423)
                        .addComponent(logo))
                    .addGroup(ecranTitreLayout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(entrer)))
                .addContainerGap(423, Short.MAX_VALUE))
        );
        ecranTitreLayout.setVerticalGroup(
            ecranTitreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ecranTitreLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(logo)
                .addGap(47, 47, 47)
                .addComponent(entrer)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        getContentPane().add(ecranTitre);
        ecranTitre.setBounds(0, 0, 1080, 530);

        ecranAccueil.setBackground(new java.awt.Color(255, 255, 255));
        ecranAccueil.setMinimumSize(new java.awt.Dimension(1080, 530));
        ecranAccueil.setPreferredSize(new java.awt.Dimension(1080, 530));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/logo.png"))); // NOI18N

        demarrer.setText("Nouvelle Partie");
        demarrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demarrerActionPerformed(evt);
            }
        });

        continuer.setText("Continuer");
        continuer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuerActionPerformed(evt);
            }
        });

        quitter.setText("Quitter");
        quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ecranAccueilLayout = new javax.swing.GroupLayout(ecranAccueil);
        ecranAccueil.setLayout(ecranAccueilLayout);
        ecranAccueilLayout.setHorizontalGroup(
            ecranAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ecranAccueilLayout.createSequentialGroup()
                .addContainerGap(353, Short.MAX_VALUE)
                .addGroup(ecranAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ecranAccueilLayout.createSequentialGroup()
                        .addGroup(ecranAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(demarrer)
                            .addComponent(continuer)
                            .addComponent(quitter))
                        .addGap(475, 475, 475))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ecranAccueilLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(354, 354, 354))))
        );
        ecranAccueilLayout.setVerticalGroup(
            ecranAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ecranAccueilLayout.createSequentialGroup()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(demarrer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(continuer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quitter)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        getContentPane().add(ecranAccueil);
        ecranAccueil.setBounds(0, 0, 1080, 530);

        hub.setToolTipText("");
        hub.setMinimumSize(new java.awt.Dimension(1080, 530));
        hub.setLayout(null);

        PAProgressBar.setMaximum(10);
        PAProgressBar.setToolTipText("Unité à dépenser pour effectuer certaines actions du jeu");
        PAProgressBar.setValue(10);
        PAProgressBar.setName("PA/100"); // NOI18N
        hub.add(PAProgressBar);
        PAProgressBar.setBounds(900, 320, 146, 30);
        PAProgressBar.getAccessibleContext().setAccessibleName("");

        LifeProgressBar.setToolTipText("");
        LifeProgressBar.setValue(100);
        hub.add(LifeProgressBar);
        LifeProgressBar.setBounds(900, 380, 146, 30);

        butGourde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/gourde.png"))); // NOI18N
        butGourde.setToolTipText("Boire/Remplir la gourde(en ville seulement)");
        butGourde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butGourdeMouseClicked(evt);
            }
        });
        hub.add(butGourde);
        butGourde.setBounds(920, 140, 50, 50);

        butRation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/ration.png"))); // NOI18N
        butRation.setToolTipText("manger/prendre une ration (en ville seulement)");
        butRation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butRationMouseClicked(evt);
            }
        });
        hub.add(butRation);
        butRation.setBounds(980, 90, 40, 40);

        pointAction.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        pointAction.setText("Points d'action:");
        hub.add(pointAction);
        pointAction.setBounds(900, 300, 140, 19);

        pointVie.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        pointVie.setText("Points de vie:");
        hub.add(pointVie);
        pointVie.setBounds(900, 360, 130, 19);

        butBois.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/soft.png"))); // NOI18N
        butBois.setToolTipText("Boire une boisson énergissante");
        butBois.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butBoisMouseClicked(evt);
            }
        });
        hub.add(butBois);
        butBois.setBounds(920, 90, 40, 40);

        butPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/planche.png"))); // NOI18N
        butPlan.setToolTipText("Ressource nécessaire aux constructions");
        butPlan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butPlanMouseClicked(evt);
            }
        });
        hub.add(butPlan);
        butPlan.setBounds(920, 30, 50, 50);

        butClou.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/clou.png"))); // NOI18N
        butClou.setToolTipText("ressource nécessaire aux constructions");
        butClou.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butClouMouseClicked(evt);
            }
        });
        hub.add(butClou);
        butClou.setBounds(980, 30, 46, 50);

        indsac.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        indsac.setText("Sac:");
        hub.add(indsac);
        indsac.setBounds(950, 10, 40, 20);

        butTalki.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/talkie.png"))); // NOI18N
        butTalki.setToolTipText("Mettre à jour la carte");
        butTalki.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butTalkiMouseClicked(evt);
            }
        });
        hub.add(butTalki);
        butTalki.setBounds(30, 250, 60, 200);

        jLabel1.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel1.setText("Déplacement:");
        hub.add(jLabel1);
        jLabel1.setBounds(40, 0, 160, 19);

        indcoor.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        indcoor.setText("Position joueur:");
        indcoor.setToolTipText("Position du joueur sur la carte. La carte va de (0;0) à (-24;24). ");
        hub.add(indcoor);
        indcoor.setBounds(0, 200, 170, 19);

        finirTour.setBackground(new java.awt.Color(153, 0, 0));
        finirTour.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        finirTour.setForeground(new java.awt.Color(255, 255, 255));
        finirTour.setText("Finir tour");
        finirTour.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        finirTour.setOpaque(false);
        finirTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finirTourActionPerformed(evt);
            }
        });
        hub.add(finirTour);
        finirTour.setBounds(900, 430, 150, 50);

        indJournal.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        indJournal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indJournal.setText("Journal");
        indJournal.setMaximumSize(new java.awt.Dimension(35, 16));
        hub.add(indJournal);
        indJournal.setBounds(520, 60, 140, 30);

        miniMap.setEnabled(false);
        miniMap.setMinimumSize(new java.awt.Dimension(180, 180));
        miniMap.setOpaque(false);
        miniMap.setPreferredSize(new java.awt.Dimension(180, 180));

        butHaut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/up.png"))); // NOI18N
        butHaut.setToolTipText("déplacement sur la carte.");
        butHaut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butHautMouseClicked(evt);
            }
        });

        butDroit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/right.png"))); // NOI18N
        butDroit.setToolTipText("déplacement sur la carte.");
        butDroit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butDroitMouseClicked(evt);
            }
        });

        butGauche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/left.png"))); // NOI18N
        butGauche.setToolTipText("déplacement sur la carte.");
        butGauche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butGaucheMouseClicked(evt);
            }
        });

        butBas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/down.png"))); // NOI18N
        butBas.setToolTipText("déplacement sur la carte.");
        butBas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butBasMouseClicked(evt);
            }
        });

        butCarte.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        butCarte.setForeground(new java.awt.Color(255, 255, 255));
        butCarte.setText(" |          | ");
        butCarte.setToolTipText("Bouton permettant d'acceder à la carte");
        butCarte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butCarteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout miniMapLayout = new javax.swing.GroupLayout(miniMap);
        miniMap.setLayout(miniMapLayout);
        miniMapLayout.setHorizontalGroup(
            miniMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miniMapLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(butHaut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(miniMapLayout.createSequentialGroup()
                .addComponent(butGauche)
                .addGap(17, 17, 17)
                .addGroup(miniMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(miniMapLayout.createSequentialGroup()
                        .addComponent(butCarte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butDroit))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, miniMapLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(butBas)
                        .addGap(72, 72, 72))))
        );
        miniMapLayout.setVerticalGroup(
            miniMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miniMapLayout.createSequentialGroup()
                .addComponent(butHaut)
                .addGroup(miniMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(miniMapLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(miniMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butGauche)
                            .addComponent(butDroit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, miniMapLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butCarte)
                        .addGap(50, 50, 50)))
                .addComponent(butBas))
        );

        hub.add(miniMap);
        miniMap.setBounds(20, 20, 180, 180);

        pJournal.setEnabled(false);
        pJournal.setOpaque(false);

        page2.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        page2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        page2.setText("Que souhaitez vous faire ?");
        page2.setMaximumSize(new java.awt.Dimension(35, 16));

        afficherResume.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        afficherResume.setText("Résumé du jeu");
        afficherResume.setOpaque(false);

        afficherRegle.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        afficherRegle.setText("Règle du jeu");
        afficherRegle.setOpaque(false);
        afficherRegle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afficherRegleActionPerformed(evt);
            }
        });

        afficherConstruction.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        afficherConstruction.setText("Liste des constructions");
        afficherConstruction.setOpaque(false);
        afficherConstruction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afficherConstructionActionPerformed(evt);
            }
        });

        exterieur.setOpaque(false);

        fouiller.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        fouiller.setText("Fouiller la case");
        fouiller.setOpaque(false);
        fouiller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fouillerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout exterieurLayout = new javax.swing.GroupLayout(exterieur);
        exterieur.setLayout(exterieurLayout);
        exterieurLayout.setHorizontalGroup(
            exterieurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exterieurLayout.createSequentialGroup()
                .addComponent(fouiller)
                .addGap(0, 116, Short.MAX_VALUE))
        );
        exterieurLayout.setVerticalGroup(
            exterieurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exterieurLayout.createSequentialGroup()
                .addComponent(fouiller)
                .addGap(0, 185, Short.MAX_VALUE))
        );

        interieur.setOpaque(false);

        construire.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        construire.setText("Construire");
        construire.setOpaque(false);
        construire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                construireActionPerformed(evt);
            }
        });

        participer.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        participer.setText("Participer au chantier");
        participer.setOpaque(false);
        participer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                participerActionPerformed(evt);
            }
        });

        consulterEntrepot.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        consulterEntrepot.setText("Consulter l'entrepôt");
        consulterEntrepot.setOpaque(false);
        consulterEntrepot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulterEntrepotActionPerformed(evt);
            }
        });

        interagirPorte.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        interagirPorte.setText("Intéragir avec la porte");
        interagirPorte.setOpaque(false);
        interagirPorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interagirPorteActionPerformed(evt);
            }
        });

        CalculerDefenses.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        CalculerDefenses.setText("Calculer les défenses");
        CalculerDefenses.setOpaque(false);
        CalculerDefenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculerDefensesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout interieurLayout = new javax.swing.GroupLayout(interieur);
        interieur.setLayout(interieurLayout);
        interieurLayout.setHorizontalGroup(
            interieurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interieurLayout.createSequentialGroup()
                .addGroup(interieurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CalculerDefenses)
                    .addComponent(interagirPorte)
                    .addComponent(consulterEntrepot)
                    .addComponent(construire)
                    .addComponent(participer))
                .addGap(0, 47, Short.MAX_VALUE))
        );
        interieurLayout.setVerticalGroup(
            interieurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interieurLayout.createSequentialGroup()
                .addComponent(construire)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(participer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consulterEntrepot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(interagirPorte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CalculerDefenses)
                .addGap(0, 42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exterieur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(interieur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exterieur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(interieur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jLayeredPane1.setLayer(exterieur, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(interieur, javax.swing.JLayeredPane.DEFAULT_LAYER);

        page1.setFont(new java.awt.Font("URW Chancery L", 0, 14)); // NOI18N
        page1.setOpaque(false);
        jScrollPane1.setViewportView(page1);

        javax.swing.GroupLayout pJournalLayout = new javax.swing.GroupLayout(pJournal);
        pJournal.setLayout(pJournalLayout);
        pJournalLayout.setHorizontalGroup(
            pJournalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pJournalLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pJournalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pJournalLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(page2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(pJournalLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(pJournalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(afficherResume)
                            .addComponent(afficherRegle)
                            .addComponent(afficherConstruction)
                            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pJournalLayout.setVerticalGroup(
            pJournalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pJournalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pJournalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pJournalLayout.createSequentialGroup()
                        .addComponent(page2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(afficherResume)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(afficherRegle)
                        .addGap(3, 3, 3)
                        .addComponent(afficherConstruction)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        hub.add(pJournal);
        pJournal.setBounds(280, 80, 610, 400);

        nomJoueur.setFont(new java.awt.Font("URW Chancery L", 3, 48)); // NOI18N
        nomJoueur.setForeground(new java.awt.Color(180, 27, 58));
        nomJoueur.setText("jLabel2");
        nomJoueur.setToolTipText("Nom du joueur actuel");
        hub.add(nomJoueur);
        nomJoueur.setBounds(290, 20, 240, 50);

        tour.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        tour.setForeground(new java.awt.Color(204, 51, 0));
        tour.setText("jLabel3");
        hub.add(tour);
        tour.setBounds(670, 20, 63, 24);

        jour.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        jour.setForeground(new java.awt.Color(204, 51, 0));
        jour.setText("jLabel4");
        hub.add(jour);
        jour.setBounds(830, 20, 63, 24);

        indTour.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        indTour.setText("Tour(s):");
        hub.add(indTour);
        indTour.setBounds(600, 20, 100, 19);

        indJour.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        indJour.setText("Jour(s):");
        hub.add(indJour);
        indJour.setBounds(760, 20, 110, 19);

        position.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        position.setForeground(new java.awt.Color(204, 51, 0));
        position.setText("jLabel2");
        hub.add(position);
        position.setBounds(140, 200, 70, 24);

        itemGauche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/left.png"))); // NOI18N
        itemGauche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemGaucheMouseClicked(evt);
            }
        });

        item.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/vide.png"))); // NOI18N
        item.setToolTipText("retirer un item du sac. Soit pour le mettre dans l'entrepôt, soit pour le jeter.");
        item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMouseClicked(evt);
            }
        });

        itemDroit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/right.png"))); // NOI18N
        itemDroit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemDroitMouseClicked(evt);
            }
        });

        prendreObjet.setBackground(new java.awt.Color(153, 0, 0));
        prendreObjet.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        prendreObjet.setForeground(new java.awt.Color(255, 255, 255));
        prendreObjet.setText("Jeter");
        prendreObjet.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        prendreObjet.setOpaque(false);
        prendreObjet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prendreObjetMouseClicked(evt);
            }
        });
        prendreObjet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prendreObjetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(itemGauche)
                .addGap(18, 18, 18)
                .addComponent(item)
                .addGap(20, 20, 20)
                .addComponent(itemDroit))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(prendreObjet, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(itemDroit, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(itemGauche, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(22, 22, 22)
                .addComponent(prendreObjet))
        );

        hub.add(jPanel1);
        jPanel1.setBounds(900, 190, 150, 110);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/zombie.png"))); // NOI18N
        jLabel3.setToolTipText("Permet de d'attaquer les zombies lorsqu'il y en a ($1PA/Zombie)");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        hub.add(jLabel3);
        jLabel3.setBounds(130, 220, 130, 160);

        itemGauche1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/left.png"))); // NOI18N
        itemGauche1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemGauche1MouseClicked(evt);
            }
        });

        item1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/vide.png"))); // NOI18N
        item1.setToolTipText("Prendre un item de l'entrepôt et le mettre dans le sac./Prendre un objet sur la case fouillée. ");
        item1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item1MouseClicked(evt);
            }
        });

        itemDroit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/right.png"))); // NOI18N
        itemDroit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemDroit1MouseClicked(evt);
            }
        });

        prendreObjet1.setBackground(new java.awt.Color(153, 0, 0));
        prendreObjet1.setFont(new java.awt.Font("FreeMono", 1, 14)); // NOI18N
        prendreObjet1.setForeground(new java.awt.Color(255, 255, 255));
        prendreObjet1.setText("Prendre");
        prendreObjet1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        prendreObjet1.setOpaque(false);
        prendreObjet1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prendreObjet1MouseClicked(evt);
            }
        });
        prendreObjet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prendreObjet1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(itemGauche1)
                .addGap(18, 18, 18)
                .addComponent(item1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(itemDroit1))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(prendreObjet1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemDroit1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(itemGauche1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(22, 22, 22)
                .addComponent(prendreObjet1))
        );

        hub.add(jPanel2);
        jPanel2.setBounds(120, 370, 150, 110);

        fondMini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/V.jpg"))); // NOI18N
        fondMini.setFocusable(false);
        hub.add(fondMini);
        fondMini.setBounds(20, 20, 180, 180);

        lJournal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/Journal.png"))); // NOI18N
        hub.add(lJournal);
        lJournal.setBounds(280, 90, 610, 390);

        indObjet.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        indObjet.setText("/10");
        indObjet.setToolTipText("Nombre d'item que peut contenir le sac.");
        hub.add(indObjet);
        indObjet.setBounds(1000, 160, 30, 19);

        nbObjet.setText("10");
        hub.add(nbObjet);
        nbObjet.setBounds(980, 160, 20, 14);

        nbEnergie.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        nbEnergie.setForeground(new java.awt.Color(204, 51, 0));
        nbEnergie.setText("10");
        hub.add(nbEnergie);
        nbEnergie.setBounds(910, 120, 20, 24);

        nbPlanche.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        nbPlanche.setForeground(new java.awt.Color(204, 51, 0));
        nbPlanche.setText("10");
        hub.add(nbPlanche);
        nbPlanche.setBounds(910, 60, 20, 24);

        nbGourde.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        nbGourde.setForeground(new java.awt.Color(204, 51, 0));
        nbGourde.setText("10");
        hub.add(nbGourde);
        nbGourde.setBounds(910, 170, 20, 24);

        nbRation.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        nbRation.setForeground(new java.awt.Color(204, 51, 0));
        nbRation.setText("10");
        hub.add(nbRation);
        nbRation.setBounds(1010, 120, 20, 24);

        nbClou.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        nbClou.setForeground(new java.awt.Color(204, 51, 0));
        nbClou.setText("10");
        hub.add(nbClou);
        nbClou.setBounds(1010, 60, 20, 24);

        jLabel2.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel2.setText("Défense de la ville: ");
        hub.add(jLabel2);
        jLabel2.setBounds(590, 40, 190, 19);

        defense.setFont(new java.awt.Font("URW Chancery L", 1, 18)); // NOI18N
        defense.setForeground(new java.awt.Color(204, 51, 0));
        defense.setText("jLabel4");
        hub.add(defense);
        defense.setBounds(760, 40, 63, 24);
        hub.add(jSeparator1);
        jSeparator1.setBounds(910, 80, 120, 10);
        hub.add(jSeparator2);
        jSeparator2.setBounds(910, 140, 120, 10);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        hub.add(jSeparator3);
        jSeparator3.setBounds(970, 30, 10, 210);
        hub.add(jSeparator4);
        jSeparator4.setBounds(610, 40, 270, 30);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        hub.add(jSeparator5);
        jSeparator5.setBounds(750, 20, 40, 20);

        getContentPane().add(hub);
        hub.setBounds(10, 0, 1080, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prendreObjetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prendreObjetMouseClicked
        // TODO add your handling code here: // Boutton afficher carte
    }//GEN-LAST:event_prendreObjetMouseClicked

    private void butTalkiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butTalkiMouseClicked
        //Mise à jours de la carte
        Journal.miseAJourCarte(partie.getJoueurActuel(), partie.getMonJournal());       // TODO add your handling code here: // Talkie
        Journal.toString(partie, 'M');
    }//GEN-LAST:event_butTalkiMouseClicked

    private void butClouMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butClouMouseClicked
        // TODO add your handling code here:// POUR CLOU
    }//GEN-LAST:event_butClouMouseClicked

    private void butPlanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butPlanMouseClicked
        // TODO add your handling code here:// POUR LES PLANCHES
    }//GEN-LAST:event_butPlanMouseClicked

    private void butBoisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butBoisMouseClicked
        // TODO add your handling code here:// boisson énergisante
        menu.accederBoireE();
    }//GEN-LAST:event_butBoisMouseClicked

    private void butRationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butRationMouseClicked
        // TODO add your handling code here: POUR LES RATIONS
        menu.accederManger();
    }//GEN-LAST:event_butRationMouseClicked

    private void butGourdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butGourdeMouseClicked
        // TODO add your handling code here: POUR LES GOURDES
        menu.accederBoire();
    }//GEN-LAST:event_butGourdeMouseClicked

    private void itemDroitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemDroitMouseClicked
        // TODO add your handling code here:
        if(partie.getJoueurActuel().getSac().isEmpty()){cptSac=-1;}else{
        cptSac+=1;
        System.out.println("coucou "+cptSac);
        if(cptSac>4){
        cptSac=0;
        }
        accederObjetSac(cptSac);}
    }//GEN-LAST:event_itemDroitMouseClicked

    private void itemGaucheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemGaucheMouseClicked
        // TODO add your handling code here:
        if(partie.getJoueurActuel().getSac().isEmpty()){cptSac=-1;}else{cptSac-=1;
            System.out.println("coucou "+cptSac);
            if(cptSac<0){
                cptSac=4;
            }
        }
        accederObjetSac(cptSac);
    }//GEN-LAST:event_itemGaucheMouseClicked

    private void continuerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuerActionPerformed
        // Fonction pour commencer la partie
        // TODO add your handling code here:
        nomJoueur.setText(partie.getJoueurActuel().getNom());
        tour.setText(""+partie.getTempsPartie().getNumTour());
        jour.setText(""+partie.getTempsPartie().getNbJour());
        this.LifeProgressBar.setValue(partie.getJoueurActuel().getPdv());
        this.PAProgressBar.setValue(partie.getJoueurActuel().getPa());
        this.item1.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/ration.png")));
        this.item1.setToolTipText("Il y a "+partie.getMaVille().getEntrepot()[0].getQuantite()+" rations dans l'entrepôt.");
        this.position.setText(partie.getJoueurActuel().renvoyerCoordonnees());
        this.page1.setText(Journal.afficherPosition(partie, partie.getJoueurActuel()));
        this.butCarte.setText("| VILLE |");
        this.defense.setText(""+0);
        if(partie.getJoueurActuel().getSac().isEmpty()){
            this.nbClou.setText("0");
            this.nbEnergie.setText("0");
            this.nbGourde.setText("0");
            this.nbObjet.setText("0");
            this.nbPlanche.setText("0");
            this.nbRation.setText("0");
        }
        this.ecranAccueil.setVisible(false);
        this.hub.setVisible(true);
    }//GEN-LAST:event_continuerActionPerformed

    private void entrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrerActionPerformed
        // Fonction du label entrer du premier ecran
        // TODO add your handling code here:
        this.ecranTitre.setVisible(true);
        this.ecranAccueil.setVisible(false);
            
            
            this.hub.setVisible(false);
        if(!partieDemarree){
                partie=new Jeu();
                partie.lancerJeu(this);
                menu=partie.getMenuPartie();
                menu.demarrer(partie,this);
            }
        
            if(!isNbJoueurSet){
                String str;
                while(partie.getNombreJoueur()==0){
                    str="";
                    while(str.isEmpty()){
                            str=JOptionPane.showInputDialog(Journal.consulterDescription(57));
                    }
                    if(!str.isEmpty()){int num=Outils.conversionInt(str,partie); if(num>1){partie.setNombreJoueur(num);}}
                    
                }
                copieNbJoueur=0;
                while(copieNbJoueur<partie.getNombreJoueur()){
                    String nomJoueur="";
                    while(nomJoueur.isEmpty()||nomJoueur.equals(null)){
                        nomJoueur=JOptionPane.showInputDialog(Journal.consulterDescription(58)+copieNbJoueur+" ?");
                    }
                    Joueur unJoueur= new Joueur(this.partie,nomJoueur);
                    partie.getTabJoueur().add(unJoueur);
                    copieNbJoueur+=1;
                }
                partie.setJoueurActuel(0);
            }          
            
            
            this.ecranTitre.setVisible(false);
            this.ecranAccueil.setVisible(true); 
    }//GEN-LAST:event_entrerActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        // Fonction pour aller vers l'ecran menu 
        //this.jLabel2.setText(Journal.consulterDescription(56));
        this.ecranTitre.setVisible(true);
        this.ecranAccueil.setVisible(false);
        this.hub.setVisible(false);
        this.exterieur.setVisible(false);
        this.interieur.setVisible(true);
        this.bgEcranA.add(demarrer);
        this.bgEcranA.add(continuer);
        this.bgEcranA.add(quitter);
        
        this.boutonRadio.add(afficherResume);
        this.boutonRadio.add(afficherRegle);
        this.boutonRadio.add(afficherConstruction);
        this.boutonRadio.add(fouiller);
        this.boutonRadio.add(construire);
        this.boutonRadio.add(participer);
        this.boutonRadio.add(consulterEntrepot);
        this.boutonRadio.add(interagirPorte);
        this.boutonRadio.add(CalculerDefenses);
        
    }//GEN-LAST:event_formWindowOpened

    private void quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterActionPerformed
        // TODO add your handling code here:
        // Fonction pour quitter
        //JOptionPane.showInputDialog(JOptionPane.showConfirmDialog(rootPane, "Etes vous sur de vouloir quitter ?"));
        if(JOptionPane.showConfirmDialog(rootPane, "Etes vous sur de vouloir quitter ?")==0){
            Menu.quitter();
        }
    }//GEN-LAST:event_quitterActionPerformed

    private void demarrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demarrerActionPerformed
        // TODO add your handling code here:
        // Fonction pour démarrer la partie
        if(!partie.getPartie()){
            menu.demarrer(partie, this);
        }else{
            if(JOptionPane.showConfirmDialog(rootPane,Journal.consulterDescription(9))==0){
                this.partieDemarree=false;
                isNbJoueurSet=false;
                //this.jTextArea1.setText("");
                //jButton2.doClick();
                entrer.doClick();
            }
        }
    }//GEN-LAST:event_demarrerActionPerformed

    private void finirTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finirTourActionPerformed
        // TODO add your handling code here:
        // Fonction pour finir le tour
        menu.finirTour();
    }//GEN-LAST:event_finirTourActionPerformed

    private void itemGauche1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemGauche1MouseClicked
       // fonction de switch d'item gauche
        // TODO add your handling code here:
        cptCase-=1;
        if(cptCase<0){
        cptCase=4;
        }
        accederObjetCase(cptCase);
    }//GEN-LAST:event_itemGauche1MouseClicked

    private void itemDroit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemDroit1MouseClicked
        // TODO add your handling code here:
        // fonction de switch d'item droit
        cptCase+=1;
        if(cptCase>4){
        cptCase=0;
        }
        accederObjetCase(cptCase);
        
    }//GEN-LAST:event_itemDroit1MouseClicked

    private void prendreObjet1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prendreObjet1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_prendreObjet1MouseClicked

    private void afficherRegleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afficherRegleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_afficherRegleActionPerformed

    private void item1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item1MouseClicked
        // TODO add your handling code here:
        demarrerPrendreObjet();
    }//GEN-LAST:event_item1MouseClicked

    private void itemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMouseClicked
        // TODO add your handling code here:
        demarrerViderSac();
    }//GEN-LAST:event_itemMouseClicked

    private void prendreObjet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prendreObjet1ActionPerformed
        // TODO add your handling code here:
        demarrerPrendreObjet();
    }//GEN-LAST:event_prendreObjet1ActionPerformed

    private void prendreObjetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prendreObjetActionPerformed
        // TODO add your handling code here:
        //Fonction pour prendre un objet
        demarrerViderSac();
    }//GEN-LAST:event_prendreObjetActionPerformed

    private void butDroitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butDroitMouseClicked
        // TODO add your handling code here:
        // déplacement vers la droite
        menu.seDeplacer('D');
    }//GEN-LAST:event_butDroitMouseClicked

    private void butHautMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butHautMouseClicked
        // TODO add your handling code here:
        //Déplacement vers le haut
        menu.seDeplacer('Z');
    }//GEN-LAST:event_butHautMouseClicked

    private void butGaucheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butGaucheMouseClicked
        // TODO add your handling code here:
        //déplacement vers la gauche
        menu.seDeplacer('Q');
    }//GEN-LAST:event_butGaucheMouseClicked

    private void butBasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butBasMouseClicked
        // TODO add your handling code here:
        // Déplacement vers le bas
        menu.seDeplacer('S');
    }//GEN-LAST:event_butBasMouseClicked

    private void afficherConstructionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afficherConstructionActionPerformed
       // afficher les construction
        Outils.affichage(partie.getMaVille().afficherConstruction(), 1, this);               // TODO add your handling code here:
    }//GEN-LAST:event_afficherConstructionActionPerformed

    private void fouillerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fouillerMouseClicked
        // TODO add your handling code here:
        // fonction pour fouiller la case
        if(!partie.getGrille().getTabCase().get(partie.getJoueurActuel().getIndiceCase()).getFouillee()){
        menu.fouillerCase(JOptionPane.showConfirmDialog(null,Journal.consulterDescription(70))==0);
        Outils.affichage(partie.getGrille().getTabCase().get(partie.getJoueurActuel().getIndiceCase()).afficherItems(), 1, this);
          partie.getJoueurActuel().getCarteJoueur().add(partie.getJoueurActuel().getIndiceCase()+":"+partie.getGrille().getTabCase().get(partie.getJoueurActuel().getIndiceCase()).itemCarte());
          partie.getMonInterface().getButCarte().setText("|"+partie.getGrille().getTabCase().get(partie.getJoueurActuel().getIndiceCase()).itemCarte()+"|");
        }else{        
            Outils.affichage(partie.getGrille().getTabCase().get(partie.getJoueurActuel().getIndiceCase()).afficherItems(), 1, this);
          partie.getJoueurActuel().getCarteJoueur().add(partie.getJoueurActuel().getIndiceCase()+":"+partie.getGrille().getTabCase().get(partie.getJoueurActuel().getIndiceCase()).itemCarte());
          partie.getMonInterface().getButCarte().setText("|"+partie.getGrille().getTabCase().get(partie.getJoueurActuel().getIndiceCase()).itemCarte()+"|");
        }
    }//GEN-LAST:event_fouillerMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        menu.attaquerZombies();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void butCarteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butCarteMouseClicked
        // TODO add your handling code here:
        ImagePanel panel = new ImagePanel("images/map.JPG");
        jTextPane1.setText(Journal.voirCarte(partie.getMonJournal()));
        jFrame1.getContentPane().add(panel, BorderLayout.CENTER);
        jTextPane1.setText(Journal.voirCarte(partie.getMonJournal()));
        jFrame1.setVisible(true);
    }//GEN-LAST:event_butCarteMouseClicked

    private void consulterEntrepotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulterEntrepotActionPerformed
      //afficher entrepot
        Outils.affichage(partie.getMaVille().consulterEntrepot(), 1, this);    // TODO add your handling code here:
    }//GEN-LAST:event_consulterEntrepotActionPerformed

    private void interagirPorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interagirPorteActionPerformed
       // choix fermeture ou de l'ouverture de la porte
        menu.setConsommationDePA(partie.getMaVille().ouverturePorte(partie));
       menu.consommerPA();// TODO add your handling code here:
    }//GEN-LAST:event_interagirPorteActionPerformed

    private void CalculerDefensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculerDefensesActionPerformed
       // calcule des défence total en fonction des construction et de la porte
        Outils.affichage(partie.getMaVille().consulterDefense(), 1, this);
        this.defense.setText(""+partie.getMaVille().getTauxDefense());// TODO add your handling code here:
    }//GEN-LAST:event_CalculerDefensesActionPerformed

    private void participerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_participerActionPerformed
        // participer à la construction d'un batiment
        Outils.affichage(partie.getMaVille().afficherConstructionEnCours(), 1, this);
        partie.getMaVille().accederAuChantier(partie,Outils.donnerReponseChiffre(partie.getMaVille().getBatimentEnCours().size()-1, partie, JOptionPane.showInputDialog("Dans quel batiment souhaitez vous investir?")));
    }//GEN-LAST:event_participerActionPerformed

    private void construireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_construireActionPerformed
        // choix de la construction
        Outils.affichage(Journal.consulterConstruction(partie.getMonJournal()),1,this);
        if(Outils.affichage("Que souhaitez vous construire ?",0, this)==0){
                partie.getMaVille().construire(partie,Outils.donnerReponseChiffre(partie.getMaVille().getBatiment().size()-1, partie, JOptionPane.showInputDialog(Journal.consulterDescription(36))));
        }// TODO add your handling code here:
    }//GEN-LAST:event_construireActionPerformed
    
    public void accederObjetCase(int i){
        // accéder à objet de la case
        if(partie.getJoueurActuel().getIndiceCase()==338){
        switch(i){
            case 0: this.item1.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/ration.png")));
                    this.item1.setToolTipText("Il y a "+partie.getMaVille().getEntrepot()[0].getQuantite()+" rations dans l'entrepôt./En cliquant sur l'icone vous pourrez prendre une ration.");
                    break;
            case 1: this.item1.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/planche.png")));
                    this.item1.setToolTipText("Il y a "+partie.getMaVille().getEntrepot()[1].getQuantite()+" planches dans l'entrepôt. Vous ne pouvez pas prendre cette objet.");
                    break;
            case 2: this.item1.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/clou.png")));
                    this.item1.setToolTipText("Il y a "+partie.getMaVille().getEntrepot()[2].getQuantite()+" plaques de métal dans l'entrepôt. Vous ne pouvez pas prendre cette objet.");
                    break;
            case 3: this.item1.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/soft.png")));
                    this.item1.setToolTipText("Il y a "+partie.getMaVille().getEntrepot()[3].getQuantite()+" boissons énergissantes dans l'entrepôt./En cliquant sur l'icone vous pourrez prendre une boisson énergissante.");
                    break;
            case 4: this.item1.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/gourde.png")));
                    this.item1.setToolTipText("En cliquant sur l'icone vous pourrez prendre une gourdes.");
                    break;
            default: this.item1.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/vide.png")));
                     this.item1.setToolTipText("Vous ne pouvez pas prendre cette objet.");
                    break;
                 }}else{
            switch(i){
            case 0: this.item1.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/ration.png")));
                    this.item1.setToolTipText("Vous ne pouvez pas trouver cet objet sur une case.");
                    break;
            case 1: this.item1.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/planche.png")));
                    this.item1.setToolTipText("Il y a "+partie.getGrille().getTabCase().get(partie.getJoueurActuel().getIndiceCase()).getItem().get(0).getQuantite()+" planches sur cette case. /En cliquant sur l'icone vous pourrez prendre une planche.");
                    break;
            case 2: this.item1.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/clou.png")));
                    this.item1.setToolTipText("Il y a "+partie.getGrille().getTabCase().get(partie.getJoueurActuel().getIndiceCase()).getItem().get(1).getQuantite()+" plaques de métal sur cette case. /En cliquant sur l'icone vous pourrez prendre une plaque de métal.");
                    break;
            case 3: this.item1.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/soft.png")));
                    this.item1.setToolTipText("Il y a "+partie.getGrille().getTabCase().get(partie.getJoueurActuel().getIndiceCase()).getItem().get(2).getQuantite()+" boissons énergissantes sur cette case./En cliquant sur l'icone vous pourrez prendre une boisson énergissante.");
                    break;
            case 4: this.item1.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/gourde.png")));
                    this.item1.setToolTipText("Vous ne pouvez pas trouver cet objet sur une case.");
                    break;
            default: this.item1.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/vide.png")));
                     this.item1.setToolTipText("Vous ne pouvez pas prendre cet objet.");
                    break;
            }
        }
    }
    
    public void accederObjetSac(int i){
        // permet de permuter l'objet à choisir
        int k=0,j=-1;boolean trouve=false;
        if(partie.getJoueurActuel().getIndiceCase()==338){
        
        switch(i){
            case 0: this.item.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/ration.png")));
                                        
                    while(k<partie.getJoueurActuel().getSac().size()&&!partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(12))){
                        if(partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(51))){j=k;trouve=true;}
                        k++;
                    }
                    if(j!=-1){
                        this.item.setToolTipText("Il y a "+partie.getJoueurActuel().getSac().get(j).getQuantite()+" ration dans le sac./En cliquant sur l'icone vous pourrez manger ou déposer une ration dans l'entrepôt.");
                    }
                    break;
            case 1: this.item.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/planche.png")));
                    while(k<partie.getJoueurActuel().getSac().size()&&!trouve){
                        if(partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(54))){j=k;trouve=true;}
                        k++;
                    }
                    if(j!=-1){
                        this.item.setToolTipText("Il y a "+partie.getJoueurActuel().getSac().get(j).getQuantite()+" planches dans le sac./En cliquant sur l'icone vous pourrez déposer une planche dans l'entrepôt.");
                    }
                    
                    break;
            case 2: this.item.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/clou.png")));
                    while(k<partie.getJoueurActuel().getSac().size()&&!trouve){
                        if(partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(55))){j=k;trouve=true;}
                        k++;
                    }
                    if(j!=-1){
                        this.item.setToolTipText("Il y a "+partie.getJoueurActuel().getSac().get(j).getQuantite()+" plaques de métal dans le sac./En cliquant sur l'icone vous pourrez déposer une plaque de métal dans l'entrepôt.");
                    }
                    
                    break;
            case 3: this.item.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/soft.png")));
                    while(k<partie.getJoueurActuel().getSac().size()&&!trouve){
                        if(partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(53))){j=k;trouve=true;}
                        k++;
                    }
                    if(j!=-1){
                        this.item.setToolTipText("Il y a "+partie.getJoueurActuel().getSac().get(j).getQuantite()+" boissons énergisantes dans le sac./En cliquant sur l'icone vous pourrez boire ou déposer une boisson énergisante dans l'entrepôt.");
                    }
                    
                    break;
            case 4: this.item.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/gourde.png")));
                    while(k<partie.getJoueurActuel().getSac().size()&&!trouve){
                        if(partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(52))){j=k;trouve=true;}
                        k++;
                    }
                    if(j!=-1){
                        this.item.setToolTipText("Il y a "+partie.getJoueurActuel().getSac().get(j).getQuantite()+" gourdes dans le sac./En cliquant sur l'icone vous pourrez boire ou jeter la gourde.");
                    }
                    break;
            default: this.item.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/vide.png")));
                     this.item.setToolTipText("Vous ne pouvez pas jeter cette objet.");
                    break;
                 }
        }else{
                
        switch(i){
            case 0: this.item.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/ration.png")));
                                        
                    while(k<partie.getJoueurActuel().getSac().size()&&!trouve){
                        if(partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(51))){j=k;trouve=true;}
                        k++;
                    }
                    if(j!=-1){
                        this.item.setToolTipText("Il y a "+partie.getJoueurActuel().getSac().get(j).getQuantite()+" ration dans le sac./En cliquant sur l'icone vous pourrez manger ou jeter la ration.");
                    }
                    break;
            case 1: this.item.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/planche.png")));
                    while(k<partie.getJoueurActuel().getSac().size()&&!trouve){
                        if(partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(54))){j=k;trouve=true;}
                        k++;
                    }
                    if(j!=-1){
                        this.item.setToolTipText("Il y a "+partie.getJoueurActuel().getSac().get(j).getQuantite()+" planches dans le sac./En cliquant sur l'icone vous pourrez déposer une planche sur la case.");
                    }
                    
                    break;
            case 2: this.item.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/clou.png")));
                    while(k<partie.getJoueurActuel().getSac().size()&&!trouve){
                        if(partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(55))){j=k;trouve=true;}
                        k++;
                        
                    }
                    if(j!=-1){
                        this.item.setToolTipText("Il y a "+partie.getJoueurActuel().getSac().get(j).getQuantite()+" plaques de métal dans le sac./En cliquant sur l'icone vous pourrez déposer une plaque de métal sur la case.");
                    }
                    
                    break;
            case 3: this.item.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/soft.png")));
                    while(k<partie.getJoueurActuel().getSac().size()&&!trouve){
                        if(partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(53))){j=k;trouve=true;}
                        k++;
                    }
                    if(j!=-1){
                        this.item.setToolTipText("Il y a "+partie.getJoueurActuel().getSac().get(j).getQuantite()+" boissons énergisantes dans le sac./En cliquant sur l'icone vous pourrez boire ou déposer une boisson énergisante sur la case.");
                    }
                    
                    break;
            case 4: this.item.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/gourde.png")));
                    while(k<partie.getJoueurActuel().getSac().size()&&!trouve){
                        if(partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(52))){j=k;trouve=true;}
                        k++;
                    }
                    if(j!=-1){
                        this.item.setToolTipText("Il y a "+partie.getJoueurActuel().getSac().get(j).getQuantite()+" gourdes dans le sac./En cliquant sur l'icone vous pourrez boire ou jeter la gourde.");
                    }
                    break;
            default: this.item.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/vide.png")));
                     this.item.setToolTipText("Vous ne pouvez pas jeter cette objet.");
                    break;
                 }
        }
    }
    
    public void demarrerViderSac(){
        // fonction pour vider le sac
    int k=0,j=-1;boolean trouve=false;
        switch(cptSac){
            case 0: System.out.println("Je suis ici Ration "+cptCase+" "+partie.getJoueurActuel().getSac().size());
                    while(k<partie.getJoueurActuel().getSac().size()&&!trouve){
                        if(partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(51))){
                            j=k;
                            trouve=true;
                        }
                        k++;
                    }
                    if(j!=-1){partie.getJoueurActuel().outilViderSac(partie.getJoueurActuel().getIndiceCase()!=338,j,partie);
                    getNbRation().setText(""+(Integer.parseInt(getNbRation().getText())-1));
                    }
                    
                    break;
            case 1: System.out.println("Je suis ici Planche "+cptCase+" "+partie.getJoueurActuel().getSac().size());
                    while(k<partie.getJoueurActuel().getSac().size()&&!trouve){
                        if(partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(54))){
                            j=k;
                            trouve=true;
                        }
                        k++;
                    }
                    if(j!=-1){partie.getJoueurActuel().outilViderSac(partie.getJoueurActuel().getIndiceCase()!=338,j,partie);
                    getNbPlanche().setText(""+(Integer.parseInt(getNbPlanche().getText())-1));
                    }
                    break;
            case 2: System.out.println("Je suis ici Clou "+cptCase+" "+partie.getJoueurActuel().getSac().size());
                while(k<partie.getJoueurActuel().getSac().size()&&!trouve){
                        if(partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(55))){
                            j=k;
                            trouve=true;
                        }
                        k++;
                    }
                    if(j!=-1){partie.getJoueurActuel().outilViderSac(partie.getJoueurActuel().getIndiceCase()!=338,j,partie);
                    getNbClou().setText(""+(Integer.parseInt(getNbClou().getText())-1));
                    }
                    break;
            case 3: System.out.println("Je suis ici Boisson "+cptCase+" "+partie.getJoueurActuel().getSac().size());
                    while(k<partie.getJoueurActuel().getSac().size()&&!trouve){
                        if(partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(53))){
                            j=k;
                            trouve=true;
                        }
                        k++;
                    }
                    if(j!=-1){partie.getJoueurActuel().outilViderSac(partie.getJoueurActuel().getIndiceCase()!=338,j,partie);
                    getNbEnergie().setText(""+(Integer.parseInt(getNbEnergie().getText())-1));
                    }
                    break;
            case 4: System.out.println("Je suis ici Gourde "+cptCase+" "+partie.getJoueurActuel().getSac().size());
                    while(k<partie.getJoueurActuel().getSac().size()&&!trouve){
                        if(partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(52))){
                            j=k;
                            trouve=true;
                        }
                        k++;
                    }
                    if(j!=-1){partie.getJoueurActuel().outilViderSac(partie.getJoueurActuel().getIndiceCase()!=338,j,partie);
                    getNbGourde().setText(""+(Integer.parseInt(getNbGourde().getText())-1));
                    }
                    break;
            
        }
        
    
    }
    
    public void demarrerPrendreObjet(){
        // méthode pour prendre un objet
        if(partie.getJoueurActuel().getIndiceCase()==338){
            if(cptCase==0||cptCase==3){
                if(cptCase==0){
                    menu.accesObjet(JOptionPane.showConfirmDialog(rootPane,(Journal.consulterDescription(17)))==0,1,partie);
                }else{
                    menu.accesObjet(JOptionPane.showConfirmDialog(rootPane,(Journal.consulterDescription(18)))==0,cptCase,partie);
                }
            }else{
                if(cptCase==4){
                    menu.prendreGourde((JOptionPane.showConfirmDialog(rootPane,(Journal.consulterDescription(20)))==0));
                }
            }
        }else{
            if(partie.getGrille().getTabCase().get(partie.getJoueurActuel().getIndiceCase()).getNbZombiesRestants()==0){
                if(cptCase!=0&&cptCase!=4){
                    if(partie.getGrille().getTabCase().get(partie.getJoueurActuel().getIndiceCase()).getItem().get(cptCase-1).getQuantite()>0){
                        menu.prendreObjetCase(cptCase);
                    }
                }
            }else{
                Outils.affichage(Journal.consulterDescription(7), this);
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(HordeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HordeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HordeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HordeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HordeInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CalculerDefenses;
    private javax.swing.JProgressBar LifeProgressBar;
    private javax.swing.JProgressBar PAProgressBar;
    private javax.swing.JRadioButton afficherConstruction;
    private javax.swing.JRadioButton afficherRegle;
    private javax.swing.JRadioButton afficherResume;
    private javax.swing.ButtonGroup bgEcranA;
    private javax.swing.ButtonGroup boutonRadio;
    private javax.swing.JLabel butBas;
    private javax.swing.JLabel butBois;
    private javax.swing.JLabel butCarte;
    private javax.swing.JLabel butClou;
    private javax.swing.JLabel butDroit;
    private javax.swing.JLabel butGauche;
    private javax.swing.JLabel butGourde;
    private javax.swing.JLabel butHaut;
    private javax.swing.JLabel butPlan;
    private javax.swing.JLabel butRation;
    private javax.swing.JLabel butTalki;
    private javax.swing.JRadioButton construire;
    private javax.swing.JRadioButton consulterEntrepot;
    private javax.swing.JRadioButton continuer;
    private javax.swing.JLabel defense;
    private javax.swing.JRadioButton demarrer;
    private javax.swing.JPanel ecranAccueil;
    private javax.swing.JPanel ecranTitre;
    private javax.swing.JButton entrer;
    private javax.swing.JPanel exterieur;
    private javax.swing.JButton finirTour;
    private javax.swing.JLabel fondMini;
    private javax.swing.JRadioButton fouiller;
    private javax.swing.JPanel hub;
    private javax.swing.JLabel indJour;
    private javax.swing.JLabel indJournal;
    private javax.swing.JLabel indObjet;
    private javax.swing.JLabel indTour;
    private javax.swing.JLabel indcoor;
    private javax.swing.JLabel indsac;
    private javax.swing.JRadioButton interagirPorte;
    private javax.swing.JPanel interieur;
    private javax.swing.JLabel item;
    private javax.swing.JLabel item1;
    private javax.swing.JLabel itemDroit;
    private javax.swing.JLabel itemDroit1;
    private javax.swing.JLabel itemGauche;
    private javax.swing.JLabel itemGauche1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel jour;
    private javax.swing.JLabel lJournal;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel miniMap;
    private javax.swing.JLabel nbClou;
    private javax.swing.JLabel nbEnergie;
    private javax.swing.JLabel nbGourde;
    private javax.swing.JLabel nbObjet;
    private javax.swing.JLabel nbPlanche;
    private javax.swing.JLabel nbRation;
    private javax.swing.JLabel nomJoueur;
    private javax.swing.JPanel pJournal;
    private javax.swing.JTextPane page1;
    private javax.swing.JLabel page2;
    private javax.swing.JRadioButton participer;
    private javax.swing.JLabel pointAction;
    private javax.swing.JLabel pointVie;
    private javax.swing.JLabel position;
    private javax.swing.JButton prendreObjet;
    private javax.swing.JButton prendreObjet1;
    private javax.swing.JRadioButton quitter;
    private javax.swing.JLabel tour;
    // End of variables declaration//GEN-END:variables
}
