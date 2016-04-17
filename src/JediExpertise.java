import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Image;
import java.awt.Color;
import java.awt.Label;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class JediExpertise {

	private JFrame frmJediExpertise;
	
	private boolean addPoints = true;
	
	private int enhancedStr;
	private int enhancedCon;
	private int enhancedAgi;
	private int enhancedSta;
	private int availablePoints = 45;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JediExpertise window = new JediExpertise();
					window.frmJediExpertise.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JediExpertise() {
		initialize();
	}

	private void initialize() {
		frmJediExpertise = new JFrame();
		frmJediExpertise.getContentPane().setBackground(new Color(0, 128, 128));
		frmJediExpertise.setResizable(false);
		frmJediExpertise.setTitle("Jedi Expertise Calculator");
		frmJediExpertise.setBounds(100, 100, 1080, 720);
		frmJediExpertise.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJediExpertise.getContentPane().setLayout(null);
		
		JLabel strImg = new JLabel("");
		strImg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (enhancedStr < 2 && addPoints) {
					availablePoints--;
					enhancedStr++;
				}
				else if (enhancedStr > 0 && !addPoints) {
					availablePoints++;
					enhancedStr--;
				}
			}
		});
		if (enhancedStr == 0) {
			Image imgStr = new ImageIcon(this.getClass().getResource("/Jedi/First Row/Enhanced Strength/StrengthAvailable.png")).getImage();
			strImg.setIcon(new ImageIcon(imgStr));
		}
		strImg.setBounds(145, 43, 87, 87);
		frmJediExpertise.getContentPane().add(strImg);
		
		JLabel conImg = new JLabel("");
		conImg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (enhancedCon < 2 && addPoints) {
					availablePoints--;
					enhancedCon++;
					
					Image imgCon = new ImageIcon(this.getClass().getResource("/Jedi/First Row/Enhanced Constitution/ConSpent.png")).getImage();
					conImg.setIcon(new ImageIcon(imgCon));
				}
				else if (enhancedCon > 0 && !addPoints) {
					availablePoints++;
					enhancedCon--;
					
					if (enhancedCon == 0) {
						Image imgCon = new ImageIcon(this.getClass().getResource("/Jedi/First Row/Enhanced Constitution/ConAvailable.png")).getImage();
						conImg.setIcon(new ImageIcon(imgCon));
					}
				}
			}
		});
		if (enhancedCon == 0) {
			Image imgCon = new ImageIcon(this.getClass().getResource("/Jedi/First Row/Enhanced Constitution/ConAvailable.png")).getImage();
			conImg.setIcon(new ImageIcon(imgCon));
		}
		conImg.setBounds(303, 43, 87, 87);
		frmJediExpertise.getContentPane().add(conImg);
		
		JLabel agiImg = new JLabel("");
		agiImg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (enhancedAgi < 2 && addPoints) {
					availablePoints--;
					enhancedAgi++;
					
					Image imgAgi = new ImageIcon(this.getClass().getResource("/Jedi/First Row/Enhanced Agility/AgilitySpent.png")).getImage();
					agiImg.setIcon(new ImageIcon(imgAgi));
				}
				else if (enhancedAgi > 0 && !addPoints) {
					availablePoints++;
					enhancedAgi--;
					
					if (enhancedAgi == 0) {
						Image imgAgi = new ImageIcon(this.getClass().getResource("/Jedi/First Row/Enhanced Agility/AgilityAvailable.png")).getImage();
						agiImg.setIcon(new ImageIcon(imgAgi));
					}
				}
			}
		});
		if (enhancedAgi == 0) {
			Image imgAgi = new ImageIcon(this.getClass().getResource("/Jedi/First Row/Enhanced Agility/AgilityAvailable.png")).getImage();
			agiImg.setIcon(new ImageIcon(imgAgi));
		}
		agiImg.setBounds(443, 43, 87, 87);
		frmJediExpertise.getContentPane().add(agiImg);
		
		JLabel staImg = new JLabel("");
		staImg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (enhancedSta < 2 && addPoints) {
					availablePoints--;
					enhancedSta++;
					
					Image imgSta = new ImageIcon(this.getClass().getResource("/Jedi/First Row/Enhanced Stamina/StaminaSpent.png")).getImage();
					staImg.setIcon(new ImageIcon(imgSta));
				}
				else if (enhancedSta > 0 && !addPoints) {
					availablePoints++;
					enhancedSta--;
					
					if (enhancedSta == 0) {
						Image imgSta = new ImageIcon(this.getClass().getResource("/Jedi/First Row/Enhanced Stamina/StaminaAvailable.png")).getImage();
						staImg.setIcon(new ImageIcon(imgSta));
					}
				}
			}
		});
		if (enhancedSta == 0) {
			Image imgSta = new ImageIcon(this.getClass().getResource("/Jedi/First Row/Enhanced Stamina/StaminaAvailable.png")).getImage();
			staImg.setIcon(new ImageIcon(imgSta));
		}
		staImg.setBounds(601, 43, 87, 87);
		frmJediExpertise.getContentPane().add(staImg);
		
		Label availablePointsLabel = new Label("Available Points: 45");
		availablePointsLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		availablePointsLabel.setAlignment(Label.CENTER);
		availablePointsLabel.setBounds(10, 10, 115, 22);
		frmJediExpertise.getContentPane().add(availablePointsLabel);
		
		JRadioButton addRadioButton = new JRadioButton("");
		addRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				addPoints = true;
			}
		});
		buttonGroup.add(addRadioButton);
		addRadioButton.setSelected(true);
		addRadioButton.setBounds(103, 40, 21, 23);
		frmJediExpertise.getContentPane().add(addRadioButton);
		
		JRadioButton removeRadioButton = new JRadioButton("");
		removeRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				addPoints = false;
				System.out.println("DEBUG: 'Remove Points' checked state is " + removeRadioButton.isSelected());
			}
		});
		buttonGroup.add(removeRadioButton);
		removeRadioButton.setBounds(103, 66, 21, 23);
		frmJediExpertise.getContentPane().add(removeRadioButton);
		
		Label addLabel = new Label("Add Points");
		addLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		addLabel.setBounds(32, 38, 65, 22);
		frmJediExpertise.getContentPane().add(addLabel);
		
		Label removeLabel = new Label("Remove Points");
		removeLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		removeLabel.setBounds(10, 66, 87, 22);
		frmJediExpertise.getContentPane().add(removeLabel);
		
		JLabel TooltipImg = new JLabel("");
		TooltipImg.setBounds(834, 43, 87, 87);
		frmJediExpertise.getContentPane().add(TooltipImg);
		
		JRadioButton generalRadioButton = new JRadioButton("");
		buttonGroup_1.add(generalRadioButton);
		generalRadioButton.setSelected(true);
		generalRadioButton.setBounds(396, 10, 21, 23);
		frmJediExpertise.getContentPane().add(generalRadioButton);
		
		JRadioButton pathRadioButton = new JRadioButton("");
		pathRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (pathRadioButton.isSelected()) {
					// TODO: Implement Path Selection
					System.out.println("Debug: The Path part of the Jedi expertise is not implemented.");
				}
			}
		});
		buttonGroup_1.add(pathRadioButton);
		pathRadioButton.setBounds(486, 10, 21, 23);
		frmJediExpertise.getContentPane().add(pathRadioButton);
		
		JRadioButton beastMasteryRadioButton = new JRadioButton("");
		beastMasteryRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (beastMasteryRadioButton.isSelected()) {
					// TODO: Implement Beast Mastery Selection
					System.out.println("Debug: The Beast Mastery part of the Jedi expertise is not implemented.");
				}
			}
		});
		buttonGroup_1.add(beastMasteryRadioButton);
		beastMasteryRadioButton.setBounds(648, 10, 21, 23);
		frmJediExpertise.getContentPane().add(beastMasteryRadioButton);
		
		Label generalLabel = new Label("Jedi General");
		generalLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		generalLabel.setBounds(290, 10, 100, 22);
		frmJediExpertise.getContentPane().add(generalLabel);
		
		Label pathLabel = new Label("Path");
		pathLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		pathLabel.setBounds(443, 10, 37, 22);
		frmJediExpertise.getContentPane().add(pathLabel);
		
		Label beastMasteryLabel = new Label("Beast Mastery");
		beastMasteryLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		beastMasteryLabel.setBounds(536, 10, 106, 22);
		frmJediExpertise.getContentPane().add(beastMasteryLabel);
	}
}
