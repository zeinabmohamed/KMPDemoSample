//
//  ViewController.swift
//  KMPIOSDemo
//
//  Created by Zeinab Abdelmawla on 10/20/19.
//  Copyright © 2019 Zeinab Abdelmawla. All rights reserved.
//

import UIKit
import shared

class ViewController: UIViewController , MoviesView {
   

    lazy var presenter : MoviesPresenter  = MoviesPresenter(view : self ,dataSource: DataSource())
    
    @IBOutlet weak var greetingUiLabel: UILabel!
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        greetingUiLabel.text = Greeting().getGreeting()
        
        presenter.getMovies()
    }
    
    func movies(result: String) {
           print(result)
    }
       
    override func viewWillAppear(_ animated: Bool) {
        presenter.onCreate()
    }

    
    override func viewWillDisappear(_ animated: Bool) {
        presenter.onDestroy()
    }

}

