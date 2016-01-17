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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
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

    public JLabel getMapIcone() {
        return MapIcone;
    }

    public void setMapIcone(JLabel MapIcone) {
        this.MapIcone = MapIcone;
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
        return jRadioButton1;
    }

    public void setjRadioButton1(JRadioButton jRadioButton1) {
        this.jRadioButton1 = jRadioButton1;
    }

    public JRadioButton getjRadioButton2() {
        return jRadioButton2;
    }

    public void setjRadioButton2(JRadioButton jRadioButton2) {
        this.jRadioButton2 = jRadioButton2;
    }

    public JRadioButton getjRadioButton3() {
        return jRadioButton3;
    }

    public void setjRadioButton3(JRadioButton jRadioButton3) {
        this.jRadioButton3 = jRadioButton3;
    }

    public JRadioButton getjRadioButton4() {
        return jRadioButton4;
    }

    public void setjRadioButton4(JRadioButton jRadioButton4) {
        this.jRadioButton4 = jRadioButton4;
    }

    public JRadioButton getjRadioButton5() {
        return jRadioButton5;
    }

    public void setjRadioButton5(JRadioButton jRadioButton5) {
        this.jRadioButton5 = jRadioButton5;
    }

    public JRadioButton getjRadioButton6() {
        return jRadioButton6;
    }

    public void setjRadioButton6(JRadioButton jRadioButton6) {
        this.jRadioButton6 = jRadioButton6;
    }

    public JRadioButton getjRadioButton7() {
        return jRadioButton7;
    }

    public void setjRadioButton7(JRadioButton jRadioButton7) {
        this.jRadioButton7 = jRadioButton7;
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

    public JLabel getPage1() {
        return page1;
    }

    public void setPage1(JLabel page1) {
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
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        MapIcone = new javax.swing.JLabel();
        bgEcranA = new javax.swing.ButtonGroup();
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
        page1 = new javax.swing.JLabel();
        page2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
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

        MapIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/map.gif"))); // NOI18N
        jFrame1.getContentPane().add(MapIcone, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Horde");
        setMinimumSize(new java.awt.Dimension(1080, 530));
        setPreferredSize(new java.awt.Dimension(1080, 530));
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
        PAProgressBar.setValue(10);
        PAProgressBar.setName("PA/100"); // NOI18N
        hub.add(PAProgressBar);
        PAProgressBar.setBounds(900, 320, 148, 30);
        PAProgressBar.getAccessibleContext().setAccessibleName("");

        LifeProgressBar.setToolTipText("");
        LifeProgressBar.setValue(100);
        hub.add(LifeProgressBar);
        LifeProgressBar.setBounds(900, 380, 148, 30);

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

        pointAction.setText("Points d'action:");
        hub.add(pointAction);
        pointAction.setBounds(900, 300, 130, 15);

        pointVie.setText("Points de vie:");
        hub.add(pointVie);
        pointVie.setBounds(900, 360, 120, 15);

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
        butClou.setMaximumSize(new java.awt.Dimension(46, 46));
        butClou.setMinimumSize(new java.awt.Dimension(46, 46));
        butClou.setPreferredSize(new java.awt.Dimension(46, 46));
        butClou.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butClouMouseClicked(evt);
            }
        });
        hub.add(butClou);
        butClou.setBounds(980, 30, 46, 50);

        indsac.setText("Sac:");
        hub.add(indsac);
        indsac.setBounds(960, 10, 30, 15);

        butTalki.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/talkie.png"))); // NOI18N
        butTalki.setToolTipText("Mettre à jour la carte");
        butTalki.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butTalkiMouseClicked(evt);
            }
        });
        hub.add(butTalki);
        butTalki.setBounds(30, 280, 60, 200);

        jLabel1.setText("Déplacement:");
        hub.add(jLabel1);
        jLabel1.setBounds(60, 0, 110, 15);

        indcoor.setText("Position joueur:");
        hub.add(indcoor);
        indcoor.setBounds(10, 200, 120, 15);

        finirTour.setText("Finir tour");
        finirTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finirTourActionPerformed(evt);
            }
        });
        hub.add(finirTour);
        finirTour.setBounds(900, 430, 150, 50);

        indJournal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indJournal.setText("Journal");
        indJournal.setMaximumSize(new java.awt.Dimension(35, 16));
        hub.add(indJournal);
        indJournal.setBounds(530, 50, 90, 30);

        miniMap.setEnabled(false);
        miniMap.setMinimumSize(new java.awt.Dimension(180, 180));
        miniMap.setOpaque(false);
        miniMap.setPreferredSize(new java.awt.Dimension(180, 180));

        butHaut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/up.png"))); // NOI18N

        butDroit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/right.png"))); // NOI18N

        butGauche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/left.png"))); // NOI18N

        butBas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/down.png"))); // NOI18N

        butCarte.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        butCarte.setForeground(new java.awt.Color(255, 255, 255));
        butCarte.setText(" |          | ");

        javax.swing.GroupLayout miniMapLayout = new javax.swing.GroupLayout(miniMap);
        miniMap.setLayout(miniMapLayout);
        miniMapLayout.setHorizontalGroup(
            miniMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miniMapLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(butHaut)
                .addContainerGap(72, Short.MAX_VALUE))
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

        page1.setText("jLabel12");

        page2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        page2.setText("Que souhaitez vous faire ?");
        page2.setMaximumSize(new java.awt.Dimension(35, 16));

        jRadioButton1.setText("Résumé du jeu");

        jRadioButton2.setText("Règle du jeu");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Liste des constructions");

        jRadioButton4.setText("Construire");

        jRadioButton5.setText("Participer au chantier");

        jRadioButton6.setText("Consulter l'entrepôt");

        jRadioButton7.setText("intéragir avec la porte");

        javax.swing.GroupLayout pJournalLayout = new javax.swing.GroupLayout(pJournal);
        pJournal.setLayout(pJournalLayout);
        pJournalLayout.setHorizontalGroup(
            pJournalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pJournalLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(page1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(page2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pJournalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pJournalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5))
                .addGap(68, 68, 68))
        );
        pJournalLayout.setVerticalGroup(
            pJournalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pJournalLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pJournalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(page1)
                    .addComponent(page2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addGap(3, 3, 3)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton7)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        hub.add(pJournal);
        pJournal.setBounds(280, 80, 610, 400);

        nomJoueur.setFont(new java.awt.Font("Liberation Sans Narrow", 0, 24)); // NOI18N
        nomJoueur.setText("jLabel2");
        hub.add(nomJoueur);
        nomJoueur.setBounds(370, 10, 90, 30);

        tour.setText("jLabel3");
        hub.add(tour);
        tour.setBounds(670, 20, 51, 15);

        jour.setText("jLabel4");
        hub.add(jour);
        jour.setBounds(830, 20, 51, 15);

        indTour.setText("tour(s):");
        hub.add(indTour);
        indTour.setBounds(610, 20, 53, 15);

        indJour.setText("Jour(s):");
        hub.add(indJour);
        indJour.setBounds(770, 20, 60, 15);

        position.setText("jLabel2");
        hub.add(position);
        position.setBounds(140, 200, 51, 15);

        itemGauche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/left.png"))); // NOI18N
        itemGauche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemGaucheMouseClicked(evt);
            }
        });

        item.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/vide.png"))); // NOI18N
        item.setMaximumSize(new java.awt.Dimension(46, 46));
        item.setMinimumSize(new java.awt.Dimension(46, 46));
        item.setPreferredSize(new java.awt.Dimension(46, 46));
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

        prendreObjet.setText("Jeter");
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
                .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemDroit, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(itemGauche, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(22, 22, 22)
                .addComponent(prendreObjet))
        );

        hub.add(jPanel1);
        jPanel1.setBounds(900, 190, 150, 110);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/zombie.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(130, 179));
        jLabel3.setMinimumSize(new java.awt.Dimension(130, 179));
        jLabel3.setPreferredSize(new java.awt.Dimension(130, 179));
        hub.add(jLabel3);
        jLabel3.setBounds(130, 220, 130, 160);

        itemGauche1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/left.png"))); // NOI18N
        itemGauche1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemGauche1MouseClicked(evt);
            }
        });

        item1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/vide.png"))); // NOI18N
        item1.setMaximumSize(new java.awt.Dimension(46, 46));
        item1.setMinimumSize(new java.awt.Dimension(46, 46));
        item1.setPreferredSize(new java.awt.Dimension(46, 46));
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

        prendreObjet1.setText("Prendre");
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
                .addContainerGap(17, Short.MAX_VALUE)
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
        fondMini.setMaximumSize(new java.awt.Dimension(180, 180));
        fondMini.setMinimumSize(new java.awt.Dimension(180, 180));
        fondMini.setPreferredSize(new java.awt.Dimension(180, 180));
        hub.add(fondMini);
        fondMini.setBounds(20, 20, 180, 180);

        lJournal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hordegraphique/images/Journal.png"))); // NOI18N
        hub.add(lJournal);
        lJournal.setBounds(280, 90, 610, 390);

        indObjet.setText("/10");
        hub.add(indObjet);
        indObjet.setBounds(1000, 160, 30, 15);

        nbObjet.setText("10");
        hub.add(nbObjet);
        nbObjet.setBounds(980, 160, 20, 15);

        nbEnergie.setText("10");
        hub.add(nbEnergie);
        nbEnergie.setBounds(910, 120, 20, 15);

        nbPlanche.setText("10");
        hub.add(nbPlanche);
        nbPlanche.setBounds(910, 60, 20, 15);

        nbGourde.setText("10");
        hub.add(nbGourde);
        nbGourde.setBounds(910, 170, 20, 15);

        nbRation.setText("10");
        hub.add(nbRation);
        nbRation.setBounds(1010, 120, 20, 15);

        nbClou.setText("10");
        hub.add(nbClou);
        nbClou.setBounds(1010, 60, 20, 15);

        getContentPane().add(hub);
        hub.setBounds(10, 0, 1080, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prendreObjetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prendreObjetMouseClicked
        // TODO add your handling code here: // Boutton afficher carte
    }//GEN-LAST:event_prendreObjetMouseClicked

    private void butTalkiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butTalkiMouseClicked
        // TODO add your handling code here: // Talkie
    }//GEN-LAST:event_butTalkiMouseClicked

    private void butClouMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butClouMouseClicked
        // TODO add your handling code here:// POUR CLOU
    }//GEN-LAST:event_butClouMouseClicked

    private void butPlanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butPlanMouseClicked
        // TODO add your handling code here:// POUR LES PLANCHES
    }//GEN-LAST:event_butPlanMouseClicked

    private void butBoisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butBoisMouseClicked
        // TODO add your handling code here:// boisson énergisante
    }//GEN-LAST:event_butBoisMouseClicked

    private void butRationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butRationMouseClicked
        // TODO add your handling code here: POUR LES RATIONS
    }//GEN-LAST:event_butRationMouseClicked

    private void butGourdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butGourdeMouseClicked
        // TODO add your handling code here: POUR LES GOURDES
    }//GEN-LAST:event_butGourdeMouseClicked

    private void itemDroitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemDroitMouseClicked
        // TODO add your handling code here:
        if(partie.getJoueurActuel().getSac().isEmpty()){cptSac=-1;}else{
        cptSac+=1;
        if(cptSac>4){
        cptSac=0;
        }
        accederObjetSac(cptSac);}
    }//GEN-LAST:event_itemDroitMouseClicked

    private void itemGaucheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemGaucheMouseClicked
        // TODO add your handling code here:
        if(partie.getJoueurActuel().getSac().isEmpty()){cptSac=-1;}else{cptSac-=1;
            if(cptSac<0){
                cptSac=4;
            }
        }
        accederObjetSac(cptSac);
    }//GEN-LAST:event_itemGaucheMouseClicked

    private void continuerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuerActionPerformed
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
        // TODO add your handling code here:
        this.ecranTitre.setVisible(true);
        this.ecranAccueil.setVisible(false);
            
            
            this.hub.setVisible(false);
        if(!partieDemarree){
                partie=new Jeu();
                partie.lancerJeu(this);
                menu=partie.getMenuPartie();
            }
        
            if(!isNbJoueurSet){
                String str="";
                while(partie.getNombreJoueur()==0){
                    while(str.isEmpty()||str.equals(null)){
                            str=JOptionPane.showInputDialog(Journal.consulterDescription(57));
                    }
                    partie.setNombreJoueur(Outils.conversionInt(str,partie));   
                }
                copieNbJoueur=0;
                while(copieNbJoueur<partie.getNombreJoueur()){
                    String nomJoueur="";
                    while(nomJoueur.isEmpty()||str.equals(null)){
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
        //this.jLabel2.setText(Journal.consulterDescription(56));
        this.ecranTitre.setVisible(true);
        this.ecranAccueil.setVisible(false);
        this.hub.setVisible(false);
        
        this.bgEcranA.add(demarrer);
        this.bgEcranA.add(continuer);
        this.bgEcranA.add(quitter);
        
    }//GEN-LAST:event_formWindowOpened

    private void quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showInputDialog(JOptionPane.showConfirmDialog(rootPane, "Etes vous sur de vouloir quitter ?"));
        if(JOptionPane.showConfirmDialog(rootPane, "Etes vous sur de vouloir quitter ?")==0){
            Menu.quitter();
        }
    }//GEN-LAST:event_quitterActionPerformed

    private void demarrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demarrerActionPerformed
        // TODO add your handling code here:
        
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
    }//GEN-LAST:event_finirTourActionPerformed

    private void itemGauche1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemGauche1MouseClicked
        // TODO add your handling code here:
        cptCase-=1;
        if(cptCase<0){
        cptCase=4;
        }
        accederObjetCase(cptCase);
    }//GEN-LAST:event_itemGauche1MouseClicked

    private void itemDroit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemDroit1MouseClicked
        // TODO add your handling code here:
        cptCase+=1;
        if(cptCase>4){
        cptCase=0;
        }
        accederObjetCase(cptCase);
        
    }//GEN-LAST:event_itemDroit1MouseClicked

    private void prendreObjet1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prendreObjet1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_prendreObjet1MouseClicked

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
        demarrerViderSac();
    }//GEN-LAST:event_prendreObjetActionPerformed
    
    public void accederObjetCase(int i){
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
                                        
                    while(k<partie.getJoueurActuel().getSac().size()||partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(12))){
                        if(partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(51))){j=k;}
                        k++;
                    }
                    if(j!=-1){
                        this.item.setToolTipText("Il y a "+partie.getJoueurActuel().getSac().get(j).getQuantite()+" ration dans le sac./En cliquant sur l'icone vous pourrez manger ou jeter la ration.");
                    }
                    break;
            case 1: this.item.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/planche.png")));
                    while(k<partie.getJoueurActuel().getSac().size()||partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(54))){
                        if(partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(54))){j=k;}
                        k++;
                    }
                    if(j!=-1){
                        this.item.setToolTipText("Il y a "+partie.getJoueurActuel().getSac().get(j).getQuantite()+" planches dans le sac./En cliquant sur l'icone vous pourrez déposer une planche sur la case.");
                    }
                    
                    break;
            case 2: this.item.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/clou.png")));
                    while(k<partie.getJoueurActuel().getSac().size()||partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(55))){
                        if(partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(55))){j=k;}
                        k++;
                    }
                    if(j!=-1){
                        this.item.setToolTipText("Il y a "+partie.getJoueurActuel().getSac().get(j).getQuantite()+" plaques de métal dans le sac./En cliquant sur l'icone vous pourrez déposer une plaque de métal sur la case.");
                    }
                    
                    break;
            case 3: this.item.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/soft.png")));
                    while(k<partie.getJoueurActuel().getSac().size()||partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(53))){
                        if(partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(53))){j=k;}
                        k++;
                    }
                    if(j!=-1){
                        this.item.setToolTipText("Il y a "+partie.getJoueurActuel().getSac().get(j).getQuantite()+" boissons énergisantes dans le sac./En cliquant sur l'icone vous pourrez boire ou déposer une boisson énergisante sur la case.");
                    }
                    
                    break;
            case 4: this.item.setIcon(new ImageIcon(getClass().getResource("/hordegraphique/images/gourde.png")));
                    while(k<partie.getJoueurActuel().getSac().size()||partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(52))){
                        if(partie.getJoueurActuel().getSac().get(k).getNom().equals(Journal.consulterDescription(52))){j=k;}
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
    int k=0,j=-1;boolean trouve=false;
        switch(cptCase){
            case 0: while(k<partie.getJoueurActuel().getSac().size()&&!trouve){
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
            case 1: while(k<partie.getJoueurActuel().getSac().size()&&!trouve){
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
            case 2: while(k<partie.getJoueurActuel().getSac().size()&&!trouve){
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
            case 3: while(k<partie.getJoueurActuel().getSac().size()&&!trouve){
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
            case 4: while(k<partie.getJoueurActuel().getSac().size()&&!trouve){
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
        if(partie.getJoueurActuel().getIndiceCase()==338){if(cptCase==0||cptCase==3){if(cptCase==0){menu.accesObjet(JOptionPane.showConfirmDialog(rootPane,(Journal.consulterDescription(17)))==0,1,partie);}else{menu.accesObjet(JOptionPane.showConfirmDialog(rootPane,(Journal.consulterDescription(18)))==0,cptCase,partie);}}else{if(cptCase==4){menu.prendreGourde((JOptionPane.showConfirmDialog(rootPane,(Journal.consulterDescription(20)))==0));}}}else{menu.prendreObjet(cptCase);}
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
    private javax.swing.JProgressBar LifeProgressBar;
    private javax.swing.JLabel MapIcone;
    private javax.swing.JProgressBar PAProgressBar;
    private javax.swing.ButtonGroup bgEcranA;
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
    private javax.swing.JRadioButton continuer;
    private javax.swing.JRadioButton demarrer;
    private javax.swing.JPanel ecranAccueil;
    private javax.swing.JPanel ecranTitre;
    private javax.swing.JButton entrer;
    private javax.swing.JButton finirTour;
    private javax.swing.JLabel fondMini;
    private javax.swing.JPanel hub;
    private javax.swing.JLabel indJour;
    private javax.swing.JLabel indJournal;
    private javax.swing.JLabel indObjet;
    private javax.swing.JLabel indTour;
    private javax.swing.JLabel indcoor;
    private javax.swing.JLabel indsac;
    private javax.swing.JLabel item;
    private javax.swing.JLabel item1;
    private javax.swing.JLabel itemDroit;
    private javax.swing.JLabel itemDroit1;
    private javax.swing.JLabel itemGauche;
    private javax.swing.JLabel itemGauche1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
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
    private javax.swing.JLabel page1;
    private javax.swing.JLabel page2;
    private javax.swing.JLabel pointAction;
    private javax.swing.JLabel pointVie;
    private javax.swing.JLabel position;
    private javax.swing.JButton prendreObjet;
    private javax.swing.JButton prendreObjet1;
    private javax.swing.JRadioButton quitter;
    private javax.swing.JLabel tour;
    // End of variables declaration//GEN-END:variables
}
