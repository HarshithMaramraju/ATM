package com.oops;

import java.util.Scanner;

public class ATM 
{

	public static void main(String[] args) 
	{
		int balance = 2000;
		int currentBalance = 10000;
		int pin = 2002;
		Scanner scanner = new Scanner(System.in);
		//int pin = scanner.nextInt();
		System.out.println("welcome to ATM");
		System.out.println("press 1 to inset your card");
		System.out.println("press 2 to exit");
		int a = scanner.nextInt();	
		if (a==1)
		{
			System.out.println("select language");
		}
		else
		{
			System.out.println("thank you visit again");
		}
		System.out.println("1 for hindi");
		System.out.println("2 for telugu");
		System.out.println("3 for engilsh");
		System.out.println("select 4 for exit");
		int b = scanner.nextInt();
		if (b==1)
		{
			System.out.println("निकासी के लिए 1 का चयन करें");
			System.out.println("शेष राशि की जांच के लिए 2 का चयन करें'");
			System.out.println("डिपॉजिट के लिए 3 चुनें");
			int c = scanner.nextInt();
			if (c==1)
			{
				System.out.println("बचत के लिए 1 दबाएँ");
				System.out.println("करंट के लिए 2 दबाएँ");
				int money = scanner.nextInt();
				if (money==1)
				{
					System.out.println("enter your pin");
					int pin1 = scanner.nextInt();
					if (pin == pin1)
					{
						System.out.println("पैसा दर्ज करें");
						int moneySaving = scanner.nextInt();
						if (moneySaving>balance)
						{
							System.out.println("अपर्याप्त राशि कृपया पुनः प्रयास करें");
						}
						else
						{
							System.out.println("कृपया अपना नकद संग्रह करें");
							System.out.println("कृपया अपना कार्ड ले लें");
						}
						char y = 'y';
						char n = 'n';
						System.out.println("क्या आप रसीद चाहते हैं?");
						System.out.println("रसीद प्रिंट करने के लिए y दबाएँ");
						System.out.println("बाहर निकलने के लिए n दबाएँ");
						char x = scanner.next().charAt(0);
						if (x==y)
						{
							System.out.println("निकाली गई राशि है:"+moneySaving);
						}
						else
						{
							System.out.println("पुनः आने के लिए धन्यवाद");
						}	
					}
					else
					{
						System.out.println("incorrect pin");
						System.out.println("collect your card");
					}
					if (money==2)
					{
						System.out.println("enter your pin");
						int pin2 = scanner.nextInt();
						if (pin == pin2)
						{
							System.out.println("पैसा दर्ज करें");
							int moneySaving = scanner.nextInt();
							if (moneySaving>currentBalance)
							{
								System.out.println("अपर्याप्त राशि कृपया पुनः प्रयास करें");
							}
							else
							{
								System.out.println("कृपया अपना नकद संग्रह करें");
								System.out.println("कृपया अपना कार्ड ले लें");
							}
							char y = 'y';
							char n = 'n';
							System.out.println("क्या आप रसीद चाहते हैं?");
							System.out.println("रसीद प्रिंट करने के लिए y दबाएँ");
							System.out.println("बाहर निकलने के लिए n दबाएँ");
							char x = scanner.next().charAt(0);
							if (x==y)
							{
								System.out.println("निकाली गई राशि है:"+moneySaving);
							}
						else
						{
							System.out.println("पुनः आने के लिए धन्यवाद");
						}
					}
					else
					{
						System.out.println("incorret pin");
						System.out.println("collect your card");
					}
					}
				}
			}
			else if (c==2) 
			{
				System.out.println("आपके खाते में शेष राशि है:"+balance);
			}
			else if (c==3) 
			{
				System.out.println("जमा करने के लिए पैसे दर्ज करें");
				int moneyDeposite = scanner.nextInt();
				System.out.println("पैसा जमा"+moneyDeposite);
				int total =balance+moneyDeposite;
				System.out.println("कुल शेष है"+total);
				System.out.println("सफलतापूर्वक जमा किया गया");
			}
		}
		else if (b==2)
		{
			System.out.println("వెడ్డ్‌డ్రావల్ కోసం 1ని ఎంచుకోండి");
			System.out.println("బ్యాలెన్స్ ఎంక్వైరీ కోసం 2ని ఎంచుకోండి");
			System.out.println("డిపాజిట్ కోసం 3ని ఎంచుకోండి");

			int c = scanner.nextInt();
			if (c==1)
			{
				System.out.println("పొదుపు కోసం 1 నొక్కండి");
				System.out.println("కరెంట్ కోసం 2 నొక్కండి");
				int money = scanner.nextInt();
				if (money==1)
				{
					System.out.println("enter pin");
					int pin1 = scanner.nextInt();
					if (pin==pin1) 
					{
						System.out.println("డబ్బును నమోదు చేయండి");
						int moneySaving = scanner.nextInt();
						if (moneySaving>balance)
						{
							System.out.println("తగినంత మొత్తం లేదు దయచేసి మళ్లీ ప్రయత్నించండి");
						}
						else
						{
							System.out.println("దయచేసి మీ నగదును సేకరించండి");
							System.out.println("దయచేసి మీ కార్డును సేకరించండి");
						}
						char y = 'y';
						char n = 'n';
						System.out.println("మీకు రసీదు కావాలా");
						System.out.println("రసీదుని ముద్రించడానికి y నొక్కండి");
						System.out.println("నిష్క్రమించడానికి n నొక్కండి");
						char x = scanner.next().charAt(0);
						if (x==y)
						{
							System.out.println("వెనక్కి తీసుకున్న మొత్తం:"+moneySaving);
						}
						else
						{
							System.out.println("మళ్ళీ సందర్శించినందుకు ధన్యవాదాలు");
						}
					}
					else
					{
						System.out.println("incorrect pin");
						System.out.println("collect your card");
					}

				}
				if (money==2)
				{
					System.out.println("enter pin");
					int pin1 = scanner.nextInt();
					if (pin==pin1) 
					{
						System.out.println("డబ్బును నమోదు చేయండి");
						int moneySaving = scanner.nextInt();
						if (moneySaving>currentBalance)
						{
							System.out.println("తగినంత మొత్తం లేదు దయచేసి మళ్లీ ప్రయత్నించండి");
						}
						else
						{
							System.out.println("దయచేసి మీ నగదును సేకరించండి");
							System.out.println("దయచేసి మీ కార్డును సేకరించండి");
						}
						char y = 'y';
						char n = 'n';
						System.out.println("మీకు రసీదు కావాలా");
						System.out.println("రసీదుని ముద్రించడానికి y నొక్కండి");
						System.out.println("నిష్క్రమించడానికి n నొక్కండి");
						char x = scanner.next().charAt(0);
						if (x==y)
						{
							System.out.println("వెనక్కి తీసుకున్న మొత్తం:"+moneySaving);
						}
						else
						{
							System.out.println("మళ్ళీ సందర్శించినందుకు ధన్యవాదాలు");
						}
					}
					else
					{
						System.out.println("incorrect pin");
						System.out.println("collect your card");
					}
				}
			}
			else if (c==2)
			{
				System.out.println("ఖాతాలో ప్రస్తుత బ్యాలెన్స్:"+balance);
			}
			else if (c==3)
			{
				System.out.println("మీ డిపాజిట్ మొత్తాన్ని నమోదు చేయండి");
				int moneyDeposite = scanner.nextInt();
				System.out.println("డబ్బు డిపాజిట్ చేయబడింది"+moneyDeposite);
				int total =balance+moneyDeposite;
				System.out.println("మొత్తం బ్యాలెన్స్ ఉంది"+total);
				System.out.println("విజయవంతంగా జమ చేయబడింది");
			}
		}
		else if (b==3)
		{
			System.out.println("select 1 for widthdrawal");
			System.out.println("select 2 for balance enquiry");
			System.out.println("select 3 for diposit");

			int c = scanner.nextInt();
			if (c==1)
			{
				System.out.println("press 1 for savings");
				System.out.println("press 2 for current");
				int money = scanner.nextInt();
				if (money==1)
				{
					System.out.println("enter your pin");
					int pin1 = scanner.nextInt();
					if (pin == pin1)
					{


						System.out.println("enter money");
						int moneySaving = scanner.nextInt();
						if (moneySaving>balance)
						{
							System.out.println("insufficient amount please try again");
						}
						else
						{
							System.out.println("please collect your cash");
							System.out.println("please collect your card");
						}

						char y = 'y';
						char n = 'n';
						System.out.println("do you want recipt");
						System.out.println("press y to print recipt");
						System.out.println("press n to exit");
						char x = scanner.next().charAt(0);
						if (x==y)
						{
							System.out.println("the amount withdrawn is:"+moneySaving);
						}
						else
						{
							System.out.println("thank you visit again");
						}
					}
					else
					{
						System.out.println("incorrect pin");
						System.out.println("collect your card");
					}
				}
				if (money==2)
				{
					System.out.println("enter your pin");
					int pin1 = scanner.nextInt();
					if (pin==pin1)
					{


						System.out.println("enter money");
						int moneySaving = scanner.nextInt();
						if (moneySaving>currentBalance)
						{
							System.out.println("insufficient amount please try again");
						}
						else
						{
							System.out.println("please collect your cash");
							System.out.println("please collect your card");
						}
						char y = 'y';
						char n = 'n';
						System.out.println("do you want recipt");
						System.out.println("press y to print recipt");
						System.out.println("press n to exit");
						char x = scanner.next().charAt(0);
						if (x==y)
						{
							System.out.println("the amount withdrawn is:"+moneySaving);
						}
						else
						{
							System.out.println("thank you visit again");
						}
					}
					else
					{
						System.out.println("incorrect pin");
						System.out.println("collect your card");
					}
				}
			}
			else if (c==2)
			{
				System.out.println(balance);
			}
			else if(c==3)
			{
				System.out.println("enterr money to deposite");
				int moneyDeposite = scanner.nextInt();
				System.out.println("money deposited "+moneyDeposite);
				int total =balance+moneyDeposite;
				System.out.println("total balance is "+total);
				System.out.println("deposited successfull");
			}
		}
		else
		{
			System.out.println("exit");
		}
	}
}
