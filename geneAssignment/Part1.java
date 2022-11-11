
public class Part1 {

  public String findSimpleGene(String dna) {
    int start = dna.indexOf("atg");
    
    if (start == -1)
      return "";
    
    int stop = dna.indexOf("taa", start+3);

    if (stop == -1)
      return "";

    if ((stop - start)%3 == 0) {
      return dna.substring(start, stop+3);
    }

    return "";
  }

  public void testSimpleGene() {
    String noATG = "ccctaaaaaaaaaaaaag";
		String noTAA = "atggggttatatag";
    String noATGTAA = "ccctttttggggggg";
		String withATGTAA = "atggggttatataag";
    String withATGTAA3 = "atggggttataag";
		String withATGTAAno3 = "atggggttatataag";
    System.out.printf("DNA string :%-20s  Gene: %-20s\n",noATG,findSimpleGene(noATG));
    System.out.printf("DNA string :%-20s  Gene: %-20s\n",noTAA,findSimpleGene(noTAA));
    System.out.printf("DNA string :%-20s  Gene: %-20s\n",noATGTAA,findSimpleGene(noATGTAA));
    System.out.printf("DNA string :%-20s  Gene: %-20s\n",withATGTAA,findSimpleGene(withATGTAA));
    System.out.printf("DNA string :%-20s  Gene: %-20s\n",withATGTAA3,findSimpleGene(withATGTAA3));
    System.out.printf("DNA string :%-20s  Gene: %-20s\n",withATGTAAno3,findSimpleGene(withATGTAAno3));
    
  }

  public static void main(String args[]) {
    Part1 test = new Part1();
    test.testSimpleGene();
  }
}