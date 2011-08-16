package shared;

import java.util.Scanner;

import chatai.ChatAI;

public class Initializer 
{
	public static void main(String[] args)
	{
		ChatAI cai = new ChatAI("brain.dat");
		
		/*cai.addSentence("You hate your cable company, right?");
		cai.addSentence("Seems like everyone does.");
		cai.addSentence("Cable television routinely scores lower in customer satisfaction than just about anything else—including congress.");
		cai.addSentence("So why don't you just switch providers?");
		cai.addSentence("Oh yeah, you can't.");
		cai.addSentence("You're so screwed!");
		cai.addSentence("The sad truth is, most Americans don't have a choice of cable providers.");
		cai.addSentence("Sure, there are a lot of cable companies out there, but odds are there's only one you can use.");
		cai.addSentence("While no one cable company dominates the nation, there are a lot of regional cable fiefdoms.");
		cai.addSentence("Live in San Francisco?");
		cai.addSentence("It's Comcast for you.");
		cai.addSentence("Atlanta?");
		cai.addSentence("Cox.");
		cai.addSentence("New York City?");
		cai.addSentence("Time Warner.");
		cai.addSentence("That matters because it translates into high prices and crummy service.");
		cai.addSentence("Nationally speaking, there's plenty of competition.");
		cai.addSentence("But locally, that's just not true.");
		cai.addSentence("For the overwhelming majority of us it's the local cable-opoly, or get bent.");
		cai.addSentence("Which means we pay exorbitant bills, suffer four hour install time windows, and just suck it up when our cable provider throttles our download speeds or caps our bandwidth.");
		cai.addSentence("The only way this changes is with competition.");
		cai.addSentence("When a competing cable company is present, your cable bill typically goes down by 15-percent, and service generally improves.");
		cai.addSentence("But almost nobody has a competing cable company.");
		cai.addSentence("Simply put, you're paying way too much for Nickelodeon.");
		cai.addSentence("The cable industry is a patchwork of micro-monopolies.");
		cai.addSentence("Or more accurately, natural monopolies: situations of little or no competition that doesn't break enough laws to get regulated.");
		cai.addSentence("A natural monopoly occurs when it's so expensive to enter a market that it doesn't make sense for a competitors to come in.");
		cai.addSentence("With cable TV, there's a massive fixed cost to enter a new market—putting in new cable lines.");
		cai.addSentence("So, basically, whoever showed up first—or the company that bought them—has the legacy right of being the local cable company.");
		cai.addSentence("For decades, cable operators were allowed to set up exclusive regional franchises.");
		cai.addSentence("A cable company would come into an area, and more or less tell the municipal area in charge of franchising that it needed an exclusive for the next, say, 12-15 years if it was going to build out lines.");
		cai.addSentence("That ended in 1992 with the Cable Television Consumer Protection and Competition Act, but the damage was done.");
		cai.addSentence("Cable companies had already divided up the nation like Europe colonizing Africa.");
		cai.addSentence("By the time regulation arrived, the land grab was already over.");
		cai.addSentence("The last reliable statistic shows that a mere 2-percent of American markets had a choice of cable providers.");
		cai.addSentence("That's from 2003, the last time the FCC produced a statistic.");
		cai.addSentence("(At least that they could supply us with.)");
		cai.addSentence("You may be surprised to learn that the FCC doesn't have anything to do with cable franchising.");
		cai.addSentence("Nor does the FTC.");
		cai.addSentence("Counties and cities were the agencies responsible for allowing cable franchises.");
		cai.addSentence("That is changing, slightly.");
		cai.addSentence("More than 20 states now have franchise authority, due largely to intensive lobbying by telcos like Verizon and AT&T.");
		cai.addSentence("You know you're fucked when you're relying on AT&T to make things better.");
		cai.addSentence("Ultimately, this patchwork of local regulation means cable companies themselves are often more powerful than the body overseeing them.");
		cai.addSentence("And as long as none of the micro-monopolies grows too large nationally, it can continue to control the local weather.");
		cai.addSentence("But what about those second cable companies that some people have?");
		cai.addSentence("They're typically overbuilders, a company that builds new lines in an area where one cable company already exists.");
		cai.addSentence("They tend to be quite small.");
		cai.addSentence("The best known, for example, is probably WideOpenWest Networks, or WOW.");
		cai.addSentence("WOW has just 410,000 subscribers.");
		cai.addSentence("And that's because it's really, really hard for a second company to come into an existing market.");
		cai.addSentence("While everyone has a right to access the poles, the same isn't true of the wires that hang from them.");
		cai.addSentence("In short, if you're an upstart cable company coming into a new area, you have to run your own lines.");
		cai.addSentence("It's very expensive, and it also means you can easily be crushed by the existing monopoly.");
		cai.addSentence("One cable industry insider, who would only speak on background, explained how it works:First you have to overcome a mishmash of local regulations.");
		cai.addSentence("You have to get a permit to come in, which can be a legal hassle, with a wait time of many months just to get approval.");
		cai.addSentence("Then its time to build.");
		cai.addSentence("To build a new network and make it price-competitive, you have to reach 100-percent of customers in that area.");
		cai.addSentence("Which means building an extensive network of lines, all the way to the door.");
		cai.addSentence("If you're very lucky you may capture 10 to 20-percent of the market.");
		cai.addSentence("You do that by offering steep discounts on bundled services.");
		cai.addSentence("This gets you new customers, but at a loss.");
		cai.addSentence("Then, Comcast, or Cablevision, or Time Warner—or whichever provider is dominant in the area—comes along behind you with sweetheart deals for any of its customers who were leaving.");
		cai.addSentence("They offer discounted packages and teaser rates.");
		cai.addSentence("Poof.");
		cai.addSentence("They're gone.");
		cai.addSentence("That's five percent of the market.");
		cai.addSentence("Now you've spent a fortune on new lines and infrastructure, for very few new customers.");
		cai.addSentence("So there's very little financial incentive for a competitor to try to build.");
		cai.addSentence("It's just too damn hard to build a customer base.");
		cai.addSentence("To do that, you need to be a giant company to begin with.");
		cai.addSentence("Like, say, a telco.");
		cai.addSentence("If you're lucky, you may have the option for Verizon FiOS or AT&T U-Verse.");
		cai.addSentence("But probably not.");
		cai.addSentence("Verizon only passes (cable lingo for is available at) 15 million premises nationwide, and has just 3.");
		cai.addSentence("7 million video subscribers.");
		cai.addSentence("AT&T is even smaller, at 3.");
		cai.addSentence("2 million.");
		cai.addSentence("Comcast, by comparison, has 22 million video subscribers.");
		cai.addSentence("What's more, there's no evidence that telcos are having a positive effect on pricing.");
		cai.addSentence("In fact, in some areas where AT&T managed to get the laws changed, like Michigan, prices have gone up.");
		cai.addSentence("But wait!");
		cai.addSentence("What about satellite?");
		cai.addSentence("Doesn't satellite fix everything?");
		cai.addSentence("No.");
		cai.addSentence("According to the Government Accountability Office, satellite services have little-to-no effect on cable prices.");
		cai.addSentence("(And besides, satellite service is terrible.)");
		cai.addSentence("Who doesn't want to watch TV when it's overcast outside?");
		cai.addSentence("Ultimately what all of this means is that consumers are left with little recourse.");
		cai.addSentence("Because there's plenty of competition nationally, nobody is looking out for you locally.");
		cai.addSentence("Except us.");
		cai.addSentence("All this week, Gizmodo is going to take a long-hard look at the cable industry, and how to improve it.");
		cai.addSentence("We want to fix cable, and we need your help to make it happen.");
		cai.addSentence("We want to hear your horror stories of bad cable experiences, and your ideas of how to make things better.");
		cai.addSentence("We'll collect the best of these and publish them on Friday.");
		cai.addSentence("Tweet us with the hashtag #fixcable, email us at tips@gizmodo.");
		cai.addSentence("com with #fixcable in the subject line, or just fill in the form at the bottom of this page.");
		cai.addSentence("Come on.");
		cai.addSentence("We are totally going to do this thing.");
		
		System.out.println(cai.generateSentence());
		System.out.println(cai.generateSentence());
		System.out.println(cai.generateSentence());
		System.out.println(cai.generateSentence());
		System.out.println(cai.generateSentence());
		System.out.println(cai.generateSentence());
		System.out.println(cai.generateSentence());
		System.out.println(cai.generateSentence());
		System.out.println(cai.generateSentence());
		System.out.println(cai.generateSentence());
		System.out.println(cai.generateSentence());
		System.out.println(cai.generateSentence());*/
		
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.print(">");
			cai.addSentence(scan.nextLine());
			System.out.println(cai.generateSentence());
		}
		
		
	}
}
