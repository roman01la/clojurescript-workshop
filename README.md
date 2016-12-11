# ClojureScript Workshop

Repository of related materials to the workshop

[![Join the chat at https://gitter.im/roman01la/clojurescript-workshop](https://badges.gitter.im/roman01la/clojurescript-workshop.svg)](https://gitter.im/roman01la/clojurescript-workshop)

[📺 Screencast (RU)](https://www.youtube.com/playlist?list=PLHOTezm7WWknZXg8IrRSRLZ-nIlpYUAyU)

## Table of contents

- [Why Lisp?](#why-lisp)
- [Requirements](#requirements)
- [Preparation](#preparation)
- [Links](#links)
- [Books](#books)
- [Job Boards](#job-boards)

## Why Lisp?

- **Ex­pres­sive­ness** — when a language allows you to put *more meaning with less code*. It is not just about con­ci­sion, but also *pre­ci­sion*, *read­abil­ity*, *flex­i­bil­ity* and *po­ten­tial for abstraction*.
- **Everything is an expression**. Most languages has both *statements* and *expressions*, which you can not really combine together, but in Lisp everything is an expression. A single uniform interface allows to compose everything naturally. Take for example Lego blocks: you can build whatever you want easily because those blocks are following the same rule of composition.
- **An ex­pres­sion is ei­ther a sin­gle value or a list**. There are single values like strings and numbers. But function calls and list data structure are all lists. So basically the whole point of writing a Lisp program is to combine together lists of lists and single values. This gives the same power of composition similar to expressions.
- **Func­tional pro­gram­ming**. Lisps are considered to be functional languages (there are also OOP capabilities). It means they are focused on avoiding data mutation and state. This allows developers to build truly reusable components and structure programs in a clean way. You can see that all new programming languages are mostly functional, so we can say that functional programming style has proved to be a good tool when building software.

*The list above is inspired by an article [“Why Racket? Why Lisp?”](http://practicaltypography.com/why-racket-why-lisp.html).*

## Requirements

It's nice to know the following...

- *React.js* library ([learn](http://blog.andrewray.me/reactjs-for-stupid-people/))
- State management solutions like *Flux* ([learn](http://blog.andrewray.me/flux-for-stupid-people/))
- A concept of *immutability* ([learn](https://miles.no/blogg/why-care-about-functional-programming-part-1-immutability))
- Basics of *functional programming* ([learn](http://www.slideshare.net/velvetflair/functional-programming-fundamentals))

## Preparation

You have to be prepared for the workshop, so we don't have to waste time for this.

### Java

Make sure you have [Java](http://www.oracle.com/technetwork/java/javase/downloads/index.html) 1.6 or greater.

### Leiningen

Install via *Homebrew*: `brew install leiningen` or [other package managers](https://github.com/technomancy/leiningen/wiki/Packaging).

Or using shell script:

1. Download the [lein script](https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein) (or on Windows [lein.bat](https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein.bat))
2. Place it on your `$PATH` where your shell can find it (eg. `~/bin`)
3. Set it to be executable (`chmod a+x ~/bin/lein`)
4. Run it (`lein`) and it will download the self-install package

Or with [Windows installer](http://leiningen-win-installer.djpowell.net/).

### Readline wrapper

`brew install rlwrap`

*or*

1. Clone the repo: https://github.com/hanslub42/rlwrap
2. Execute

```
./configure
make
make install
```

### ClojureScript REPL

Install [Lumo](https://github.com/anmonteiro/lumo/)

via *NPM*
```
npm i -g lumo-cljs
```

via *Homebrew*
```
brew install lumo
```

### Configure your editor

#### Atom

Follow [this manual](https://gist.github.com/jasongilman/d1f70507bed021b48625). You don't have to install and configure everything, the important parts are: [Parinfer](https://github.com/oakmac/atom-parinfer) plugin, [language-clojure](https://gist.github.com/jasongilman/d1f70507bed021b48625#language-clojure) settings, [lisp-paredit](https://gist.github.com/jasongilman/d1f70507bed021b48625#lisp-paredit) settings and [Atom Settings](https://gist.github.com/jasongilman/d1f70507bed021b48625#atom-settings) sections.

#### Sublime Text

- [sublime-lispindent](https://github.com/odyssomay/sublime-lispindent)
- [sublime-text-parinfer](https://github.com/oakmac/sublime-text-parinfer)

#### VS Code

- [vscode-parinfer](https://github.com/narma/vscode-parinfer)

#### Vim

- [vim-parinfer](https://github.com/bhurlow/vim-parinfer)
- [vim-fireplace](https://github.com/tpope/vim-fireplace)

## Links

- [Community Resources](http://clojure.org/community/resources)
- [ClojureScript REPL](http://jaredforsyth.com/reepl/)
- [ClojureScript Synonyms](https://kanaka.github.io/clojurescript/web/synonym.html)
- [ClojureScript Cheatsheet](http://cljs.info/cheatsheet/)
- [ClojureScript API](http://cljs.github.io/api/)
- [ClojureDocs](https://clojuredocs.org/)
- [The Clojure Style Guide](https://github.com/bbatsov/clojure-style-guide)
- [Quickref for Clojure Core](https://clojuredocs.org/quickref)
- [ClojureScript Tutorial](https://www.niwi.nz/cljs-workshop/)
- [ClojureScript Koans](http://clojurescriptkoans.com/)
- [Video course (RU)](https://www.youtube.com/playlist?list=PLHOTezm7WWkmk_NxC51xwnC2YsAut_5vX)
- [re-frame](https://github.com/Day8/re-frame)
- [Clojure Jobs](https://purelyfunctional.tv/resources/clojure-jobs-resources/)

## Books
- [ClojureScript Unraveled](https://funcool.github.io/clojurescript-unraveled/)
- [ClojureScript: Up and Running](http://shop.oreilly.com/product/0636920025139.do)
- [Clojure for the Brave and True](http://www.braveclojure.com/)
- [Casting SPELs in Lisp](http://www.lisperati.com/casting.html)
- [Land of Lisp](http://landoflisp.com/)
- [The Little Schemer](https://mitpress.mit.edu/books/little-schemer)
- [The Seasoned Schemer](https://mitpress.mit.edu/books/seasoned-schemer)

## Job Boards
- [jobs.braveclojure.com](https://jobs.braveclojure.com/)
- [jobs.functionalworks.com](https://jobs.functionalworks.com/)
- [functionaljobs.com](https://functionaljobs.com/)
- [remoteok.io/remote-clojure-jobs](https://remoteok.io/remote-clojure-jobs)
- [More Clojure job resources](https://purelyfunctional.tv/resources/clojure-jobs-resources/)
