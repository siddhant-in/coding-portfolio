import java.util.*;

public class QuestionBank {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		do {
			Scanner xyz = new Scanner(System.in);
			System.out.println("1:Add New Question");
			System.out.println("2:View All Questions");
			System.out.println("3:Search Question ");
			System.out.println("4:Delete Question By Id");
			System.out.println("Enter your choice");
			int choice = xyz.nextInt();
			switch (choice) {
				case 1:
					System.out.println("Enter qid name and all options and answer");
					int qid = xyz.nextInt();
					xyz.nextLine();
					String question = xyz.nextLine();
					String op1 = xyz.nextLine();
					String op2 = xyz.nextLine();
					String op3 = xyz.nextLine();
					String op4 = xyz.nextLine();
					String ans = xyz.nextLine();
					Question q = new Question(qid, question, op1, op2, op3, op4, ans);
					al.add(q);
					break;
				case 2:
					Iterator i = al.iterator();
					while (i.hasNext()) {
						Object obj = i.next();
						Question ques = (Question) obj;
						System.out.println(ques.getQid() + "\t" + ques.getName() + "\t" + ques.getOp1() + "\t"
								+ ques.getOp2() + "\t" + ques.getOp3() + "\t" + ques.getOp4() + "\t" + ques.getAnser());
					}
					break;
				case 3:
					System.out.println("Enter question id for search question");
					int questionId = xyz.nextInt();
					i = al.iterator();
					boolean flag = false;
					while (i.hasNext()) {
						Object obj = i.next();
						Question ques = (Question) obj;
						if (ques.getQid() == questionId) {
							flag = true;
							break;
						}
					}
					if (flag) {
						System.out.println("Question found in database or collection");
					} else {
						System.out.println("Question not found");
					}
					break;
				case 4:
					System.out.println("Enter question id for search question");
					questionId = xyz.nextInt();
					i = al.iterator();
					flag = false;
					while (i.hasNext()) {
						Object obj = i.next();
						Question ques = (Question) obj;
						if (ques.getQid() == questionId) {
							int index = al.indexOf(ques);
							if (index != -1) {
								al.remove(index);
								flag = true;
								break;
							}
						}
					}
					if (flag) {
						System.out.println("Question removed from collection");
					} else {
						System.out.println("Question not found");
					}
					break;
				default:
					System.out.println("Wrong choice");
			}

		} while (true);
	}
}