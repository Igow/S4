import javax.swing.*; // Pour les composants graphiques que l'on ajoutera dans la methode creerWidgetVersion1
import java.awt.*;    // Pour la JFrame


public class Fenetre extends JFrame {
    
    //Declaration des composant modifables
    JTextField tfAnglais;
    JRadioButton radAnglais1, radAnglais2, radAnglais3;
    
    JTextField tfMaths;
    JRadioButton radMaths1, radMaths2, radMaths3;
    
    JTextField tfInfo;
    JRadioButton radInfo1, radInfo2, radInfo3;

    JTextField tfGeo;
    JRadioButton radGeo1, radGeo2, radGeo3;
    
    String[] tabOption;
    JComboBox comboOption;    
    JTextField tfOption;
    
    JCheckBox cbCoef;
    
    public Fenetre() {
        
        initAttribut();
        creerWidgetVersion1();
        
        //setSize(200,200);                             // Fixe la taille par defaut
        pack();                                         // Adapte la automatiquement
        setVisible(true);                               // Affiche la fenetre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Gestion de la fermeture
    }
    

    public void initAttribut(){
        
        tfAnglais = new JTextField();
        
        radAnglais1 = new JRadioButton("1",true);
        radAnglais2 = new JRadioButton("2",false);
        radAnglais3 = new JRadioButton("3",false);
        
        tfMaths = new JTextField();
        
        radMaths1 = new JRadioButton("1",true);
        radMaths2 = new JRadioButton("2",false);
        radMaths3 = new JRadioButton("3",false);
        
        tfInfo = new JTextField();
        
        radInfo1 = new JRadioButton("1",true);
        radInfo2 = new JRadioButton("2",false);
        radInfo3 = new JRadioButton("3",false);
        
        tfGeo = new JTextField();

        radGeo1 = new JRadioButton("1",true);
        radGeo2 = new JRadioButton("2",false);
        radGeo3 = new JRadioButton("3",false);
        
        tabOption = new String[]{"Latin","Grec","Sport"};
        comboOption = new JComboBox(tabOption);
        tfOption = new JTextField();
        
        cbCoef = new JCheckBox("Prendre en consideration les coefficients", true);
        
    }


    public void creerWidgetVersion1() {
        
        JPanel pano = new JPanel();
        pano.setLayout(new BoxLayout(pano, BoxLayout.Y_AXIS));
        
        JPanel matieres = new JPanel();
        matieres.setLayout(new BoxLayout(matieres, BoxLayout.Y_AXIS));
        
        // ANGLAIS
        JPanel panAnglais = new JPanel();
        JLabel labAnglais = new JLabel("Anglais");
        panAnglais.add(labAnglais);
        
        tfAnglais.setColumns(10);
        panAnglais.add(tfAnglais);
        
        ButtonGroup groupAnglais = new ButtonGroup();
        groupAnglais.add(radAnglais1);
        groupAnglais.add(radAnglais2);
        groupAnglais.add(radAnglais3);
        
        panAnglais.add(radAnglais1);
        panAnglais.add(radAnglais2);
        panAnglais.add(radAnglais3);
        
        // MATHS
        JPanel panMaths = new JPanel();
        JLabel labMaths = new JLabel("Mathematiques");
        panMaths.add(labMaths);
        
        tfMaths.setColumns(10);
        panMaths.add(tfMaths);
        
        ButtonGroup groupMaths = new ButtonGroup();
        groupMaths.add(radMaths1);
        groupMaths.add(radMaths2);
        groupMaths.add(radMaths3);
        
        panMaths.add(radMaths1);
        panMaths.add(radMaths2);
        panMaths.add(radMaths3);
        
        // INFO
        JPanel panInfo = new JPanel();
        JLabel labInfo = new JLabel("Informatique");
        panInfo.add(labInfo);
        
        tfInfo.setColumns(10);
        panInfo.add(tfInfo);
        
        ButtonGroup groupInfo = new ButtonGroup();
        groupInfo.add(radInfo1);
        groupInfo.add(radInfo2);
        groupInfo.add(radInfo3);
        
        panInfo.add(radInfo1);
        panInfo.add(radInfo2);
        panInfo.add(radInfo3);
        
        // GEO
        JPanel panGeo = new JPanel();
        JLabel labGeo = new JLabel("Geographie");
        panGeo.add(labGeo);
        
        tfGeo.setColumns(10);
        panGeo.add(tfGeo);
        
        ButtonGroup groupGeo = new ButtonGroup();
        groupGeo.add(radGeo1);
        groupGeo.add(radGeo2);
        groupGeo.add(radGeo3);
        
        panGeo.add(radGeo1);
        panGeo.add(radGeo2);
        panGeo.add(radGeo3);
        
        //Panel matieres regroupe Anglais Maths Info Geo
        matieres.add(panAnglais);
        matieres.add(panMaths);
        matieres.add(panInfo);
        matieres.add(panGeo);
        
        pano.add(matieres);
        
        // OPTION (LATIN GREC SPORT)
        JPanel panOption = new JPanel();
        
        tabOption = new String[]{"Latin","Grec","Sport"};
        comboOption = new JComboBox(tabOption);
        panOption.add(comboOption);
        
        tfOption = new JTextField();
        tfOption.setColumns(10);
        panOption.add(tfOption);
        
        JLabel labOption = new JLabel("Optionnel");
        panOption.add(labOption);
        
        pano.add(panOption);
        
        // Checkbox COEF
        JPanel panCoef = new JPanel();
        panCoef.add(cbCoef);
        pano.add(panCoef);
        
        //Boutons
        JPanel panMoy = new JPanel();
        JButton butMoy = new JButton("Moyenne");
        JLabel labMoy = new JLabel("Valeur");
        panMoy.add(butMoy);
        panMoy.add(labMoy);
        
        pano.add(panMoy);
        
        // Ajout du panel qui contiens tout à la fenetre principale
        setContentPane(pano);
        
    }
}